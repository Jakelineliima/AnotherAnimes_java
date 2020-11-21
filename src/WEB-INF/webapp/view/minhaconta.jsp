<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	
	<c:forEach var="p" items="${conta}">
	<div class="">
	<div class="card" style="width: 18rem;">
 	 <div class="card-body">
    <h5 class="card-title">Sua conta</h5>
    <p class="card-text">Nome - ${p.getNome()}
     ${session.usuarioLogado.nome }</p>
    <p class="card-text"> Email - ${p.getEmail()}</p>
    <a href="/alterarconta?codigo=${p.getCodigo()}" class="card-link">Editar sua conta</a>
    <a href="/excluirconta?codigo=${p.getCodigo()}" class="card-link">Excluir conta</a>
 	 </div>
	</div>
	</div>
	</c:forEach>
<jsp:include page="layoutrodape.jsp"></jsp:include>