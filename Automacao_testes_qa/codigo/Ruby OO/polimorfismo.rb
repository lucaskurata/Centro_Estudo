class CachorroPequeno
    def latir
        puts "Au Au"
    end
end

class CachorroGrande
    def latir
        puts "Ao Ao Ao"
    end
end

class Pessoa
    def bate_no_portao(cachorro)
        cachorro.latir
    end
end

c1 = CachorroPequeno.new
c2 = CachorroGrande.new

p = Pessoa.new

p.bate_no_portao(c1)
p.bate_no_portao(c2)
