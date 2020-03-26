import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class NuovoCliente extends JFrame implements ActionListener, WindowListener
{
    private String piva_cf ;
    private JTextField piva_cf_t;
    private String indirizzo;
    private JTextField indirizzo_t;
    private String ragsociale_nominativo;
    private JTextField ragsociale_nominativo_t;
    private String cellphone;
    private JTextField cellphone_t;
    private JLabel incorrect_value;
    private JButton salva;
    private JButton esci;
    NuovoCliente()
    {
        Dimension desktop_screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(new Point((desktop_screen.width-this.getWidth())/2,(desktop_screen.height-this.getHeight())/2));
        this.setSize(desktop_screen);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("Nuovo cliente");
        this.setResizable(true);
        JPanel panel = new JPanel();
        //elementi pannello
        incorrect_value = new JLabel("");
        incorrect_value.setForeground(Color.RED);
        JLabel id1  = new JLabel("Partita IVA o Codice Fiscale : ");
        piva_cf_t = new JTextField(30);
        JLabel id2  = new JLabel("Indirizzo : ");
        indirizzo_t = new JTextField(30);
        JLabel id3  = new JLabel("Nominativo : ");
        ragsociale_nominativo_t = new JTextField(30);
        JLabel id4  = new JLabel("Telefono : ");
        cellphone_t = new JTextField(30);
        salva = new JButton("Salva");
        esci = new JButton("Esci");
        panel.add(id1);
        panel.add(piva_cf_t);
        panel.add(id2);
        panel.add(indirizzo_t);
        panel.add(id3);
        panel.add(ragsociale_nominativo_t);
        panel.add(id4);
        panel.add(cellphone_t);
        panel.add(incorrect_value);
        panel.add(salva);
        panel.add(esci);
        this.add(panel);
        this.setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Object element = actionEvent;
        if(element== salva){this.dispose();}
        if(element== esci){this.dispose();}


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
