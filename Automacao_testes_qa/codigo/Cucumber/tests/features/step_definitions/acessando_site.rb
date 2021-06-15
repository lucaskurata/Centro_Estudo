Quando('eu acesso a url') do
    visit('/treinamento/home')
end

Entao('eu verifico se estou na pagina que eu quero') do
    expect(page).to have_current_path('https://automacaocombatista.herokuapp.com/treinamento/home')
end