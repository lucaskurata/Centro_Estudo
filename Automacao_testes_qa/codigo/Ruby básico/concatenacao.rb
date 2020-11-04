variavel = 'concatenado com sucesso'

puts 'O texto foi: ' + variavel


#Como concatenar String com Int?
variavel_int = 20
variavel_str = String(variavel_int)

puts 'Tranformamos este número em string para concatenção: ' + variavel_str

#Ou podemos fazer da seguinte maneira: 

puts "Tranformamos este número em string para concatenção: #{variavel_int}"