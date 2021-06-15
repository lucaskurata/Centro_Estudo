Quando('Eu entro na janela e verifico a mensagem') do
    visit '/mudancadefoco/janela'

    #Variável janela recebe uma janela que foi aberta pelo link
    janela = window_opened_by do 
        click_on("Clique aqui")
    end

    #Muda o foco para a Janela
    within_window janela do
        expect(current_url).to eq 'https://automacaocombatista.herokuapp.com/mudancadefoco/newwindow'
        @mensagem = find('.red-text.text-darken-1.center')
        expect(@mensagem.text).to eq 'Você Abriu uma nova janela!!'

        janela.close
    end

end

Quando('Eu clico no Alert e verifico a mensagem') do
    visit '/mudancadefoco/alert'

    #Acecept com "OK"
    find('button[onclick="jsAlert()"]').click
    page.accept_alert
    

    #Accept com "Ok" ou "Cancel"
    find('button[onclick="jsConfirm()"]').click
    page.accept_confirm
    
    find('button[onclick="jsConfirm()"]').click
    page.dismiss_confirm
    

    #Accpet com "Prompt de mensagem" e com "Ok" ou "Cancel"
    find('button[onclick="jsPrompt()"').click
    page.accept_prompt(with: 'Meu nome é Lucas Kurata')
    
    find('button[onclick="jsPrompt()"').click
    page.dismiss_prompt

end