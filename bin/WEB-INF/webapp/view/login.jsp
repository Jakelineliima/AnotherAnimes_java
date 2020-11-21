<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	
	
	
        <div class="bannerlogin">
            <img src="/imagens/login-bg.jpg" alt="banner">
        </div>
        <div class="titulo">
            <h1>Faça login e aproveite!</h1>
        </div>
        <div class="formulario container">
            <form action="UsuarioController" method="post">
                <div class="form-group">
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                        placeholder="E-mail" name="email">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Senha" name="senha" >
                </div>
                <input
                    style="border-radius: 22px; background-color: #2e2759; color: #fff; font-weight: bold; font-family: 'Staatliches'; width: 100px;"
                    type="submit" value="Login" name="botao" class="btn" >
            </form>
        </div>
    <style>
       @media(max-width:360px){
    .formulario > form{
    	width:100%;
    }
    </style>
    <jsp:include page="layoutrodape.jsp"></jsp:include>
    