package ejerciciosBindingDominio

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.annotations.Observable

@Accessors
@Observable
class Ejercicio1 {
	String nombre = ""
	String apellido = ""
	String saludo
	
	def setSaludo(){
		saludo = "Hola " + nombre + " " + apellido
	}
	
	def void setNombre(String _nombre){
		nombre = _nombre
		setSaludo
	}
	
	def void setApellido(String _apellido){
		apellido = _apellido
		setSaludo
	}
	
}