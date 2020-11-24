<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="layouttopo.jsp"></jsp:include>

<div class="container">



	<c:forEach var="p" items="${contas}">
		<div class="card text-center" style="margin: 120px auto;">
			<div class="card-header">
				<p>Seja bem vindo <h6>${p.getNome()}</h6> </p>
			</div>
			<div class="card-body">
				<p class="card-text">${p.getEmail()}</p>
				<a class="btn edit" href="/alterarconta?codigo=${p.getCodigo()}">Editar</a>
				<a class="btn btn-danger"
					href="/excluirconta?codigo=${p.getCodigo()}">Excluir</a>
			</div>
		</div>
	</c:forEach>
</div>

<style>
.edit {
	background-color: #2E2759;
	color: #fff;
}
.edit:hover{
    background-color: #38325E;
	color: #fff;
}
</style>

<jsp:include page="layoutrodape.jsp"></jsp:include>