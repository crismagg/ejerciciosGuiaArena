package ejerciciosBindingVista;

import ejerciciosBindingDominio.Ejercicio3;
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
public class Ejercicio3Vista extends MainWindow<Ejercicio3> {
  public Ejercicio3Vista() {
    super(new Ejercicio3());
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("Ejercicio 3 Binding");
    Label _label = new Label(mainPanel);
    _label.setText("Frase");
    TextBox _textBox = new TextBox(mainPanel);
    final Procedure1<TextBox> _function = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "frase");
        it.setWidth(200);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function);
    Label _label_1 = new Label(mainPanel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
  }
  
  public static void main(final String[] args) {
    new Ejercicio3Vista().startApplication();
  }
}
