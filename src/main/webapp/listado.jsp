<!doctype html>
<%@page import="ar.com.codoacodo.domain.Articulo"%>
<%@page import="java.util.List"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<!-- Navbar -->
	<jsp:include page="navbar.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<h1>Listado de Productos</h1>
			<div class="col-12 mt-2">
				<table class="table table-hover">
					<thead>
						<tr class="table-dark">
							<th scope="col">#</th>
							<th scope="col">Título</th>
							<th scope="col">Autor</th>
							<th scope="col">Precio</th>
							<th scope="col">Imagen</th>
							<th scope="col">&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<!-- Iterar sobre la lista de articulos cargados en controller -->
						<%
						// Capturar el listado del objeto request
						Float total = 0f;
						List<Articulo> articulos = (List<Articulo>) request.getAttribute("articulos");
						for (Articulo articulo : articulos) {
							total += articulo.getPrecio();
						%>
						<tr>
							<th scope="row"><%=articulo.getId()%></th>
							<td><%=articulo.getTitulo()%></td>
							<td><%=articulo.getAutor()%></td>
							<td><%=articulo.getPrecio()%></td>
							<td><%=articulo.getImg()%></td>
							<td><a class="btn btn-info m-1"
								href="<%=request.getContextPath()%>/UpdateArticuloController?id=<%=articulo.getId()%>">Editar</a>
								<button type="button" class="btn btn-danger m-1"
									data-bs-toggle="modal" data-bs-target="#exampleModal"
									onclick="setId(<%=articulo.getId()%>)">Eliminar</button></td>
						</tr>
						<%
						}
						%>
					</tbody>
					<tfoot>
						<tr class="table-dark">
							<td colspan="3" align="right">
								Total $ 
							</td>
							<td colspan="4">
								<%=total%>
							<td>
						</tr>
					</tfoot>
				</table>
			</div>
		</div>
	</div>
	<!-- Modal para botones -->
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<form
					action="<%=request.getContextPath()%>/DeleteArticuloController">
					<input type="hidden" name="id" id="id">
					<div class="modal-header">
						<h1 class="modal-title fs-5" id="exampleModalLabel">Eliminar
							artículo</h1>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<div class="modal-body">¿Está seguro que desea eliminar
						artículo?</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-bs-dismiss="modal">Cancelar</button>
						<button type="submit" class="btn btn-danger">Eliminar</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
	<script type="text/javascript">function setId(id) {document.getElementById('id').value=id}</script>
</body>
</html>