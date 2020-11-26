<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="layouttopo.jsp"></jsp:include>
<c:set var="usuario" value="Admin"></c:set>

<div class="container">

	<h3 style="margin: 54px auto; text-align: center; color: #2E2759" class="font-weight-bold">Aqui
		esta suas mensagens enviadas</h3>
	<div class=" saveep">
		<c:forEach var="p" items="${contato}">
			<div class="card" style="width: 40%; margin: 50px auto;">
				<div class="card-body">
					<h5 style="color: #2E2759" class="card-title font-weight-bold">${p.getNome()}</h5>
					<h6 style="color: #2E2759" class="card-subtitle mb-2 text-muted font-weight-bold">${p.getEmail()}</h6>
					<p  style="color: #2E2759" class="card-text cardtxt1">${p.getMensagem()}</p>
					<div class="edits">
						<a href="/alterarmgs?codigo=${p.getCodigo()}"
							class="btncont btn btnedit">Editar</a> <a
							href="/excluirmgs?codigo=${p.getCodigo()}"
							class="btn btn-outline-danger">Excluir</a>
					</div>

				</div>
			</div>
		</c:forEach>
	</div>
</div>

<style>


.edits {
	justify-content: space-around;
}

.btncont:hover {
	color: #fff;
}

.cardtxt1 {
	margin: 46px auto;
}
</style>
<jsp:include page="layoutrodape.jsp"></jsp:include>
