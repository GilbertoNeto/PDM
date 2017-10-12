import Pessoa

class Intermediario (private var p:Pessoa, private var t:TiposCorrupcao, private var valor:Double) {

    override fun toString(): String {
        return "O individuo de ${p.toString()} realiza corrupcao Passiva"
    }
}

