#while Enquando o teste for verdadeiro, o bloco de repetição vai ser executado

n = 0
while (n <= 50)
    puts "Número #{n}"
    n += 2
end

#While -> roda até o bloco de repetição deixar de ser True
#Until -> roda até o bloco de repetição deixar de ser False

a = 50
b = 10
until a < b
    puts "Sou falso porque a: #{a}"
    a -= 1
end
