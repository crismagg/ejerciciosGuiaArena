package ejerciciosBindingDominio

import org.uqbar.commons.model.annotations.Observable
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
@Observable
class Ejercicio2 {
	var int operando1
	var int operando2
	var int resultado
	
	def calcularResultado(){
		resultado = operando1 * operando2
	}
	
}