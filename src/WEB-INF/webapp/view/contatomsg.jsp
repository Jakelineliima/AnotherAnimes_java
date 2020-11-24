<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="layouttopo.jsp"></jsp:include>
<c:set var="usuario" value="Admin"></c:set>

<div class="container">

	<h5>Aqui esta suas mensagens enviadas</h5>

	<table class="table table-striped container">
		<thead>
			<tr>
				<th scope="col">Código</th>
				<th scope="col">Nome</th>
				<th scope="col">Email</th>
				<th scope="col">Mensagem</th>
				<th scope="col">Editar</th>
				<th scope="col">Excluir</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="p" items="${contato}">
				<tr>
					<td>${p.getCodigo()}</td>
					<td>${p.getNome()}</td>
					<td>${p.getEmail()}</td>
					<td>${p.getMensagem()}</td>
					<td><a href="/alterarmgs?codigo=${p.getCodigo()}">Alterar</a></td>
					<td><a href="/excluirmgs?codigo=${p.getCodigo()}">Excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>
