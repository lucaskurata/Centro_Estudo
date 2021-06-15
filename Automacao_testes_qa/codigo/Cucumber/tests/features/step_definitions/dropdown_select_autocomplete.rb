Quando('eu interajo com dropdown e select') do
    visit '/buscaelementos/dropdowneselect'
    find('.btn.dropdown-button').click
    sleep(0.5)
    find("#dropdown1").click
    sleep(0.5)
    page.execute_script("window.scrollTo(0,400000)")
    find('.browser-default').click
    find("option", text: "Firefox").select_option
    sleep(2)
#    select 'Chrome', from: 'dropdown'
#    sleep(2)
end

Quando('eu autocompleto o estado') do
    visit '/widgets/autocomplete'
    find("#autocomplete-input").set "Rio de Ja"
    find("ul", text: "Rio de Janeiro").click
end
  