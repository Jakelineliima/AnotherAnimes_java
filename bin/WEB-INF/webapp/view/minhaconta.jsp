<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>

	<div class="row container">

		
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">Código</th>
		      <th scope="col">Nome</th>
		      <th scope="col">Email</th>
		      <th scope="col">Senha</th>
		      <th scope="col">Alterar</th>
		      <th scope="col">Excluir</th>
		    </tr>
		  </thead>
		  <tbody>
			<c:forEach var="p" items="${contas}">
			  <tr>
			    <td>${p.getCodigo()}</td>
				<td>${p.getNome()}</td>
				<td>${p.getEmail()}</td>
				<td>${p.getSenha()}</td>
				<td><a href="/alterarconta?codigo=${p.getCodigo()}">Alterar</a></td>
				<td><a href="/excluirconta?codigo=${p.getCodigo()}">Excluir</a></td>
			  </tr>
			  
			</c:forEach>
		  </tbody>
		</table>
	
	
	</div>
	
<jsp:include page="layoutrodape.jsp"></jsp:include>