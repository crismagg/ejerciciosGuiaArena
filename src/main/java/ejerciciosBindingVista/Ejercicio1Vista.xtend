package ejerciciosBindingVista

import ejerciciosBindingDominio.Ejercicio1
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.TextBox
import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*

class Ejercicio1Vista extends MainWindow<Ejercicio1> {

	new() {
		super(new Ejercicio1)
	}

	override createContents(Panel mainPanel) {
		this.title = "Ejercicio 1"
		new Label(mainPanel).text = "Nombre"

		new TextBox(mainPanel) => [
			value <=> "nombre"
		]

		new Label(mainPanel).text = "Apellido"

		new TextBox(mainPanel) => [
			value <=> "apellido"
		]

		new Label(mainPanel) => [
			value <=>  "saludo"
		]

	}

	def static main(String[] args) {
		new Ejercicio1Vista().startApplication
	}
}
