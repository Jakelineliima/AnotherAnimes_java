<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>AnotherAnime</title>
		<link rel="stylesheet" type="text/css" href="/css/bootstrap/css/bootstrap.css" />
		<link rel="stylesheet" href="/css/bootstrap/css/estilo.css" />
		<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&family=Staatliches&display=swap"
        rel="stylesheet">
		<script src="js/jquery-3.2.1.slim.min.js"></script>
		<script src="css/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
    <header>

        <nav class="menu container">
            <a class="logo" href="/index"><img src="/imagens/icones/logo.svg" alt="logo"></a>
            <ul class="links">
                <li class="nav-item active">
                    <a class="nav-link" href="/index">Início</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/contato">Contato</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/sobre">Sobre</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/salvos">Salvos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/contatomsg">Mensagems</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/minhaconta">Minha conta</a>
                </li>
            </ul>
            <div class="btns">
                <a style="border-radius: 22px;" type="button" class="btn borda btn-danger"
                    href="/login">Entrar</a>

                <a style="border-radius: 22px;color: #fff;" type="button" class="btn btn-outline-danger text-light"
                    href="/conta">Criar conta</a>
            </div>
            
      

            <div class="dropdown">
                <a class="btn0" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true"
                    aria-expanded="false">
                    <img style="width:31px;" src="/imagens/icones/menu.svg" alt="menu hamburgue">
                </a>

                <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                    <a class="dropdown-item" href="/index">Inicio</a>
                    <a class="dropdown-item" href="/contato">Contato</a>
                    <a class="dropdown-item" href="/sobre">Sobre</a>
                    <a class="dropdown-item" href="/salvos">Salvos</a>
                    <a class="dropdown-item" href="/login">Entrar</a>
                    <a class="dropdown_item" href="/conta">Criar conta</a>
                </div>
            </div>
        </nav>

    </header>
    
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>