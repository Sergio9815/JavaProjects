import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Misterioso extends JFrame{
    private JPanel panel;
    public static JMenuBar menu;
    public static JMenu file,help;
    public static JMenuItem nuevo,inst;
    public static JLabel titulos,tablero;
    public static JButton verificar,salir;
    public static JTextField c1,c2,c3,c4,c5,c6,c7,c8,c9;

    public Misterioso()
    {
        //CREA EL CONTENEDOR PARA LOS BOTONES E IMAGENES
        panel = new JPanel();
        panel.setBackground(new Color(38,50,56));
        panel.setLayout(null);
        setContentPane(panel);

        //CREA LA BARRA SUPERIOR PARA CONTENER LOS BOTONES DEL MENU
        menu = new JMenuBar();
        menu.setBorderPainted(false);
        menu.setBackground(new Color(38,50,56));
        menu.setBounds(0,0,200,20);
        panel.add(menu);

        //CREA LOS BOTONES QUE SE MUESTRAN EN LA BARRA DE MENU
        file = new JMenu("Archivo");
        file.setForeground(Color.WHITE);
        help = new JMenu("Ayuda");
        help.setForeground(Color.WHITE);

        //CREA LOS BOTONES ASOCIADOS A LOS DE ARCHIVO Y AYUDA
        nuevo = new JMenuItem("Juego Nuevo");
        inst = new JMenuItem("Instrucciones");

        //AÑADE LOS BOTONES A LA BARRA DE MENU
        menu.add(file);
        menu.add(help);
        file.add(nuevo);
        help.add(inst);

        //Muestra el titulo del juego en la ventana
        titulos = new JLabel("15  M I S T E R I O S O");
        titulos.setFont(new Font("Consolas",Font.BOLD,25));
        titulos.setForeground(Color.WHITE);
        titulos.setBounds(230,50,400,50);
        panel.add(titulos);

        //CREA LA TABLA PARA INGRESAR LOS VALORES
        c1 = new JTextField();
        c1.setBounds(295,215,35,35);
        panel.add(c1);

        c2 = new JTextField();
        c2.setBounds(365,215,35,35);
        panel.add(c2);

        c3 = new JTextField();
        c3.setBounds(435,215,35,35);
        panel.add(c3);

        c4 = new JTextField();
        c4.setBounds(295,285,35,35);
        panel.add(c4);

        c5 = new JTextField();
        c5.setBounds(365,285,35,35);
        panel.add(c5);

        c6 = new JTextField();
        c6.setBounds(435,285,35,35);
        panel.add(c6);

        c7 = new JTextField();
        c7.setBounds(295,355,35,35);
        panel.add(c7);

        c8 = new JTextField();
        c8.setBounds(365,355,35,35);
        panel.add(c8);

        c9 = new JTextField();
        c9.setBounds(435,355,35,35);
        panel.add(c9);

        //MUESTRA LA IMAGEN DEL TABLERO
        tablero = new JLabel();
        tablero.setBounds(130,150,500,300);
        tablero.setIcon(new ImageIcon("C:\\Users\\gserg\\Documents\\Java Projects\\15_Misterioso\\Imagenes\\board.png"));
        panel.add(tablero);

        //CREA EL BOTON PARA VERIFICAR
        verificar = new JButton("Verificar");
        verificar.setFocusPainted(false);
        verificar.setContentAreaFilled(false);
        verificar.setBorderPainted(false);
        verificar.setForeground(Color.WHITE);
        verificar.setFont(new Font("Consolas",Font.PLAIN,12));
        verificar.setVerticalTextPosition(SwingConstants.BOTTOM);
        verificar.setHorizontalTextPosition(SwingConstants.CENTER);
        verificar.setIcon(new ImageIcon("C:\\Users\\gserg\\Documents\\Java Projects\\15_Misterioso\\Imagenes\\check.png"));
        verificar.setBounds(215,480,100,100);
        panel.add(verificar);

        //CREA EL BOTON PARA VERIFICAR
        salir = new JButton("Salir");
        salir.setFocusPainted(false);
        salir.setContentAreaFilled(false);
        salir.setBorderPainted(false);
        salir.setForeground(Color.WHITE);
        salir.setFont(new Font("Consolas",Font.PLAIN,12));
        salir.setVerticalTextPosition(SwingConstants.BOTTOM);
        salir.setHorizontalTextPosition(SwingConstants.CENTER);
        salir.setIcon(new ImageIcon("C:\\Users\\gserg\\Documents\\Java Projects\\15_Misterioso\\Imagenes\\close.png"));
        salir.setBounds(450,480,100,100);
        panel.add(salir);

        eventos();
    }

    private void eventos()
    {
           nuevo.addActionListener(new ActionListener()
           {
               @Override
               public void actionPerformed(ActionEvent e)
               {
                   c1.setText(null);
                   c2.setText(null);
                   c3.setText(null);
                   c4.setText(null);
                   c5.setText(null);
                   c6.setText(null);
                   c7.setText(null);
                   c8.setText(null);
                   c9.setText(null);

               }
           });

            salir.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e) { System.exit(0); }
            });

            inst.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                   Help dialog = new Help();
                   dialog.setVisible(true);
                   dialog.setBounds(800,80,400,300);
                   dialog.setResizable(false);
                   dialog.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\gserg\\Documents\\Java Projects\\15_Misterioso\\Imagenes\\nube.png"));
                   dialog.setTitle("By Sergio Gonzalez");
                }
            });

            verificar.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    int x1,x2,x3,x4,x5,x6,x7,x8,x9;
                    int ver,ver2,ver3,ver4,ver5,ver6,ver7,ver8;
                    ver = ver2 = ver3 = ver4 = ver5 = ver6 = ver7 = ver8 = 0;

                    x1 = Integer.parseInt(c1.getText());
                    x2 = Integer.parseInt(c2.getText());
                    x3 = Integer.parseInt(c3.getText());
                    x4 = Integer.parseInt(c4.getText());
                    x5 = Integer.parseInt(c5.getText());
                    x6 = Integer.parseInt(c6.getText());
                    x7 = Integer.parseInt(c7.getText());
                    x8 = Integer.parseInt(c8.getText());
                    x9 = Integer.parseInt(c9.getText());

                    if((x1 + x2 + x3) == 15 )
                    {
                        ver = 1;
                    }
                    if((x4 + x5 + x6) == 15 )
                    {
                        ver2 = 1;
                    }
                    if((x7 + x8 + x9) == 15 )
                    {
                        ver3 = 1;
                    }
                    if((x1 + x4 + x7) == 15 )
                    {
                        ver4 = 1;
                    }
                    if((x2 + x5 + x8) == 15 )
                    {
                        ver5 = 1;
                    }
                    if((x3 + x6 + x9) == 15 )
                    {
                        ver6 = 1;
                    }
                    if((x1 + x5 + x9) == 15 )
                    {
                        ver7 = 1;
                    }
                    if((x3 + x5 + x7) == 15 )
                    {
                        ver8 = 1;
                    }

                    if(ver == 1 && ver2 == 1 && ver3 == 1 && ver4 == 1 && ver5 == 1 && ver6 == 1 && ver7 == 1 && ver8 == 1 )
                    {
                        JOptionPane.showMessageDialog(null,"¡Enhorabuena has completado el juego!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"            ¡GAME OVER!");
                    }

                }
            });

    }

    //CREA LA VENTANA PRIMCIPAL DEL JUEGO
    public static void main(String[] args)
    {
        Misterioso frame = new Misterioso();
        frame.setVisible(true);
        frame.setTitle("By Sergio Gonzalez");
        frame.setResizable(false);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\gserg\\Documents\\Java Projects\\15_Misterioso\\Imagenes\\nube.png"));
        frame.setBounds(290,80,800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
