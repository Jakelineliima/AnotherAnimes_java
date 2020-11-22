<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<c:set var="usuario" value="Admin"></c:set>
	
    <div class="bannerconta text-center text-light">
      <h1 style="padding: 54px;" class="txt-light font-weight-bold">Criar conta</h1>
    </div>
        <div class="titulo">
            <h1>CRIE SUA CONTA E APROVEITE</h1>
        </div>
        <div class="formulario">
            <form class="container" method="POST" action="/alterarconta">
                <div class="form-group">
                <input type="hidden" name="codigo" value="${conta.getCodigo()}" />
                    <input  type="text" class="form-control" id="exampleInputName" aria-describedby="namelHelp"
                        placeholder="Nome" name="nome" value="${conta.getNome()}" />
                        
                </div>
                <div class="form-group">
                
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                        placeholder="E-mail" name="email" value="${conta.getEmail()}" />
                        
                </div>
                <div class="form-group">
                
                    <input style="margin-bottom: 0;" type="password" class="form-control" id="exampleInputPassword1"
                        placeholder="Senha" name="senha" value="${conta.getSenha()}" />
                        
                </div>
                <button style="border-radius: 22px; background-color: #2e2759; color: #fff; font-family: 'Staatliches';"
                    type="submit" class="btn borda btncriar" >Criar conta</button>

            </form>
        </div>
        
<style>
 .bannerconta{
	background-image: url('/imagens/criar-conta-bg.jpg');
    background-size: auto;
    width: 100%;
    padding: 29px;}
    
    @media(max-width:360px){
    .formulario > form{
    	width:100%;
    }
    }
</style>

	<jsp:include page="layoutrodape.jsp"></jsp:include>