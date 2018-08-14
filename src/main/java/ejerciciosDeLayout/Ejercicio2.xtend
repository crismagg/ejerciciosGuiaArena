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
			bindItems(new ObservableProperty(this, "listaDeGeneros"))
			bindValueToProperty("genero")
		]
		
	}
	
	def static main(String[] args) {
		new Ejercicio2().startApplication
	}
	
	
}

