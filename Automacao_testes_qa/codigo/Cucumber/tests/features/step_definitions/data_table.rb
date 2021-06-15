Dado('que eu tenha umas laranjas') do |table|
    # table is a Cucumber::MultilineArgument::DataTable
    @total = table.rows_hash['Laranja'].to_i
end
  
Quando('eu como {int} laranjas') do |int|
# Quando('eu como {float} laranjas') do |float|
    @resultado = @total - int
end
  
Entao('eu verifico quanto que sobrou') do
  expect(@resultado).to eq 10
end

Dado('que eu tenha {int} laranjas') do |int, table|
# Dado('que eu tenha {float} laranjas') do |float, table|
  # table is a Cucumber::MultilineArgument::DataTable
  table.hashes.each do |valor|
  @laranja = valor['Laranjas'].to_i
  end
end

Quando('eu divido entre {int} irmaos') do |qtd|
# Quando('eu divido entre {float} irmaos') do |float|
  @divisao = (@laranja / qtd)
end

Entao('eu verifico se a divisao foi justa') do
  expect(@divisao).to eq 10 
end