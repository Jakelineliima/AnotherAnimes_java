<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="layouttopo.jsp"></jsp:include>
<c:set var="usuario" value="Admin"></c:set>

<div class="container">

	<h5 style="margin: 54px auto; text-align: center;">Aqui esta suas
		mensagens enviadas</h5>

	<c:forEach var="p" items="${contato}">
		<div class="card" style="width: 18rem; margin: 50px auto;">
			<div class="card-body">
				<h5 class="card-title">${p.getNome()}</h5>
				<h6 class="card-subtitle mb-2 text-muted">${p.getEmail()}</h6>
				<p class="card-text">${p.getMensagem()}</p>
				<a href="/alterarmgs?codigo=${p.getCodigo()}" class="card-link">Editar</a>
				<a href="/excluirmgs?codigo=${p.getCodigo()}" class="card-link">Excluir</a>
			</div>
		</div>
	</c:forEach>

</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>
