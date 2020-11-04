#Na programação OO, o overrinding é um recurso que permite que a classe filha substitua um método da classe mãe
#Ou seja, o método da classe filha pode substituir o método da classe mãe caso ambos tenham o método com o mesmo nome

class Mae
    def overrinding
        puts "Não deve imprimir a mensagem da classe mãe!"
    end
end

class Filho < Mae
    def overrinding
        puts "Deve imprimir somente a mensagem da classe Filha!"
    end
end

objeto_filho = Filho.new
#Vai imprimir a mensagem da Classe Filho pq apesar de ambos métodos terem o mesmo nome, o que prevalece é o 
#método da classe Filho (overwrite)
objeto_filho.overrinding


#Para corrigir este detalhe, temos o SUPER.
#Diferente do Overrinding, o Super chama o método da Classe mãe e também chama o método da Classe filha mesmo que ambos 
#tenham o mesmo nome

class Mae2
    def super_teste
        puts "Deve imprimir a mensagem da class Filha também!"
    end
end

class Filho2 < Mae2
    def super_teste
        puts super
        puts "Deve imprimir a mensagem da classe Mãe também"
    end
end

objeto_filho_super = Filho2.new
#Diferente do Overrinding, o super deve imprimir tanto a mensagem da classe Filha quando a mensagem da classe Mãe
objeto_filho_super.super_teste
