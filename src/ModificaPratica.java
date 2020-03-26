import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ModificaPratica extends JFrame implements ActionListener, WindowListener
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
    private String lavoro_prec_eseguito;
    private JTextArea descrizione_lavoro;
    private JButton confirm ;
    private JButton indietro ;
    private JButton elimina;
    private JCheckBox chiusura_pratica;
    private boolean cp = false;
    private JCheckBox in_consegna;
    private boolean ic = false;
    ModificaPratica(String pratica)
    {
        Dimension desktop_screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(new Point((desktop_screen.width-this.getWidth())/2,(desktop_screen.height-this.getHeight())/2));
        this.setSize(desktop_screen);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("Pratica : "+ pratica);
        this.setResizable(true);
        JPanel panel = new JPanel();
        //elementi del pannello
        JLabel numpr = new JLabel("Numero Pratica : " + pratica);
        JLabel client = new JLabel("Cliente : "+ cliente);
        JLabel phone = new JLabel("Telefono: "+ telefono);
        JLabel data_i = new JLabel("Data inizio : "+ data_inizio);
        JLabel ulti_ag = new JLabel("Ultimo aggiornamento : "+ ultimo_agg);
        JLabel desc = new JLabel("Descrizione problema : "+ desc_problema);
        JLabel maker = new JLabel("Produttore : "+ marca);
        JLabel model = new JLabel("Modello : "+ modello);
        JLabel type = new JLabel("Tipologia : "+ tipologia);
        JLabel l = new JLabel("Lavoro eseguito : ");
        chiusura_pratica = new JCheckBox("la pratica e conclusa ?");
        in_consegna = new JCheckBox("In consegna ?");
        lavoro_prec_eseguito= "dfghdfghhfxgh";
        descrizione_lavoro = new JTextArea(lavoro_prec_eseguito);
        descrizione_lavoro.setColumns(100);
        descrizione_lavoro.setRows(30);
        confirm = new JButton("Salva ed esci");
        indietro = new JButton("Indietro");
        elimina =  new JButton("Elimina la pratica");
        panel.add(numpr);
        panel.add(client);
        panel.add(phone);
        panel.add(data_i);
        panel.add(ulti_ag);
        panel.add(desc);
        panel.add(maker);
        panel.add(model);
        panel.add(type);
        panel.add(l);
        panel.add(descrizione_lavoro);
        panel.add(chiusura_pratica);
        panel.add(in_consegna);
        panel.add(confirm);
        panel.add(indietro);
        panel.add(elimina);
        this.add(panel);
        this.setVisible(true);
        confirm.addActionListener(this);
        indietro.addActionListener(this);
        chiusura_pratica.addActionListener(this);
        in_consegna.addActionListener(this);
        this.addWindowListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
       Object element = actionEvent.getSource();
       if(element == confirm){AggiornaPratica.istance_counter=AggiornaPratica.istance_counter-1;this.dispose();}
       if(element == indietro){AggiornaPratica.istance_counter=AggiornaPratica.istance_counter-1;this.dispose();}
       if(element == chiusura_pratica){
           if(cp)
               cp=false;
           else
              cp = true;
           System.out.println("pr " + cp);}
       if(element == in_consegna){
           if(ic)
               ic=false;
           else
               ic = true;
           System.out.println("pr in consegna " + ic);}




    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        AggiornaPratica.istance_counter=AggiornaPratica.istance_counter-1;this.dispose();



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
