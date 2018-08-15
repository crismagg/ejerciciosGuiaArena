package ejerciciosBindingVista

import ejerciciosBindingDominio.Ejercicio2
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.TextBox
import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*
import org.uqbar.arena.widgets.Button

class Ejercicio2Vista extends MainWindow<Ejercicio2> {

	new() {
		super(new Ejercicio2)
	}

	override createContents(Panel mainPanel) {
		this.title = "Ejercicio 2 Binding"
		
		new Label(mainPanel).text = "Operando1"
		new TextBox(mainPanel) => [
			value <=> "operando1"
		]
		new Label(mainPanel).text = "Operando2"
		new TextBox(mainPanel) => [
			value <=> "operando2"
		]
		new Button(mainPanel) => [
			caption = "*"
			onClick[ | modelObject.calcularResultado]
		]
		new Label(mainPanel).value <=> "resultado"
	}

	def static main(String[] args) {
		new Ejercicio2Vista().startApplication
	}
	
}
	