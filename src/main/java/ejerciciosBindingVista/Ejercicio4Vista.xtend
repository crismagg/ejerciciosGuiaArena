package ejerciciosBindingVista

import ejerciciosBindingDominio.Ejercicio4
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.Panel
import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.TextBox

class Ejercicio4Vista extends MainWindow<Ejercicio4> {

	new() {
		super(new Ejercicio4)
	}

	override createContents(Panel mainPanel) {
		this.title = "Ejercicio 4 Binding"
		
		new Label(mainPanel).text = "Tweet"
		new TextBox(mainPanel) => [
			value <=> ""
		]
	}

	def static main(String[] args) {
		new Ejercicio2Vista().startApplication
	}
	
}
	