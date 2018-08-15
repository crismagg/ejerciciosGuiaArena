package ejerciciosBindingVista;

import ejerciciosBindingDominio.Ejercicio1;
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
public class Ejercicio1Vista extends MainWindow<Ejercicio1> {
  public Ejercicio1Vista() {
    super(new Ejercicio1());
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("Ejercicio 1");
    Label _label = new Label(mainPanel);
    _label.setText("Nombre");
    TextBox _textBox = new TextBox(mainPanel);
    final Procedure1<TextBox> _function = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "nombre");
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function);
    Label _label_1 = new Label(mainPanel);
    _label_1.setText("Apellido");
    TextBox _textBox_1 = new TextBox(mainPanel);
    final Procedure1<TextBox> _function_1 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "apellido");
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox_1, _function_1);
    Label _label_2 = new Label(mainPanel);
    final Procedure1<Label> _function_2 = new Procedure1<Label>() {
      public void apply(final Label it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "saludo");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_2);
  }
  
  public static void main(final String[] args) {
    new Ejercicio1Vista().startApplication();
  }
}
