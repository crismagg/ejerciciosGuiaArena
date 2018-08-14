package ejerciciosDeLayout

import dominios.Ejercicio2Dominio
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.widgets.Selector
import org.uqbar.arena.widgets.Spinner
import org.uqbar.arena.bindings.ObservableProperty
import java.util.List
import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*

class Ejercicio2 extends MainWindow<Ejercicio2Dominio>{
	
	new(){
		super(new Ejercicio2Dominio)
	}
	
	override createContents(Panel panelPrincipal) {
		this.title = "Ejercicio 2"
		panelPrincipal.layout = new ColumnLayout(2)
		new Label(panelPrincipal).text = "Nombre"
		new TextBox(panelPrincipal) => [
			width = 200
			height = 20
		]
		new Label(panelPrincipal).text = "Apellido"
		new TextBox(panelPrincipal) => [
			width = 200
			height = 20
		]
		new Label(panelPrincipal).text = "Edad"
		new Spinner(panelPrincipal) => [
			width = 200
		]
		new Selector(panelPrincipal) => [
			
//			Para usar estos , tenes que usar este import:
//
//			import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*
			
//			items <=> "listaDeGeneros"  // esta es la lista de donde sacas, tiene que estar en el viewModel o dominio Generalmente el modelo esta en esta clase en el generic MainWindow<CLASE>
//			value <=> "genero" // esta es la propiedad donde se la va a bindear
			
			bindItems(new ObservableProperty("listaDeGeneros"))
			bindValueToProperty("genero")
		]
		
	}
	
	def static main(String[] args) {
		new Ejercicio2().startApplication
	}
	
	
}

