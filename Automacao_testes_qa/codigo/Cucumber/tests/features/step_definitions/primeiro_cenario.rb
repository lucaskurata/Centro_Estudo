Dado('Eu tenho {int} reais guardados.') do |valor1|
# Dado('Eu tenho {float} reais guardados.') do |float|
  @antes = valor1
end

Quando('Recebi {int} reais na conta.') do |valor2|
# Quando('Recebi {float} reais na conta.') do |float|
  @pagamento = valor2
  @total = @antes + @pagamento
end

Então('Eu vejo quanto dinheiro eu tenho no total.') do
    expect(@total).to eq 4000
end

Quando('Paguei {int} reais em multa.') do |multa|
# Quando('Paguei {float} reais em multa.') do |float|
    @despesa = multa
    @sobra = @antes - @despesa
end

Então('Eu vejo quanto dinheiro eu tenho depois de ter pago.') do
    expect(@sobra).to eq 900
end