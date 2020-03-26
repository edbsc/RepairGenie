import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuovaPratica extends JFrame implements ActionListener
{
    private JButton nuovo_cliente ;
    private JButton pratica_vecchio_cliente;
    private JButton menu_principale ;
    protected static boolean nc = false;
    protected static boolean vc = false;
    NuovaPratica()
    {
        this.setSize(700,500);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("Nuova Pratica");
        Dimension desktop_screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(new Point((desktop_screen.width-this.getWidth())/2,(desktop_screen.height-this.getHeight())/2));
        JPanel panel = new JPanel();
        JLabel titolo = new JLabel("Se il cliente e nuovo premi 'Nuovo Cliente' altrimenti premi Nuovo");
        nuovo_cliente = new JButton("Nuovo cliente");
        pratica_vecchio_cliente = new JButton("Nuovo");
        menu_principale = new JButton("Indietro");
        panel.add(titolo);
        panel.add(nuovo_cliente);
        panel.add(pratica_vecchio_cliente);
        panel.add(menu_principale);
        this.add(panel);
        this.setVisible(true);
        nuovo_cliente.addActionListener(this);
        pratica_vecchio_cliente.addActionListener(this);
        menu_principale.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Object element = actionEvent.getSource();
        Object p;
        if(actionEvent.getSource()==menu_principale && !nc && !vc)
        {  MainWindow.is_win_opened=false; this.dispose(); }
        if(actionEvent.getSource()== nuovo_cliente && !nc && !vc){nc = true; p = new NuovoCliente();}

    }
}
