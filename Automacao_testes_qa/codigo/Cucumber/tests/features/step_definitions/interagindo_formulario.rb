Quando('eu acesso o site') do
    visit '/users/new'
end
  
Então("devo preencher com {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}") do |nome, sobrenome, email, universidade, genero, profissao, idade, endereco|
    find("#user_name").set(nome)
    fill_in(id: "user_lastname", with: sobrenome)
    find("#user_email").set(email)
    find("#user_address").set(endereco)
    find("#user_university").set(universidade)
    find("#user_profile").set(profissao)
    find("#user_gender").set(genero)
    find("#user_age").set(idade)
    find("input[value=Criar]").click
end
  
Então('verifico se fui cadastrado') do
    texto = find("#notice")
    expect(texto.text).to eql "Usuário Criado com sucesso"
    sleep 0.5
end