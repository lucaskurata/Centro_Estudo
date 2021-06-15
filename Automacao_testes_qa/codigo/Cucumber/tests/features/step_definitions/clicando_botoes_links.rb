Quando('eu clico em botoes ou links') do
    visit "/"
    click_on('Começar Automação Web')
    sleep 0.5
    find(:xpath, '/html/body/div[2]/div[1]/ul/li[2]/a').click
    sleep 0.5
    click_on("Botões")
    find('a[onclick="ativaedesativa1()"]').click
    sleep 0.5
    find('a[onclick="ativaedesativa2()"]').double_click
    sleep 0.5
    find('a[onclick="ativaedesativa3()"]').right_click
    sleep 0.5
    click_button("Submit")
    visit "/"
    
end