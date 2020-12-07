package arbol;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArbolBinario extends JFrame{
    static int datos,aux = 0,aux2 = 0,aux3 = 0,num,c,i = 0;
    static short n2,n3,n4,n5,n6,n7,cont = 1;
    static int[] vector = new int[8];
    static String nod,nod2,nod3,nod4,nod5,nod6,nod7;
    private JPanel panel;
    public static JTextField ingresar;
    public static JButton buscar,salir,recorrido,insertar;
    public static JLabel nodo1,nodo2,nodo3,nodo4,nodo5,nodo6,nodo7,titulo;

    //DISEÑO DE LA VENTANA
    public ArbolBinario()
    {
        //CREA EL PANEL CONTENEDOR DE LOS BOTONES E IMAGENES
        panel = new JPanel();
        panel.setBackground(new Color(38, 50,56));
        panel.setLayout(null);
        setContentPane(panel);

        //TITULO DEL PROGRAMA
        titulo = new JLabel("A R B O L  B I N A R I O");
        titulo.setBounds(230,5,400,60);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Consolas",Font.BOLD,25));
        panel.add(titulo);

        //TEXTO PARA INGRESAR DATOS
        titulo = new JLabel("INGRESE LOS DATOS DEL ARBOL:");
        titulo.setBounds(30,480,400,60);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Consolas",Font.BOLD,15));
        panel.add(titulo);

        //CREA LA CAJA DE TEXTO PARA INGRESAR LOS DATOS
        ingresar = new JTextField();
        ingresar.setBounds(265,495,100,25);
        panel.add(ingresar);

        //CREA LOS NODOS DEL ARBOL
        nodo1 = new JLabel();
        nodo1.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\nodo.png"));
        nodo1.setFont(new Font("Consolas",Font.BOLD,15));
        nodo1.setHorizontalTextPosition(SwingConstants.CENTER);
        nodo1.setForeground(new Color(38, 50,56));
        nodo1.setBounds(350,70,300,100);
        panel.add(nodo1);

        nodo2 = new JLabel();
        nodo2.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\nodo.png"));
        nodo2.setFont(new Font("Consolas",Font.BOLD,15));
        nodo2.setHorizontalTextPosition(SwingConstants.CENTER);
        nodo2.setForeground(new Color(38, 50,56));
        nodo2.setBounds(250,200,300,100);
        panel.add(nodo2);

        nodo3 = new JLabel();
        nodo3.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\nodo.png"));
        nodo3.setFont(new Font("Consolas",Font.BOLD,15));
        nodo3.setHorizontalTextPosition(SwingConstants.CENTER);
        nodo3.setForeground(new Color(38, 50,56));
        nodo3.setBounds(450,200,300,100);
        panel.add(nodo3);

        nodo4 = new JLabel();
        nodo4.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\nodo.png"));
        nodo4.setFont(new Font("Consolas",Font.BOLD,15));
        nodo4.setHorizontalTextPosition(SwingConstants.CENTER);
        nodo4.setForeground(new Color(38, 50,56));
        nodo4.setBounds(150,330,300,100);
        panel.add(nodo4);

        nodo5 = new JLabel();
        nodo5.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\nodo.png"));
        nodo5.setFont(new Font("Consolas",Font.BOLD,15));
        nodo5.setHorizontalTextPosition(SwingConstants.CENTER);
        nodo5.setForeground(new Color(38, 50,56));
        nodo5.setBounds(300,330,300,100);
        panel.add(nodo5);

        nodo6 = new JLabel();
        nodo6.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\nodo.png"));
        nodo6.setFont(new Font("Consolas",Font.BOLD,15));
        nodo6.setHorizontalTextPosition(SwingConstants.CENTER);
        nodo6.setForeground(new Color(38, 50,56));
        nodo6.setBounds(420,330,300,100);
        panel.add(nodo6);

        nodo7 = new JLabel();
        nodo7.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\nodo.png"));
        nodo7.setFont(new Font("Consolas",Font.BOLD,15));
        nodo7.setHorizontalTextPosition(SwingConstants.CENTER);
        nodo7.setForeground(new Color(38, 50,56));
        nodo7.setBounds(550,330,300,100);
        panel.add(nodo7);

        //CREA EL BOTON PARA BUSCAR ELEMENTOS
        buscar = new JButton("Buscar elemento");
        buscar.setVerticalTextPosition(SwingConstants.BOTTOM);
        buscar.setHorizontalTextPosition(SwingConstants.CENTER);
        buscar.setFont(new Font("Consolas",Font.PLAIN,10));
        buscar.setForeground(Color.WHITE);
        buscar.setContentAreaFilled(false);
        buscar.setFocusPainted(false);
        buscar.setBorderPainted(false);
        buscar.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\buscar.png"));
        buscar.setBounds(-45,45,200,100);
        panel.add(buscar);

        //CREA EL BOTON PARA VER LOS RECORRIDOS
        recorrido = new JButton("Mostrar Recorridos");
        recorrido.setBounds(630,45,200,100);
        recorrido.setContentAreaFilled(false);
        recorrido.setHorizontalTextPosition(SwingConstants.CENTER);
        recorrido.setVerticalTextPosition(SwingConstants.BOTTOM);
        recorrido.setBorderPainted(false);
        recorrido.setFocusPainted(false);
        recorrido.setFont(new Font("Consolas",Font.PLAIN,10));
        recorrido.setForeground(Color.WHITE);
        recorrido.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\reco.png"));
        panel.add(recorrido);

        //CREA EL BOTON PARA INSERTAR LOS ELEMENTOS EN EL ARBOL
        insertar = new JButton("Insertar");
        insertar.setBounds(400,460,200,100);
        insertar.setContentAreaFilled(false);
        insertar.setHorizontalTextPosition(SwingConstants.CENTER);
        insertar.setVerticalTextPosition(SwingConstants.BOTTOM);
        insertar.setBorderPainted(false);
        insertar.setFocusPainted(false);
        insertar.setFont(new Font("Consolas",Font.BOLD,13));
        insertar.setForeground(Color.WHITE);
        insertar.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\add.png"));
        panel.add(insertar);

        //CREA EL BOTON PARA SALIR
        salir = new JButton("Salir");
        salir.setBounds(590,460,100,100);
        salir.setContentAreaFilled(false);
        salir.setHorizontalTextPosition(SwingConstants.CENTER);
        salir.setVerticalTextPosition(SwingConstants.BOTTOM);
        salir.setBorderPainted(false);
        salir.setFocusPainted(false);
        salir.setFont(new Font("Consolas",Font.BOLD,13));
        salir.setForeground(Color.WHITE);
        salir.setIcon(new ImageIcon("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\close.png"));
        panel.add(salir);

        accionBotones();

    }

    //ACCION DE LOS BOTONES
    public void accionBotones()
    {

            insertar.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                        datos = Integer.parseInt(ingresar.getText());
                        vector[i] = datos;

                        if (cont == 1)
                        {
                            nodo1.setText(String.valueOf(datos));
                            nod = String.valueOf(datos);
                            aux = datos;
                        }

                        if (datos < aux)
                        {

                            if (n2 != 1)
                            {
                                aux2 = datos;
                                nodo2.setText(String.valueOf(datos));
                                nod2 = String.valueOf(datos);
                                n2++;
                            }

                            if (datos < aux2)
                            {
                                if (n4 != 1)
                                {
                                    nodo4.setText(String.valueOf(datos));
                                    nod4 = String.valueOf(datos);
                                    n4++;
                                }

                            } else if (datos > aux2)
                            {
                                if (n5 != 1)
                                {
                                    nodo5.setText(String.valueOf(datos));
                                    nod5 = String.valueOf(datos);
                                    n5++;
                                }

                            }

                        } else if (datos > aux)
                        {
                            if (n3 != 1)
                            {
                                aux3 = datos;
                                nodo3.setText(String.valueOf(datos));
                                nod3 = String.valueOf(datos);
                                n3++;
                            }

                            if (datos < aux3)
                            {
                                if (n6 != 1)
                                {
                                    nodo6.setText(String.valueOf(datos));
                                    nod6 = String.valueOf(datos);
                                    n6++;
                                }

                            } else if (datos > aux3)
                            {
                                if (n7 != 1)
                                {
                                    nodo7.setText(String.valueOf(datos));
                                    nod7 = String.valueOf(datos);
                                    n7++;
                                }

                            }

                        }

                        cont++;
                        datos = 0;
                        i++;
                }
            });


            //Bonton para puscar elementos
            buscar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a buscar"));
                    c = 0;
                    for(int i = 0; i <= 6; i++)
                    {
                       if(vector[i] == num)
                       {
                           num = vector[i];
                           c++;
                       }

                    }
                    if(c > 0)
                    {
                        JOptionPane.showMessageDialog(null,"Elemento encontrado: "+num);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Elemento no encontrado");
                    }
                }
            });

            //Boton para ver los recorridos y acceder a la ventana dialog
            recorrido.addActionListener(new ActionListener()
            {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        Recorrido dialog = new Recorrido();
                        dialog.setResizable(false);
                        dialog.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\sombra.jpg"));
                        dialog.setTitle("By Sergio Gonzalez");
                        dialog.setVisible(true);
                        dialog.setBounds(100,90,400,300);
                    }
            });

            //Boton para cerrar el programa
            salir.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    JOptionPane.showMessageDialog(null,"       ¡¡¡HASTA PRONTO!!!");
                    System.exit(0);
                }
            });
    }


    //CREA LA VENTANA
    public static void main(String[] args)
    {
        ArbolBinario frame = new ArbolBinario();
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\gserg\\Google Drive\\Proyectos\\Java Projects\\ArbolBinario\\Imagenes\\sombra.jpg"));
        frame.setTitle("By Sergio Gonzalez");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds(275,90,800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
