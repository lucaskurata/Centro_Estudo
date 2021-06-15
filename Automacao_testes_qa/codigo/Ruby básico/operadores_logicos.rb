#&& Equivalente a AND
#|| equivalente a OR
#! Equivalente a negação

puts "Digite o seu salário: "

salario = gets.chomp.to_f

if salario > 100 && salario < 1000
    puts "Salário minimo"
elsif salario > 1000 and salario <= 2000
    puts "Da pra se virar"
elsif salario > 2000 && salario < 3000
    puts "Nada mal"
elsif salario  > 3000 && salario < 1000000
    puts "show"
elsif salario = 1000000 || salario = 100000000
    puts "Milionário na área"
end