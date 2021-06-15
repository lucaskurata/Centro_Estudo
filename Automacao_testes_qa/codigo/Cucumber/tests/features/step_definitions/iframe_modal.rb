Quando('entro no Iframe e preencho os campos') do
  visit '/mudancadefoco/iframe'
  within_frame("id_do_iframe") do
    find("#first_name").set "Lucas"
    fill_in(id: "last_name", with: "Kurata")
  end
end

Quando('entro no Modal e verifico o texto') do
  visit '/mudancadefoco/modal'
  find(".waves-light.btn.modal-trigger").click
  within(".modal.open") do
    texto = find("h4")
    expect(texto.text).to eql "Modal Teste"
    find(".modal-close.waves-green.btn-flat").click
  end
end
