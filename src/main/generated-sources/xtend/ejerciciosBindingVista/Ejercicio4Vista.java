package ejerciciosBindingVista;

import ejerciciosBindingDominio.Ejercicio4;
import ejerciciosBindingVista.Ejercicio2Vista;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.ObservableValue;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.xtend.ArenaXtendExtensions;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class Ejercicio4Vista extends MainWindow<Ejercicio4> {
  public Ejercicio4Vista() {
    super(new Ejercicio4());
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("Ejercicio 4 Binding");
    Label _label = new Label(mainPanel);
    _label.setText("Tweet");
    TextBox _textBox = new TextBox(mainPanel);
    final Procedure1<TextBox> _function = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "");
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function);
  }
  
  public static void main(final String[] args) {
    new Ejercicio2Vista().startApplication();
  }
}
