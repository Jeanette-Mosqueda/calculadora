import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
// Leslie Jeanette Pucheta Mosqueda

/*

*/
public class calculadora extends JFrame implements ActionListener{
    private JTextField numUno;
    private JTextField numDos;
    private JButton calcular;
    private JLabel suma;
    private JLabel resta;
    private JLabel multiplicacion;
    private JLabel division;
    private JLabel modular;
    private float resultado;
    private float x;
    private float y;
    public static void main(String[] args) {
        calculadora demo = new calculadora();
        demo.setSize (400,400);
        //se crea como tal el area de la interfaz donde se agregan los elementos
        demo.createGUI ();
        //se marca que va a ser visible
        demo.setVisible(true);
    }
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //se genera el contenemor par apoder agregar los elementos
        Container window = getContentPane();
        //le mensiona el tipo de contenedor que va a ser
        window.setLayout(new FlowLayout());

        //de crea y otorga propiedades para el JTextField
        numUno = new JTextField(16);
        //permite que inicie el texto  en el Centro
        numUno.setHorizontalAlignment(JLabel.CENTER);
        //permite añadir el elemento a la interfaz dentro del contenedor
        window.add(numUno);
        //de crea y otorga propiedades para el JTextField
        numDos = new JTextField(16);
        //permite que inicie el texto  en el Centro
        numDos.setHorizontalAlignment(JLabel.CENTER);
        //permite añadir el elemento a la interfaz dentro del contenedor
        window.add(numDos);
        calcular = new JButton ("Calcular ");
        calcular.setPreferredSize(new Dimension(250,30));

        //permite añadir el elemento
        window.add(calcular);
        calcular.addActionListener(this);
        //permite añadir el elemento
        //de crea y otorgan propiedades para el JLabel
        suma = new JLabel();
        //permite que inicie el texto  en el Centro
        suma.setHorizontalAlignment(JLabel.CENTER);
        //permite añadir el elemento a la interfaz dentro del contenedor
        window.add(suma);

        //de crea y otorgan propiedades para el JLabel
        resta = new JLabel();
        //permite que inicie el texto  en el Centro
        resta.setHorizontalAlignment(JLabel.CENTER);
        //permite añadir el elemento a la interfaz dentro del contenedor
        window.add(resta);

        //de crea y otorgan propiedades para el JLabel
        multiplicacion = new JLabel();
        //permite que inicie el texto  en el Centro
        multiplicacion.setHorizontalAlignment(JLabel.CENTER);
        //permite añadir el elemento a la interfaz dentro del contenedor
        window.add(multiplicacion);

        //de crea y otorgan propiedades para el JLabel
        division = new JLabel();
        //permite que inicie el texto  en el Centro
        division.setHorizontalAlignment(JLabel.CENTER);
        //permite añadir el elemento a la interfaz dentro del contenedor
        window.add(division);

        //de crea y otorgan propiedades para el JLabel
        modular = new JLabel();
        //permite que inicie el texto  en el Centro
        modular.setHorizontalAlignment(JLabel.CENTER);
        //permite añadir el elemento a la interfaz dentro del contenedor
        window.add(modular);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //marca que va a valer segun lo que ingrese el usuario
        x=Float.parseFloat(this.numUno.getText());

        //marca que va a valer segun lo que ingrese el usuario
        y=Float.parseFloat(this.numDos.getText());
        //imprime a pantalla calculos
        this.suma.setText(new StringBuilder().append(" La suma de: "+ x +" "+ y +" es:  ").append(suma()).toString());
        this.resta.setText(new StringBuilder().append("  La Resta de: "+ x +" "+ y +" es:  ").append(resta()).toString());
        this.multiplicacion.setText(new StringBuilder().append(" La multiplicacion de: "+ x +" "+ y +" es:  ").append(multiplicacion()).toString());
        this.division.setText(new StringBuilder().append("La division de: "+ x +" "+ y +" es:  ").append(division()).toString());
        this.modular.setText(new StringBuilder().append(" El modular de: "+ x +" "+ y +" es:  ").append(modular()).toString());
    }



    private float suma() {
        resultado=x+y;
        return resultado;
    }
    private float resta() {
        resultado=x-y;
        return resultado;
    }
    private float multiplicacion() {
        resultado=x*y;
        return resultado;
    }
    private float division() {
        resultado=x/y;
        return resultado;
    }
    private float modular() {
        resultado=x%y;
        return resultado;
    }


}
