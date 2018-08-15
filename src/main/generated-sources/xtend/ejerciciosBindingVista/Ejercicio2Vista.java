package ejerciciosBindingVista;

import ejerciciosBindingDominio.Ejercicio2;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.ObservableValue;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.xtend.ArenaXtendExtensions;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class Ejercicio2Vista extends MainWindow<Ejercicio2> {
  public Ejercicio2Vista() {
    super(new Ejercicio2());
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("Ejercicio 2 Binding");
    Label _label = new Label(mainPanel);
    _label.setText("Operando1");
    TextBox _textBox = new TextBox(mainPanel);
    final Procedure1<TextBox> _function = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "operando1");
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function);
    Label _label_1 = new Label(mainPanel);
    _label_1.setText("Operando2");
    TextBox _textBox_1 = new TextBox(mainPanel);
    final Procedure1<TextBox> _function_1 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "operando2");
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox_1, _function_1);
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("*");
        final Action _function = new Action() {
          public void execute() {
            Ejercicio2Vista.this.getModelObject().calcularResultado();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_2);
    ObservableValue<Control, ControlBuilder> _value = new Label(mainPanel).<ControlBuilder>value();
    ArenaXtendExtensions.operator_spaceship(_value, "resultado");
  }
  
  public static void main(final String[] args) {
    new Ejercicio2Vista().startApplication();
  }
}
