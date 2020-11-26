<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="layouttopo.jsp"></jsp:include>

<div class="container">



	<c:forEach var="p" items="${contas}">
		<div class="card text-center" style="margin: 80px auto; width: 50%;">
			<div class="card-header font-weight-bold">
				<p>Seja bem vindo</p>
				<h6>${p.getNome()}</h6>
					<a style="color:#fff" class="btn font-weight-bold" href="/logout">Sair</a>

			</div>
			<div class="card-body" style="height: 240px;">
				<p style="margin: 32px auto;" class="card-text">${p.getEmail()}</p>
				<div class="edits">
					<a class="btn edit" href="/alterarconta?iduser=${p.getIduser()}">Editar</a>
					<a class="btn btn-danger"
						href="/excluirconta?iduser=${p.getIduser()}">Excluir</a>
				</div>
			</div>
		</div>
	</c:forEach>
</div>

<style>
.edits {
	justify-content: space-evenly;
	margin: 100px auto;
}

.edit, .card-header {
	background-color: #2E2759;
	color: #fff;
}

.edit:hover {
	background-color: #38325E;
	color: #fff;
}
</style>

<jsp:include page="layoutrodape.jsp"></jsp:include>