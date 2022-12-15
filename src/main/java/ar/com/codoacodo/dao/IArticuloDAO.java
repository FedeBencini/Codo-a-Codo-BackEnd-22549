package ar.com.codoacodo.dao;

import java.util.List;

import ar.com.codoacodo.domain.Articulo;

public interface IArticuloDAO {

	public Articulo getById(Long id) throws Exception;

	// java collection framework
	/*-
	 * var edades = new ArrayList<Articulo>();
	 * List<Articulo> edades = new ArrayList<>();
	 * ArrayList<Articulo> edades = new ArrayList<>();
	 * edades.add(new Articulo(...));
	 */
	// select * from articulos N >=0
	public List<Articulo> findAll() throws Exception;

	// insert into ARTICULO (c1,c2...cn) values(v1,v2...vn)
	public void create(Articulo articulo) throws Exception;

	// delete from articulo where id = id
	public void delete(Long id) throws Exception;

	// update articulo set c1=v1, c2=v2...., cN=vN where id = id
	public void update(Articulo articulo) throws Exception;

	public List<Articulo> search(String claveBusqueda) throws Exception;
}
