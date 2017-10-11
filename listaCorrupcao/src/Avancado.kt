import Pessoa

class Avancado (private var p:Pessoa) {

    override fun toString(): String {
        return "O individuo de ${p.toString()} realiza corrupcao Sistemica"
    }


}