Quando('eu somo {int} {float} {int}') do |valor, float, valor2|
    # Quando('eu somo {int} {float} {float}') do |int, float, float2|
    # Quando('eu somo {float} {float} {int}') do |float, float2, int|
    # Quando('eu somo {float} {float} {float}') do |float, float2, float3|
    @soma = valor + valor2
end

Entao('o resultado tem que ser {int}') do |resultado|
    # Entao('o resultado tem que ser {float}') do |float|
    expect(@soma).to eq resultado
end