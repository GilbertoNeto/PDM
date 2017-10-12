import Pessoa

class Avancado (private var p:Pessoa, private var t:TiposCorrupcao,
                private var valor:Double, private var freq:Int) {

    override fun toString(): String {
        return "O individuo de ${p.toString()} realiza corrupcao Sistemica"
    }


}