package ejerciciosDeLayout;

import dominios.Ejercicio2Dominio;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.bindings.ObservableValue;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.RadioSelector;
import org.uqbar.arena.widgets.Spinner;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.xtend.ArenaXtendExtensions;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class Ejercicio2 extends MainWindow<Ejercicio2Dominio> {
  public Ejercicio2() {
    super(new Ejercicio2Dominio());
  }
  
  public void createContents(final Panel panelPrincipal) {
    this.setTitle("Ejercicio 2");
    ColumnLayout _columnLayout = new ColumnLayout(2);
    panelPrincipal.setLayout(_columnLayout);
    Label _label = new Label(panelPrincipal);
    _label.setText("Nombre");
    TextBox _textBox = new TextBox(panelPrincipal);
    final Procedure1<TextBox> _function = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.setWidth(200);
        it.setHeight(20);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function);
    Label _label_1 = new Label(panelPrincipal);
    _label_1.setText("Apellido");
    TextBox _textBox_1 = new TextBox(panelPrincipal);
    final Procedure1<TextBox> _function_1 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.setWidth(200);
        it.setHeight(20);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox_1, _function_1);
    Label _label_2 = new Label(panelPrincipal);
    _label_2.setText("Edad");
    Spinner _spinner = new Spinner(panelPrincipal);
    final Procedure1<Spinner> _function_2 = new Procedure1<Spinner>() {
      public void apply(final Spinner it) {
        it.setWidth(200);
      }
    };
    ObjectExtensions.<Spinner>operator_doubleArrow(_spinner, _function_2);
    RadioSelector<Object> _radioSelector = new RadioSelector<Object>(panelPrincipal);
    final Procedure1<RadioSelector<Object>> _function_3 = new Procedure1<RadioSelector<Object>>() {
      public void apply(final RadioSelector<Object> it) {
        ObservableProperty<Object> _observableProperty = new ObservableProperty<Object>("listaDeGeneros");
        it.<Object>bindItems(_observableProperty);
        it.<Object, ControlBuilder>bindValueToProperty("genero");
      }
    };
    ObjectExtensions.<RadioSelector<Object>>operator_doubleArrow(_radioSelector, _function_3);
    ObservableValue<Control, ControlBuilder> _value = new Label(panelPrincipal).<ControlBuilder>value();
    ArenaXtendExtensions.operator_spaceship(_value, "genero");
  }
  
  public static void main(final String[] args) {
    new Ejercicio2().startApplication();
  }
}
