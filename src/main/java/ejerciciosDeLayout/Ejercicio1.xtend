package ejerciciosDeLayout

import org.uqbar.arena.windows.MainWindow
import dominios.Ejercicio1Dominio
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Label
//import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button


class Ejercicio1 extends MainWindow<Ejercicio1Dominio>{
	new(){
		super(new Ejercicio1Dominio)
	}
	
	override createContents(Panel panelPrincipal){
		this.title = "Ejercicio 1"
//		panelPrincipal.layout = new VerticalLayout 
		
		new Label(panelPrincipal).text = "Operando1"
		new TextBox(panelPrincipal) => [
			width = 200
			height = 20
		]
		new Label(panelPrincipal).text = "Operando2"
		new TextBox(panelPrincipal) => [
			width = 200
			height = 20
		]
	
		val Panel panelDeOperadores = new Panel(panelPrincipal)
		panelDeOperadores.layout = new HorizontalLayout
		
		new Button(panelDeOperadores) => [
			caption = "+"
			width = 50
		]
		new Button(panelDeOperadores) => [
			caption = "-"
			width = 50
		]
		new Button(panelDeOperadores) => [
			caption = "*"
			width = 50
		]
		new Button(panelDeOperadores) => [
			caption = "/"
			width = 50
		]
		
		new Label(panelPrincipal).text = "Resultado"
		
		new TextBox(panelPrincipal) => [
			width = 200
			height = 20
			bindEnabledToProperty("desactivado")
		]
		
	}
	
	def static main(String[] args) {
		new Ejercicio1().startApplication
	}
	
}