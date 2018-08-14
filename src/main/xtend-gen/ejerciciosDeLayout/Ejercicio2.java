package ejerciciosDeLayout;

import dominios.Ejercicio2Dominio;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.Spinner;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
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
    Selector<Object> _selector = new Selector<Object>(panelPrincipal);
    final Procedure1<Selector<Object>> _function_3 = new Procedure1<Selector<Object>>() {
      public void apply(final Selector<Object> it) {
        ObservableProperty<Object> _observableProperty = new ObservableProperty<Object>(Ejercicio2.this, "listaDeGeneros");
        it.<Object>bindItems(_observableProperty);
        it.<Object, ControlBuilder>bindValueToProperty("genero");
      }
    };
    ObjectExtensions.<Selector<Object>>operator_doubleArrow(_selector, _function_3);
  }
  
  public static void main(final String[] args) {
    new Ejercicio2().startApplication();
  }
}
