package ejerciciosBindingDominio;

import java.awt.Color;
import org.uqbar.arena.bindings.ValueTransformer;

@SuppressWarnings("all")
public class TransformerColor implements ValueTransformer<Boolean, Color> {
  public Class<Boolean> getModelType() {
    return Boolean.class;
  }
  
  public Class<Color> getViewType() {
    return Color.class;
  }
  
  public Color modelToView(final Boolean valueFromModel) {
    Color _xifexpression = null;
    if ((valueFromModel).booleanValue()) {
      _xifexpression = Color.BLUE;
    } else {
      _xifexpression = Color.RED;
    }
    return _xifexpression;
  }
  
  public Boolean viewToModel(final Color valueFromView) {
    return null;
  }
}
