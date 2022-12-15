<nav class="navbar navbar-expand-lg bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="<%=request.getContextPath()%>">Navbar</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page"
					href="<%=request.getContextPath()%>/FindAllArticuloController">Listado</a>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">
						Trabajos CodoACodo </a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item" href="#">HTML</a></li>
						<li><a class="dropdown-item" href="#">JS</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="#">BOOTSTRAP</a></li>
						<li><a class="dropdown-item" href="#">DB</a></li>
					</ul></li>
			</ul>
			<form class="d-flex" role="search"
				action="<%=request.getContextPath()%>/SearchArticuloController">
				<input class="form-control me-2" type="search" name="claveBusqueda"
					placeholder="Buscar" aria-label="Search">
				<button class="btn btn-outline-success" type="submit">Buscar</button>
			</form>
		</div>
	</div>
</nav>