# language: pt
Funcionalidade: Login

  Cenário: Realizar Login com sucesso
    Dado que eu deseje logar no sistema
    Quando faço o ligin no sistema "admin@phptravels.com" e senha "demoadmin"
    Então sou autenticado
