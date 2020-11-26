<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="layouttopo.jsp"></jsp:include>
<c:set var="usuario" value="Admin"></c:set>

<div class="bannersav text-center text-light">
	<h1 style="padding: 54px;" class="txt-light font-weight-bold">Salvos</h1>
</div>

<div class="container">

	<div class="busca">
		<a style="border-radius: 22px;" type="button" href="./adicionar"
			class="btn procurar text-light"> Adicionar novo</a>
	</div>

	<div class=" saveep">
		<c:forEach var="s" items="${salvos}">
			<div class="card" style="width: 18rem; margin: 18px auto;">
				 <img class="card-img-top" src="/imagens/imagens/784334.jpg" />
				
				<div class="card-body">
					<h5 class="card-title text-center titulo">${s.getTitulo()}</h5>
					<div class="marcados">
						<p class="card-text">Temporada - ${s.getTemporada()}</p>
						<p class="card-text">Episodio - ${s.getEpisodio()}</p>
					</div>
					<div class="edits">
						<a href="/alterarsalvo?id_save=${s.getId_save()}"
							class="btn btnedit">Editar</a> <a
							href="/excluirsalvo?id_save=${s.getId_save()}"
							class="btn btn-outline-danger">Excluir</a>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</div>

<style>
.btnedit:hover {
	color: #fff;
}
</style>

<jsp:include page="layoutrodape.jsp"></jsp:include>