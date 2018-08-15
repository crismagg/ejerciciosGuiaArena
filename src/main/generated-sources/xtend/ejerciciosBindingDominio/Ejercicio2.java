package ejerciciosBindingDominio;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.annotations.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
public class Ejercicio2 {
  private int operando1;
  
  private int operando2;
  
  private int resultado;
  
  public int calcularResultado() {
    return this.resultado = (this.operando1 * this.operando2);
  }
  
  @Pure
  public int getOperando1() {
    return this.operando1;
  }
  
  public void setOperando1(final int operando1) {
    this.operando1 = operando1;
  }
  
  @Pure
  public int getOperando2() {
    return this.operando2;
  }
  
  public void setOperando2(final int operando2) {
    this.operando2 = operando2;
  }
  
  @Pure
  public int getResultado() {
    return this.resultado;
  }
  
  public void setResultado(final int resultado) {
    this.resultado = resultado;
  }
}
