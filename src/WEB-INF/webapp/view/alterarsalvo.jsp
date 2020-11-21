<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<c:set var="usuario" value="Admin"></c:set>
	
	    <div class="container adccont">

        <form class="adicionar" method="POST" action="alterarsalvo">
            <h2>EDITE AQUI SEUS EPISÓDIOS ASSISTIDOS</h2> 
			<input type="hidden" name="codigo" value="${salvo.getCodigo()}" />
			
            <div class="adcimg">
				 <label class="labelInput">Adicione a imagem<input type="file" name="imagem" class="btn file_customizada"  accept="image/png, image/jpeg" value="${salvo.getImagem()}"  multiple/></label>
             </div>
             
            <div class="enter">
                <div class="inputs">
                    <input class="inputtitle" type="text" name="titulo"  value="${salvo.getTitulo()}" />
                    
            </div>
                
            <div class="tmp">
                    <input class="temp" type="text" name="temporada" value="${salvo.getTemporada()}" />
                    <input class="ep" type="text"  name="episodio" value="${salvo.getEpisodio()}" />
            </div>
            </div>
            
            <div class="teste">
                <button style="border-radius: 22px;" type="submit" class="btn borda">Salvar</button>
            </div>
            
          </form>
          
        </div>
    
    <jsp:include page="layoutrodape.jsp"></jsp:include>
    
	<style>
	@media(max-width:999px){
	.adicionar{
    display: flex;
    flex-direction: column;
    }
    .borda{
    margin: 18px auto;
	float: right;
	}
	.adcimg{
	width:300px;
	heigth:203px;
	}
	}
	</style>