import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class NuovaRiparazione extends JFrame implements ActionListener, WindowListener
{
    private String num_p;
    private String cliente;
    private String telefono;
    private String data_inizio;
    private String ultimo_agg;
    private String desc_problema;
    private String marca;
    private String modello;
    private String tipologia;


    NuovaRiparazione()
    {
        Dimension desktop_screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(new Point((desktop_screen.width-this.getWidth())/2,(desktop_screen.height-this.getHeight())/2));
        this.setSize(desktop_screen);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("Nuova pratica");
        this.setResizable(true);
        JPanel panel = new JPanel();
        JLabel id1 = new JLabel("Numero Pratica :");
        JLabel id2 = new JLabel("");
        JLabel id3 = new JLabel("");
        JLabel id4 = new JLabel("");
        JLabel id5 = new JLabel("");
        JLabel id6 = new JLabel("");
        JLabel id7 = new JLabel("");

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
