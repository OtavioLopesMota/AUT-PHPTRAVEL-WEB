# language: pt
Funcionalidade: Login

  Cenário: Realizar Login com sucesso
    Dado que eu deseje logar no sistema
    Quando faço o ligin no sistema "admin@phptravels.com" e senha "demoadmin"
    Então sou autenticado

  Cenário: Tentativa de Login com email inválido
    Dado que eu esteja na tela de login
    Quando faço login com o usuário "teste" e senha "demoadmin"
    Então e apresentada a mensagem "The Email field must contain a valid email address."
    