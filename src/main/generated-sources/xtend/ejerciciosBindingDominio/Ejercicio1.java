package ejerciciosBindingDominio;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.annotations.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
public class Ejercicio1 {
  private String nombre = "";
  
  private String apellido = "";
  
  private String saludo;
  
  public String setSaludo() {
    return this.saludo = ((("Hola " + this.nombre) + " ") + this.apellido);
  }
  
  public void setNombre(final String _nombre) {
    this.nombre = _nombre;
    this.setSaludo();
  }
  
  public void setApellido(final String _apellido) {
    this.apellido = _apellido;
    this.setSaludo();
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  @Pure
  public String getApellido() {
    return this.apellido;
  }
  
  @Pure
  public String getSaludo() {
    return this.saludo;
  }
  
  public void setSaludo(final String saludo) {
    this.saludo = saludo;
  }
}
