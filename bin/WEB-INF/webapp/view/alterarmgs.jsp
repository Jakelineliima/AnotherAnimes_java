<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<c:set var="usuario" value="Admin"></c:set>
	<div class="bannerpag text-center text-light">
        <h1 class="txt-light font-weight-bold ">Contato</h1>
    </div>
    <form class="container contato" method="POST" action="alterarmgs">
        <div class="formcont">
            <h2>Sua mensagem.</h2>
            <div class="form">
			<input type="hidden" name="codigo" value="${contato.getCodigo()}" />
                <div class="form-group">
                    <input type="text" class="form-control" id="" placeholder="" name="nome" value="${contato.getNome()}">
                </div>
                <div class="form-group">
                    <input  type="text" class="form-control"  name="email" value="${contato.getEmail()}">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control"
                        placeholder="Escreva aqui sua mensagem:" name="mensagem" value="${contato.getMensagem()}"/>
                </div>
                </div>
            </div>
              <button style="border-radius: 22px;"  class="btn btncont borda">Enviar</button>
        </form>
      

<jsp:include page="layoutrodape.jsp"></jsp:include>

<style>
.form {
    width: 48%;
    margin: 16px auto;
}
@media (max-width: 1066px) {
.form{
width:100%;
}
}
</style>