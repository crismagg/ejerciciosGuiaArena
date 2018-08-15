package ejerciciosBindingDominio

import org.uqbar.commons.model.annotations.Observable
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
@Observable
class Ejercicio3 {
	
	String frase
	String fraseAlReves
	Boolean esPalindromo
	
	def darVueltaFrase(){
		fraseAlReves = new StringBuilder(frase).reverse().toString()
	}
	
	def void setFrase(String _frase){
		frase = _frase
		darVueltaFrase
		revisarSiEsPalindromo
	}
	
	def revisarSiEsPalindromo(){
		esPalindromo = frase.equals(fraseAlReves)
	}
}