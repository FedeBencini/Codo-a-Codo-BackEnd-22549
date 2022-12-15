<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Index Controllers</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<!-- Navbar -->
	<jsp:include page="navbar.jsp"></jsp:include>
	<!-- Formulario -->
	<main class="container">
		<h1>Nuevo Producto</h1>
		<div class="row">
			<div class="col-12 mt-2">
				<form class="row g-3 needs-validation" novalidate
					action="<%=request.getContextPath()%>/CreateArticuloController"
					method="POST">
					<div class="col-md-4">
						<label for="validationCustom01" class="form-label">Titulo</label>
						<input type="text" class="form-control" name="titulo"
							id="validationCustom01" value="" placeholder="El Título" required>
						<div class="valid-feedback">El título es válido.</div>
					</div>
					<div class="col-md-4">
						<label for="validationCustom02" class="form-label">Autor</label> <input
							type="text" class="form-control" name="autor"
							id="validationCustom02" value="" placeholder="Perez, Juan"
							required>
						<div class="valid-feedback">El autor es válido.</div>
					</div>
					<div class="col-md-4">
						<label for="validationCustom03" class="form-label">Precio</label>
						<input type="number" class="form-control" name="precio"
							id="validationCustom03" value="" placeholder="123.45" required>
						<div class="valid-feedback">El precio es válido.</div>
					</div>
					<div class="col-md-6">
						<label for="validationCustom04" class="form-label">Link
							Imagen</label> <input type="file" class="form-control" name="img"
							id="validationCustom04" required>
						<div class="valid-feedback">Link de imagen es válido.</div>
					</div>
					<div class="col-md-3">
						<label for="validationCustom05" class="form-label">Tipo
							Artículo</label> <select class="form-select" name="tipoArticulo"
							id="validationCustom05">
							<option selected disabled value="">Elige...</option>
							<option>Libro</option>
							<option>Música</option>
						</select>
						<div class="invalid-feedback">Por favor, seleccione un tipo
							de artículo.</div>
					</div>
					<div class="col-md-3">
						<label for="validationCustom06" class="form-label">Código
							/ ISBN</label> <input type="number" class="form-control" name="codigo"
							id="validationCustom06" value="">
						<div class="valid-feedback">El autor es válido.</div>
					</div>
					<!-- 
					<div class="col-12">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" value=""
								id="invalidCheck" required> <label
								class="form-check-label" for="invalidCheck"> Agree to
								terms and conditions </label>
							<div class="invalid-feedback">You must agree before
								submitting.</div>
						</div>
					</div>
				 	-->
					<div class="col-12">
						<button class="btn btn-primary" type="submit">Crear Nuevo</button>
					</div>
				</form>
			</div>
		</div>
	</main>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
</body>
</html>

