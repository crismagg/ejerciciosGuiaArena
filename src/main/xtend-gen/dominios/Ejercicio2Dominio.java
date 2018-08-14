package dominios;

import java.util.Collections;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.annotations.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
public class Ejercicio2Dominio {
  private String genero;
  
  private List<String> listaDeGeneros = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("M", "F", "Otro"));
  
  @Pure
  public String getGenero() {
    return this.genero;
  }
  
  public void setGenero(final String genero) {
    this.genero = genero;
  }
  
  @Pure
  public List<String> getListaDeGeneros() {
    return this.listaDeGeneros;
  }
  
  public void setListaDeGeneros(final List<String> listaDeGeneros) {
    this.listaDeGeneros = listaDeGeneros;
  }
}
