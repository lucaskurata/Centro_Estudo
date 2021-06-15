#language: pt

@cadastrar_no_form
Funcionalidade: fazer cadastro

Cenario: Devo me cadastrar no site

    Quando eu acesso o site
    Então devo preencher com "Lucas", "k", "lucas@hotmail.com", "Av Cidade Lider", "Faculdade Impacta", "QA Automation", "Masc", "20"
    E verifico se fui cadastrado