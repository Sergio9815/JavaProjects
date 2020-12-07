package arbol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Recorrido extends JDialog{
    private static JPanel panel2;
    static String n1,n2,n3,n4,n5,n6,n7;
    public static JComboBox recorridos;
    public static JLabel titulo,seleccion,ico1,ico2,ico3,ico4;

    public Recorrido()
    {
        //CREA EL PANEL QUE CONTIENE LOS ELEMENTOS
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(38,50,56));
        setContentPane(panel2);

        //CREA EL TITULO DE LA VENTANA
        titulo = new JLabel("R E C O R R I D O S   D E L   A R B O L");
        titulo.setFont(new Font("Consolas",Font.BOLD,15));
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(40,20,350,50);
        panel2.add(titulo);

        //CREA LOS TITULOS DE LOS RECORRIDOS
        seleccion = new JLabel("Seleccione el recorrido: ");
        seleccion.setBounds(106,100,200,50);
        seleccion.setForeground(Color.WHITE);
        seleccion.setFont(new Font("Consolas",Font.PLAIN,13));
        panel2.add(seleccion);

        //CREA LA BARRA DESPLEGABLE CON LOS RECORRIDOS
        recorridos = new JComboBox();
        recorridos.addItem("PreOrden");
        recorridos.addItem("EnOrden");
        recorridos.addItem("PostOrden");
        recorridos.setBounds(146,150,80,20);
        panel2.add(recorridos);

        //CREA LOS ICONOS QUE CIRCULARES
        ico1 = new JLabel();
        ico1.setBounds(350,200,100,100);
        ico1.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\nodo.png"));
        panel2.add(ico1);

        ico2 = new JLabel();
        ico2.setBounds(-8,200,100,100);
        ico2.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\nodo.png"));
        panel2.add(ico2);

        ico3 = new JLabel();
        ico3.setBounds(360,0,100,100);
        ico3.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\nodo.png"));
        panel2.add(ico3);

        ico4 = new JLabel();
        ico4.setBounds(-20,0,100,100);
        ico4.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\nodo.png"));
        panel2.add(ico4);

        recorridos();
        eventos();
    }

    //ALMACENA LOS DATOS DE LOS NODOS OBTENIDOS DE LA OTRA CLASE
    private void recorridos() {
        ArbolBinario P = new ArbolBinario();
        n1 = P.nod;  n2 = P.nod2;
        n3 = P.nod3; n4 = P.nod4;
        n5 = P.nod5; n6 = P.nod6;
        n7 = P.nod7;
    }

    private void eventos()
    {
         recorridos.addActionListener(new ActionListener()
         {
                 @Override
                 public void actionPerformed(ActionEvent e)
                 {
                     String reco = String.valueOf(recorridos.getSelectedItem());

                     if("PreOrden".equals(reco))
                     {
                         JOptionPane.showMessageDialog(null,"PreOrden: "+n1+"  "+n2+"  "+n4+"  "+n5+"  "+n3+"  "+n6+"  "+n7);
                     }
                     else if("EnOrden".equals(reco))
                     {
                         JOptionPane.showMessageDialog(null,"EnOrden: "+n4+"  "+n2+"  "+n5+"  "+n1+"  "+n6+"  "+n3+"  "+n7);
                     }
                     else if("PostOrden".equals(reco))
                     {
                         JOptionPane.showMessageDialog(null,"PostOrden: "+n4+"  "+n5+"  "+n2+"  "+n6+"  "+n7+"  "+n3+"  "+n1);
                     }
                 }
         });
    }

}
