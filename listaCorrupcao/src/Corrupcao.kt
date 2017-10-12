fun main(args: Array<String>) {

     var listaIniciante = ArrayList<Iniciante>()
     var listaMedia = ArrayList<Intermediario>()
     var listaAvancada = ArrayList<Avancado>()

    // Criaçao das Pessoas corruptas
    var mt = Pessoa("Michel Temer", 10000.000)
    var an = Pessoa ("Aecio Neves", 200000.00)
    var ccl = Pessoa("Cassio Cunha Lima", 300000.000)
    var bf = Pessoa ("Bolsonaro Facista", 15.99)
    var bl = Pessoa("Berg Lima", 12000.00)
    var dm = Pessoa("Dilma Rouseff", 120.00)
    var jg = Pessoa("Joao de Deus", renda = 10.00)

    var contIni:Int = 0
    var contInt:Int = 0
    var contAdv:Int = 0

    //Chamada para adicionar os tipos de corrupçao aos individuos
    an.adicionarCorrupcao(TiposCorrupcao.PASSIVA)
    an.adicionarCorrupcao(TiposCorrupcao.ATIVA)

    mt.adicionarCorrupcao(TiposCorrupcao.SISTEMICA)
    ccl.adicionarCorrupcao(TiposCorrupcao.PASSIVA)
    ccl.adicionarCorrupcao(TiposCorrupcao.SISTEMICA)
    an.adicionarCorrupcao(TiposCorrupcao.SISTEMICA)


    bl.adicionarCorrupcao(TiposCorrupcao.ATIVA) // Argumenta que foi vitima a todo custo
    bl.adicionarCorrupcao(TiposCorrupcao.SISTEMICA)

    dm.adicionarCorrupcao(TiposCorrupcao.ATIVA)

    //Criando uma lista de arrays com Pessoas
    var arrayCorrupto = ArrayList<Pessoa>()
    arrayCorrupto.add(mt)
    arrayCorrupto.add(an)
    arrayCorrupto.add(ccl)
    arrayCorrupto.add(bf)
    arrayCorrupto.add(bl)
    arrayCorrupto.add(dm)

    //Atribuindo as Pessoas a suas categorias de corrupçao por niveis Iniciante, Intermediario e Avançado

    //Iniciantes
    var i1 = Iniciante(jg, "Furto de alimento em mercado publico")
    listaIniciante.add(i1)

    //Intermediarios
    var int1 = Intermediario(dm,TiposCorrupcao.ATIVA, 100000.000)
    var int2 = Intermediario(bf, TiposCorrupcao.PASSIVA, 30000.00)
    listaMedia.add(int1)
    listaMedia.add(int2)

    //Avançados
    var adv1 = Avancado(mt,TiposCorrupcao.SISTEMICA,5000000.000, 42)
    var adv2 = Avancado(an,TiposCorrupcao.SISTEMICA, 1000000.000, freq = 10)
    var adv3 = Avancado(ccl,TiposCorrupcao.SISTEMICA, 4000000.000, freq = 30)
    var adv4 = Avancado(bl,TiposCorrupcao.SISTEMICA, 30000.000, freq = 2)

    listaAvancada.add(adv1)
    listaAvancada.add(adv2)
    listaAvancada.add(adv3)
    listaAvancada.add(adv4)


    println("Total de corruptos ativos/iniciantes: ${listaIniciante.size}")
    println("Total de corruptos passivos/intermediarios: ${listaMedia.size}")
    println("Total de corruptos sistemicos/avançados: ${listaAvancada.size}")
    println("\n\n")

    println("----------- Individuos e suas corrupçoes --------- \n\n")
    for(c in arrayCorrupto){

        println(c.toString())
    }

 }