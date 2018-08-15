package dominios;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.annotations.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
public class Ejercicio1Dominio {
  private boolean desactivado = false;
  
  @Pure
  public boolean isDesactivado() {
    return this.desactivado;
  }
  
  public void setDesactivado(final boolean desactivado) {
    this.desactivado = desactivado;
  }
}
