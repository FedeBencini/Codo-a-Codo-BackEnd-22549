package ar.com.codoacodo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.db.AdministradorDeConexiones;
import ar.com.codoacodo.domain.Articulo;

public class ArticuloDAOMysqlImpl implements IArticuloDAO {

	public Articulo getById(Long id) throws Exception {

		// pasos para conectarme a DB
		// 1- Obtener conexión con java.sql.Connection
		Connection connection = AdministradorDeConexiones.getConnection();

		// 2- Armar statement con el java.sql.Statement
		Statement statement = connection.createStatement();

		// 3- Armar sql y obtener resultados: java.sql.ResultSet
		String sql = "select * from articulo where id = " + id;
		ResultSet resultSet = statement.executeQuery(sql);

		// interface i = new ClaseQueImplementa()
		Articulo articulo = null;

		// 4- Extraer los datos
		if (resultSet.next()) {
			articulo = fromResultSetToArticulo(resultSet);
		}

		return articulo;
	}

	// .

	public List<Articulo> findAll() throws Exception {
		// pasos para conectarme a DB
		// 1- Obtener conexión con java.sql.Connection
		Connection connection = AdministradorDeConexiones.getConnection();

		// 2- Armar statement con el java.sql.Statement
		Statement statement = connection.createStatement();

		// 3- Armar sql y obtener resultados: java.sql.ResultSet
		String sql = "select * from articulo";
		ResultSet resultSet = statement.executeQuery(sql);

		// interface i = new ClaseQueImplementa()
		List<Articulo> articulos = new ArrayList<>();

		// 4- Extraer los datos
		while (resultSet.next()) {
			articulos.add(fromResultSetToArticulo(resultSet));
		}

		return articulos;
	}

	public Articulo fromResultSetToArticulo(ResultSet resultSet) throws Exception {
		Long idDb = resultSet.getLong("id");
		String tituloDB = resultSet.getString("titulo");
		String autorDB = resultSet.getString("autor");
		Float precioDB = resultSet.getFloat("precio");
		String imgDB = resultSet.getString("img");

		return new Articulo(idDb, tituloDB, autorDB, precioDB, imgDB);
	}

	public void create(Articulo articulo) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		/*-                                                                     1  2  3  4 */
		String sql = "insert into articulo (titulo, autor, precio, img) values (?, ?, ?, ?)";
		/*-                                                              return generated keys devuelve id*/
		PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

		statement.setString(1, articulo.getTitulo());
		statement.setString(2, articulo.getAutor());
		statement.setFloat(3, articulo.getPrecio());
		statement.setString(4, articulo.getImg());

		statement.execute();
		ResultSet res = statement.getGeneratedKeys();
		if (res.next()) {
			articulo.setId(res.getLong(1));
		}
	}

	public void delete(Long id) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		Statement statement = connection.createStatement();
		String sql = "delete from articulo where id = " + id;
		int resultset = statement.executeUpdate(sql);
		System.out.println(resultset);
	}

	public void update(Articulo articulo) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		/*-                                      1        2         3      4          5 */
		String sql = "update articulo set titulo=?, autor=?, precio=?, img=? where id=?";
		// return generated keys devuelve id
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, articulo.getTitulo());
		statement.setString(2, articulo.getAutor());
		statement.setFloat(3, articulo.getPrecio());
		statement.setString(4, articulo.getImg());
		statement.setLong(5, articulo.getId());

		statement.execute();
	}

	public List<Articulo> search(String claveBusqueda) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		Statement statement = connection.createStatement();
		String sql = "select * from articulo where titulo like '%" + claveBusqueda + "%'";
		ResultSet resultSet = statement.executeQuery(sql);
		List<Articulo> articulos = new ArrayList<>();
		while (resultSet.next()) {
			articulos.add(fromResultSetToArticulo(resultSet));
		}

		return articulos;
	}
}
