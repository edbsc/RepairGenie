import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import java.time.LocalDate;

public class NuovaRiparazione extends JFrame implements ActionListener, WindowListener
{
    private String num_p ="123456" ;
    private String cliente;
    private String telefono;
    private String data_inizio;
    private String desc_problema;
    private String marca;
    private String modello;
    private String tipologia;
    private JComboBox lista_clienti;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JTextField  tf7;
    private JButton salva;
    private JButton esci;
    private String [] clienti_db = {"tizio","caio","tizio","caio","tizio","caio","tizio","caio","tizio","caio","tizio","caio","tizio","caio","tizio","caio","tizio","caio","tizio","caio","tizio","caio","tizio","caio"};



    NuovaRiparazione()
    {
        Dimension desktop_screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(new Point((desktop_screen.width-this.getWidth())/2,(desktop_screen.height-this.getHeight())/2));
        this.setSize(desktop_screen);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("Nuova pratica");
        this.setResizable(true);
        data_inizio= LocalDate.now().toString();
        JPanel panel = new JPanel();
        //elementi pannello
        JLabel id1 = new JLabel("Numero Pratica : "+ num_p);
        JLabel id2 = new JLabel("Cliente : ");
        JLabel id3 = new JLabel("Telefono : ");
        JLabel id4 = new JLabel("Data : " + data_inizio);
        JLabel id5 = new JLabel("Descrizione Problema : ");
        JLabel id6 = new JLabel("Marca : ");
        JLabel id7 = new JLabel("Modello : ");
        JLabel id8 = new JLabel("Tipologia : ");
        lista_clienti = new JComboBox(clienti_db);
        JScrollPane scroll_list_clienti = new JScrollPane(lista_clienti);

        tf2 = new JTextField(30);
        tf3 = new JTextField(30);
        tf4 = new JTextField(30);
        tf5 = new JTextField(30);
        tf6 = new JTextField(30);
        tf7 = new JTextField(30);
        salva = new JButton("Salva");
        esci = new JButton("esci");
        //compongo finestra
        panel.add(id1);
        panel.add(id2);
        panel.add(scroll_list_clienti);
        panel.add(id3);
        panel.add(tf2);
        panel.add(id4);
        panel.add(id5);
        panel.add(tf3);
        panel.add(id6);
        panel.add(tf4);
        panel.add(id7);
        panel.add(tf5);
        panel.add(id8);
        panel.add(tf6);
        panel.add(salva);
        panel.add(esci);
        this.add(panel);
        this.setVisible(true);
        this.addWindowListener(this);
        salva.addActionListener(this);
        esci.addActionListener(this);

    }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }
}
