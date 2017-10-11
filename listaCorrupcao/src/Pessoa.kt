class Pessoa (private var nome:String, private var renda:Double)  {


    private var tipoCorrupcao = ArrayList<TiposCorrupcao>()

    override fun toString(): String {
        return "Nome da Pessoa: ${this.nome} - Renda Mensal: ${this.renda}"
    }

    fun adicionarCorrupcao(corrupto: TiposCorrupcao){
        tipoCorrupcao.add(corrupto)
    }

    fun corruptoAtivo():Boolean {
        if(this.tipoCorrupcao.contains(TiposCorrupcao.ATIVA)) {
            var bool:Boolean = true
        }
        return true
    }

    fun corruptoPassivo():Boolean {
        if(this.tipoCorrupcao.contains(TiposCorrupcao.PASSIVA)) {
            var bool:Boolean = true
            print("O ${this.nome} eh corrupto")
        }
        return true
    }

    fun corruptoSistemico():Boolean {
        if(this.tipoCorrupcao.contains(TiposCorrupcao.ATIVA)) {
            var bool:Boolean = true
        }
        return true
    }

}