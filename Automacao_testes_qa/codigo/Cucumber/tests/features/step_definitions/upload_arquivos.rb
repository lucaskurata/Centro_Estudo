Quando('faço upload de arquivo') do
    visit '/outros/uploaddearquivos'
    #Primeira opção
    #attach_file('upload', 'C:\Users\lucas\Desktop\Centro_Estudo\Automacao_testes_qa\codigo\Cucumber\tests\donwload.png', make_visible: true)
    
    #Segunda opção
    @foto = File.join(Dir.pwd, 'donwload.png')
    attach_file('upload', @foto, make_visible: true)
    sleep(15)
end