Quando('aceso a url de botoes') do
  visit '/buscaelementos/botoes'
end

Entao('verifico se encontrei os elementos') do
    page.all(:css, '.btn')

    find("#teste")

    find_by_id("teste")

    find_button(class: 'btn waves-light')

    #first.('.btn')

end