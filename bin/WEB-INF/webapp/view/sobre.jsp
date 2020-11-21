<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<c:set var="usuario" value="Admin"></c:set>
       <div class="bannersobre">
            <h1>SOBRE</h1>
        </div>
        <div class="text_1">
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#ModalLongoExemplo"> Ingles</button>
            <h2>COMO SURGIU A ANOTHERANIMES?</h2>
            <p>AnotherAnimes pensou na necessidade de alguns usuários que geralmente enfrentam
                quando assistem em diversos lugares suas séries, animes e etc, sendo assim acaba
                perdendo em qual parte parou, nós oferecemos a opção pra você sempre manter seus
                episódios em dia.</p>
        </div>
        <div class="text_2">
            <h2>QUANDO SURGIU?</h2>
            <p>No meio do ano de 2020, com todos esse caos de ficarmos em casa devido a
                pandemia começou a surgir a ideia de nosso projeto.
                Quem adora ver animes e séries sabe como é complicado quando se assiste em
                vários lugares manter um controle de quais episódios foram vistos, com isso surgiu a
                ideia e por que não ter um lugar pra isso? E assim surgiu nosso site e aplicativo.
            </p>
        </div>
        
        <!-- Botão para acionar modal -->

<!-- Modal -->
<div class="modal fade" id="ModalLongoExemplo" tabindex="-1" role="dialog" aria-labelledby="TituloModalLongoExemplo" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="TituloModalLongoExemplo">HOW WAS IT CREATED ANOTHERANIMES?</h5>
      </div>
      <div class="modal-body">
       AnotherAnimes thought of the need of some users that usually face when watching their series, anime and etc. in different places, so that you don’t end up losing where you left off, we offer the option of always keeping your episodes up to date.
      </div>
      <div class="modal-header">
        <h5 class="modal-title" id="TituloModalLongoExemplo">WHEN WAS IT CREATED ?</h5>
      </div>
      <div class="modal-body">
      In the middle of the year 2020, with all this chaos of being at home due to the pandemic, the idea of our project started to emerge. Who loves watching anime and series knows how complicated it is to watch in various places to follow which episodes were seen, with that the idea came up and why not have a place for it? And then our website and app came into being.
      <div class="modal-footer">
      
      </div>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>