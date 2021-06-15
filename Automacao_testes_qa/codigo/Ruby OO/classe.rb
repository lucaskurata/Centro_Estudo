#classe começa com letra maiúsucla 
#Uma classe e composta por atributos, metodos e construtores
#Objeto e uma instancia de uma classe

class ClassName

    #e a mesma coisa que o GET(pegar) e SETER(setar o valor) do Java
    attr_accessor :nome

    #So permite eu let
    #attr_reader :nomeone

    #So permite escrever
    #attr_writer :nomedois

    #def nome
    #    @nome
    #end
#
    #def nome=(nome)
    #    @nome = :nome
    #end

    #nome sempre minusculo e separado por underline
    def qual_seu_nome(nome)
        puts "Seu nome é: #{nome}"
    end

    def qual_sua_idade(idade)
        puts "Sua idade é: #{idade}"
    end
end

objeto = ClassName.new
objeto.qual_seu_nome("Lucas Kurata")

#Heranca é uma das formas de reutilizar software
#Heranca é quando a classe filha herda propriedades e metodos da classe mae
#A classe filha além das proprierades e metodos da classe mae, a classe filha pode ter suas proprias propriedades e metodos

class Heranca < ClassName
end

objeto_herdeiro = Heranca.new
objeto_herdeiro.qual_sua_idade(20)