package view;

import javax.swing.*;

import java.awt.Color;
import java.awt.Container;

public class Login extends JFrame {
    private JLabel lblnome;
    private JTextField txtnome;
    private JLabel lblsenha;
    private JPasswordField pswsenha;
    private JButton btnentrar;
    private JButton btncancelar;
    private Container ctn;

    /**
     * 
     */
    public Login (){

        setSize (500,400);
        setTitle("LOGIN");
        setBackground(Color.DARK_GRAY);
        ctn = getContentPane();

        lblnome = new JLabel("nome");
        txtnome = new JTextField();
        lblsenha = new JLabel("senha");
        pswsenha = new JPasswordField();
        btnentrar = new JButton("Enviar");
        btncancelar = new JButton("Cancelar");
        ctn.setLayout(null);

        lblnome.setBounds(80, 40, 100, 25);
        txtnome.setBounds(130, 40, 200, 25);
        lblsenha.setBounds(80, 80, 100, 25);
        pswsenha.setBounds(130, 80, 200, 25);
        btnentrar.setBounds(130, 130, 80, 20);
        btncancelar.setBounds(240, 130, 90, 20);

        ctn.add(lblnome);
        ctn.add(txtnome);
        ctn.add(lblsenha);
        ctn.add(pswsenha);
        ctn.add(btnentrar);
        ctn.add(btncancelar);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

    }

    public void buttonAction(){

    }

    public static void main(String [] args){
            Login login = new Login();
    }

}
