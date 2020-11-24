<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="layouttopo.jsp"></jsp:include>
<c:set var="usuario" value="Admin"></c:set>
<div class="bannerpag text-center text-light">
	<h1 class="txt-light font-weight-bold ">Contato</h1>
</div>

<form class="container contato" method="POST" action="/contato">
	<div class="formcont">
		<h2>Esta com problemas ou quer enviar uma opnião.</h2>
		<div class="form">
			<div class="form-group">
				<input class="form-control" id="" placeholder="Nome:" name="nome"
					required>
			</div>
			<div class="form-group">
				<input type="email" class="form-control"
					id="exampleFormControlInput1" placeholder="Email:" name="email"
					required>
			</div>
			<div class="form-group">
				<textarea class="form-control" id="exampleFormControlTextarea1"
					rows="3" placeholder="Escreva aqui sua mensagem:" name="mensagem"
					required></textarea>
			</div>
		</div>
	</div>

	<button style="border-radius: 22px;" type="submit" class="btn btncont borda">Enviar</button>

</form>

<div class="container cont">
	<h2 class="text-center">Siga nossas redes sociais!</h2>
	<div class="social">
		<div class="textsoc">
			<a href="#"><img src="/imagens/icones/facebook.svg"
				alt="logo facebook"></a>
			<p>AnotherAnimes</p>
		</div>
		<div class="textsoc">
			<a href="#"><img src="/imagens/icones/001-instagram.svg"
				alt="logo instagram"></a>
			<p>@AnotherAnimes</p>
		</div>
		<div class="textsoc">
			<a href="#"><img src="/imagens/icones/002-twitter.svg"
				alt="logo twitter"></a>
			<p>@AnotherAnimes</p>
		</div>
	</div>
</div>

<jsp:include page="layoutrodape.jsp"></jsp:include>

<style>
.form {
	width: 48%;
	margin: 16px auto;
}

@media ( max-width : 1066px) {
	.form {
		width: 100%;
	}
}
</style>