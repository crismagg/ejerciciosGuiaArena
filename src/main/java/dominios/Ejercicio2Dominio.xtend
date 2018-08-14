package dominios

import org.uqbar.commons.model.annotations.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

@Accessors
@Observable
class Ejercicio2Dominio {
	String genero
	List<String> listaDeGeneros = #["M", "F", "Otro"]

}