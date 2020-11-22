<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<c:set var="usuario" value="Admin"></c:set>
	
	    <div class="container adccont">
	    
        <form class="adicionar" method="POST" action="/adicionar">
            
            <h2>ADICIONE AQUI SEUS EPISÓDIOS ASSISTIDOS</h2>
            
            <div class="adcimg">
                
                <label class="labelInput">	Adicione a imagem<input type="file" name="imagem" class="btn file_customizada"  accept="image/png, image/jpeg"  multiple/>

                </label>
               <!--- <input type="file">--->
             </div>
             
            <div class="enter">
                <div class="inputs">
                    <input class="inputtitle" type="text" name="titulo" placeholder="Titulo">
                </div>
                <div class="tmp">
                    <input class="temp" type="text" placeholder="Temporada" name="temporada">
                    <input class="ep" type="number" placeholder="Episódio" name="episodio">
                </div>
            </div>
            <div class="teste">
                <button style="border-radius: 22px;" type="submit" class="btn borda" value="upload">Salvar</button>
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
	<jsp:include page="layoutrodape.jsp"></jsp:include>