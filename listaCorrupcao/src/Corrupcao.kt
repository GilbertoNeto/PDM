fun main(args: Array<String>) {

     var listaIniciante = ArrayList<Iniciante>()
     var listaMedia = ArrayList<Intermediario>()
     var listaAvancada = ArrayList<Avancado>()

    // Criaçao das Pessoas corruptas
    var p = Pessoa("Michel Temer", 10000.000)
    var p1 = Pessoa ("Aecio Neves", 200000.00)
    var p2 = Pessoa("Cassio Cunha Lima", 300000.000)
    var p3 = Pessoa ("Bolsonaro Facista", 15.50)
    var p4 = Pessoa("Berg Lima", 12000.00)
    var p5 = Pessoa("Dilma Rouseff", 120.00)

    var contIni:Int = 0
    var contInt:Int = 0
    var contAdv:Int = 0

    //Chamada para adicionar os tipos de corrupçao aos individuos
    p1.adicionarCorrupcao(TiposCorrupcao.PASSIVA)
    p1.adicionarCorrupcao(TiposCorrupcao.ATIVA)

    p.adicionarCorrupcao(TiposCorrupcao.SISTEMICA)
    p3.adicionarCorrupcao(TiposCorrupcao.PASSIVA)
    p3.adicionarCorrupcao(TiposCorrupcao.SISTEMICA)
    p2.adicionarCorrupcao(TiposCorrupcao.SISTEMICA)

    p4.adicionarCorrupcao(TiposCorrupcao.ATIVA)
    p4.adicionarCorrupcao(TiposCorrupcao.SISTEMICA)

    p5.adicionarCorrupcao(TiposCorrupcao.ATIVA)

    //Criando uma lista de arrays com Pessoas
    var arrayCorrupto = ArrayList<Pessoa>()
    arrayCorrupto.add(p)
    arrayCorrupto.add(p1)
    arrayCorrupto.add(p2)
    arrayCorrupto.add(p3)
    arrayCorrupto.add(p4)
    arrayCorrupto.add(p5)

    for (c in arrayCorrupto){

        if (c.corruptoAtivo() == true){
            var ini = Iniciante(c)
            listaIniciante.add(ini)
            contIni++
        }

        if(c.corruptoPassivo() == true){
            var int = Intermediario(c)
            listaMedia.add(int)
            contInt++
        }

        if(c.corruptoSistemico() == true){
            var adv = Avancado(c)
            listaAvancada.add(adv)
            contAdv++

        }

    }


    println("Total de corruptos ativos/iniciantes: ${contIni}")
    println("Total de corruptos passivos/intermediarios: ${contInt}")
    println("Total de corruptos sistemicos/avançados: ${contAdv}")
    println("\n\n")

    println("----------- Individuos e suas corrupçoes --------- \n\n")
    for(c in arrayCorrupto){

        println(c.toString())
    }

 }