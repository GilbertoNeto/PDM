import Pessoa

class Intermediario (private var p:Pessoa) {

    override fun toString(): String {
        return "O individuo ${p.toString()} realiza corrupcao Passiva"
    }
}

