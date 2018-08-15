package ejerciciosBindingDominio;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.annotations.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
public class Ejercicio3 {
  private String frase;
  
  private String fraseAlReves;
  
  private Boolean esPalindromo;
  
  public String darVueltaFrase() {
    return this.fraseAlReves = new StringBuilder(this.frase).reverse().toString();
  }
  
  public void setFrase(final String _frase) {
    this.frase = _frase;
    this.darVueltaFrase();
    this.revisarSiEsPalindromo();
  }
  
  public Boolean revisarSiEsPalindromo() {
    return this.esPalindromo = Boolean.valueOf(this.frase.equals(this.fraseAlReves));
  }
  
  @Pure
  public String getFrase() {
    return this.frase;
  }
  
  @Pure
  public String getFraseAlReves() {
    return this.fraseAlReves;
  }
  
  public void setFraseAlReves(final String fraseAlReves) {
    this.fraseAlReves = fraseAlReves;
  }
  
  @Pure
  public Boolean getEsPalindromo() {
    return this.esPalindromo;
  }
  
  public void setEsPalindromo(final Boolean esPalindromo) {
    this.esPalindromo = esPalindromo;
  }
}
