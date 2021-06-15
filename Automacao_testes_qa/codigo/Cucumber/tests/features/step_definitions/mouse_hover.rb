Quando('passo o mouse por cima do hover') do
    visit '/iteracoes/mousehover'
    find(".activator").hover
end