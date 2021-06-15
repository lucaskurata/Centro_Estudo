#IF ELSIF ELSE - A condição IF é uma estrutura condicional que executa a afirmação, detro do 
#bloco, se determinada condição for VERDADEIRA, se for FALSA, executa as afirmações dentro do ELSE

puts "Digite o seu peso (em quilogramas): "
peso = gets.chomp.to_f

puts "Digite a sua altura (em metros)"
altura = gets.chomp.to_f

altura_transformada = altura ** 2

imc = peso / altura_transformada

if (imc < 18.5)
    puts 'Você está abaixo do peso'
elsif (imc >= 18.6 and imc <= 24.9)
    puts 'Peso ideal'
elsif (imc >= 25.0 and imc <= 29.9)
    puts "Levemente acima do peso"
elsif (imc > 30.0 and imc <= 34.9)
    puts "Obesidade grau 1"
elsif (imc > 35.0 and imc <= 39.9)
    puts "Obesidade grau 2 (severa)"
elsif (imc >= 40)
    puts "Obsidade grau 3 (mórbida)"
else 
    puts "Valor inválido, tente novamente!"
end

#Switch Case - 

puts "Digite um número: "
n = gets.chomp.to_i

case n
when 1
    puts "Você digitou 1"
when 2
    puts "Você digitou 2"
when 3
    puts "Você digitou 3"
when 4
    puts "Você digitou 4"
when 5
    puts "Você digitou 5"
when 6
    puts "Você digitou 6"
else 
    puts "Você digitou número diferente de 1,2,3,4,5 e 6"
end