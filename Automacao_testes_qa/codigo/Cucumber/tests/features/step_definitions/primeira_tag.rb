Quando('eu somo o valor de {int} {float} {int}') do |int, float, int2|
    @resultado = int + int2
end

Então('o resultado da soma é {int}') do |int|
# Então('o resultado da soma é {float}') do |float|
  expect(@resultado).to eq 10
end

Quando('eu multiplico o valor de {int} por {int}') do |int, int2|
  @multiplicacao = int * int2
end

Então('o resultado da subtração é de {int}') do |int|
# Então('o resultado da subtração é de {float}') do |float|
  expect(@multiplicacao).to eq 50
end