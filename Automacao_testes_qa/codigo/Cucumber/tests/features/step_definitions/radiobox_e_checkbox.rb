Quando('eu clico no radiobox e checkbox') do
    visit '/buscaelementos/radioecheckbox'
    #Checkbox -> da pra selecionar mais de 1 opção
    find('label[for="black"]').click
    check("purple", allow_label_click: true)
    uncheck("purple", allow_label_click: true)
    #Radio box -> só da pra selecionar 1 opção
    choose("red", allow_label_click: true)
end
