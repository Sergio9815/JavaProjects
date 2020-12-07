import javax.swing.*;
import java.awt.*;

public class Help extends JDialog{
    private JPanel panel;
    public static JTextArea ayudas;
    public static JLabel titulo;

    public Help()
    {
        panel = new JPanel();
        panel.setBackground(new Color(38,50,56));
        panel.setLayout(null);
        setContentPane(panel);

        titulo = new JLabel("INSTRUCCIONES");
        titulo.setFont(new Font("Consolas",Font.BOLD,20));
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(120,20,200,20);
        panel.add(titulo);

        titulo = new JLabel("¡Buena Suerte!");
        titulo.setFont(new Font("Consolas",Font.BOLD,20));
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(115,230,200,20);
        panel.add(titulo);

        titulo = new JLabel();
        titulo.setIcon(new ImageIcon("C:\\Users\\gserg\\Documents\\Java Projects\\15_Misterioso\\Imagenes\\lucky.png"));
        titulo.setBounds(50,180,100,100);
        panel.add(titulo);

        ayudas = new JTextArea();
        ayudas.setText("\n\n  * Debe colocar números del 1 al 9 sin repetirlos.\n\n  * La suma de los números ingresados horizontalmente," +
                "\n\n  * verticamente y diagonalmente deben ser igual a 15." +
                "\n\n  * De esta forma usted gana el juego.");
        ayudas.setBackground(new Color(38,50,56));
        ayudas.setFont(new Font("Consolas",Font.PLAIN,12));
        ayudas.setForeground(Color.WHITE);
        ayudas.setBounds(0,40,400,300);
        panel.add(ayudas);

    }

}
