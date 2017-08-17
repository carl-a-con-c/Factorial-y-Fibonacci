
package maincal;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Cal extends JFrame {

   
    private JButton factorial, sumar, multiplicar, dividir, cerrar, acerca;
  int resultado=0;
  private JTextField num; 
    
    public Cal(){
        Calculadora cdep= new Calculadora ();
        configuraVentana();
        iniciarComponentes();
    }

    
    private void configuraVentana() {
        
       setTitle("CALCULADORA" );
       setSize(500, 300);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        factorial =new JButton ("Factorial");
        sumar = new JButton ("Fibbonacci");
        multiplicar = new JButton ("multiplicar");
        dividir= new JButton ("dividir");
        num = new JTextField ("Inserte un numero");
        num.setSize(100, 50);
        
        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               accionfibonacci();   
               }
        });
        
        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accionFactorial();
            }
        });
        
        
        
        setLayout (new FlowLayout ());
        add(factorial);
        add(sumar);
        add(num);
        
        setLocation (300,100);
        setVisible(true);
        
    }
private void accionfibonacci(){
    Calculadora cdep = new Calculadora ();
    String numero=num.getText();
    cdep.setNum1(Integer.parseInt(numero));
    int factorialRes=cdep.fibonacci();
    JOptionPane.showMessageDialog(this, "El resultado es: " + factorialRes);
    
}
private void accionFactorial(){
    Calculadora cdep = new Calculadora ();
    String numero=num.getText();
    cdep.setNum1(Integer.parseInt(numero));
    int factorialRes=cdep.factorial();
    JOptionPane.showMessageDialog(this, "El resultado es: " + factorialRes);
    
}
  
}
