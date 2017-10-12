import Pessoa

class Iniciante(private var p:Pessoa, private var desc:String) {

    override fun toString(): String {
        return "O individuo de ${p.toString()} realiza corrupcao Ativa"
    }
    
}