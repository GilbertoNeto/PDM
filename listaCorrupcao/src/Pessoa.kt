class Pessoa (private var nome:String, private var renda:Double)  {


    private var tipoCorrupcao = ArrayList<TiposCorrupcao>()
    private var verifica:Boolean = true

    override fun toString(): String {
        return "Nome: ${this.nome} - Renda Mensal: ${this.renda}R$ - " +
                "Tipos de corrupcao realizadas:  ${this.tipoCorrupcao}"
    }

    fun adicionarCorrupcao(corrupto: TiposCorrupcao){
        tipoCorrupcao.add(corrupto)
    }

    fun corrupcaoLeve():Boolean{
        if(this.tipoCorrupcao.isEmpty()){
            return verifica
        }
        return false
    }

    fun corruptoAtivo():Boolean {
        if(this.tipoCorrupcao.contains(TiposCorrupcao.ATIVA)) {
            return verifica
        }
        return false
    }

    fun corruptoPassivo():Boolean {
        if(this.tipoCorrupcao.contains(TiposCorrupcao.PASSIVA)) {
            return verifica
        }

        return false
    }

    fun corruptoSistemico():Boolean {
        if(this.tipoCorrupcao.contains(TiposCorrupcao.SISTEMICA)) {
            return verifica
        }
        return false
    }

}