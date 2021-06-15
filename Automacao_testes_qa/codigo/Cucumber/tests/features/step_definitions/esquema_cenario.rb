Quando('eu multiplico {int} pelo {int}.') do |multiplicador, multiplicado|
    @resultado = multiplicador * multiplicado
end

Entao('eu vejo consigo saber o {int} da multiplicação.') do |produto|
    expect(@resultado).to eq produto
end