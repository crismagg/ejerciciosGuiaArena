package ejerciciosBindingVista

import ejerciciosBindingDominio.Ejercicio2
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.TextBox
import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*
import org.uqbar.arena.widgets.Button
import ejerciciosBindingDominio.Ejercicio3
import ejerciciosBindingDominio.TransformerColor

class Ejercicio3Vista extends MainWindow<Ejercicio3> {

	new() {
		super(new Ejercicio3)
	}

	override createContents(Panel mainPanel) {
		this.title = "Ejercicio 3 Binding"
		new Label(mainPanel).text = "Frase"
		new TextBox(mainPanel) => [
			value <=> "frase"
			// Llamar al transformer aca
			width = 200
		]

		new Label(mainPanel) => [
			value <=> "fraseAlReves"
			bindForegroundToProperty("esPalindromo").transformer = new TransformerColor
		]

	}

	def static main(String[] args) {
		new Ejercicio3Vista().startApplication
	}

}
