package ejerciciosDeLayout;

import dominios.Ejercicio1Dominio;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class Ejercicio1 extends MainWindow<Ejercicio1Dominio> {
  public Ejercicio1() {
    super(new Ejercicio1Dominio());
  }
  
  public void createContents(final Panel panelPrincipal) {
    this.setTitle("Ejercicio 1");
    Label _label = new Label(panelPrincipal);
    _label.setText("Operando1");
    TextBox _textBox = new TextBox(panelPrincipal);
    final Procedure1<TextBox> _function = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.setWidth(200);
        it.setHeight(20);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function);
    Label _label_1 = new Label(panelPrincipal);
    _label_1.setText("Operando2");
    TextBox _textBox_1 = new TextBox(panelPrincipal);
    final Procedure1<TextBox> _function_1 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.setWidth(200);
        it.setHeight(20);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox_1, _function_1);
    final Panel panelDeOperadores = new Panel(panelPrincipal);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelDeOperadores.setLayout(_horizontalLayout);
    Button _button = new Button(panelDeOperadores);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("+");
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_2);
    Button _button_1 = new Button(panelDeOperadores);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("-");
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_3);
    Button _button_2 = new Button(panelDeOperadores);
    final Procedure1<Button> _function_4 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("*");
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_4);
    Button _button_3 = new Button(panelDeOperadores);
    final Procedure1<Button> _function_5 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("/");
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_3, _function_5);
    Label _label_2 = new Label(panelPrincipal);
    _label_2.setText("Resultado");
    TextBox _textBox_2 = new TextBox(panelPrincipal);
    final Procedure1<TextBox> _function_6 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.setWidth(200);
        it.setHeight(20);
        it.<ControlBuilder>bindEnabledToProperty("desactivado");
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox_2, _function_6);
  }
  
  public static void main(final String[] args) {
    new Ejercicio1().startApplication();
  }
}
