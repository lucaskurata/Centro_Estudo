#Serve para agrupar classes
#Serve para agrupar constantes
#Serve para agrupar métodos

#Ele é muito parecido com classe
#Não pode ser herdado
#Não pode ser instanciado

module ModuleName
    def metodo
        puts "Eu sou um módulo!"
    end
end

class ClassName
    #Não pode ser herdado, mas podemos incluir o módulo dentro de uma classe
    include ModuleName    
end

objeto = ClassName.new

objeto.metodo
