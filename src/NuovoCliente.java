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
        incorrect_value = new JLabel();
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
        salva.addActionListener(this);
        esci.addActionListener(this);
        this.addWindowListener(this);
        this.add(panel);
        this.setVisible(true);






    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Object element = actionEvent.getSource();
        if(element== salva){
            if (checkData()) {NuovaPratica.nc=false; this.dispose();}
        }
        if(element== esci){NuovaPratica.nc=false;this.dispose();}



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
    public boolean checkData()
    {
        piva_cf= piva_cf_t.getText();
        indirizzo=indirizzo_t.getText();
        ragsociale_nominativo=ragsociale_nominativo_t.getText();
        cellphone=cellphone_t.getText();
        incorrect_value.setText("");
        String errors ="";
        boolean inc_val=false;
        // controllo piva o cf
        if(piva_cf.length()!= 11 && piva_cf.length() != 16)
            errors= "P. IVA o CF non valido : ";
        if(piva_cf.length()==11)
        {
            for (int i=0 ; i<piva_cf.length(); i++)
            {
                if(piva_cf.charAt(i)>('0'-1)&&piva_cf.charAt(i)<('9'+1))continue;
                else
                    {
                    errors=errors+"P. IVA non valida ";
                    break;
                    }

            }

        }
        if(piva_cf.length()==16)
        {
            for (int i=0 ; i<piva_cf.length(); i++)
            {
                if(piva_cf.charAt(i)>('0'-1)&&piva_cf.charAt(i)<('9'+1)
                 && piva_cf.charAt(i)>('A'-1)&&piva_cf.charAt(i)<('Z'+1)
                       && piva_cf.charAt(i)>('a'-1)&&piva_cf.charAt(i)<('z'+1)
                )continue;
                else {
                    errors = errors + " CF non valido ";
                    break;
                }
            }
        }
        //controllo indirizzo (sql injection)
        inc_val = false;
        if(indirizzo.length()==0)errors = errors + "indirizzo non valido ";
        for (int i=0 ; i<indirizzo.length(); i++)
        {
            switch (indirizzo.charAt(i))
            {
                case ';':

                case '=':

                case '(':

                case ')':
                    inc_val =true;
            }
            if(inc_val)
            {
                errors = errors + "indirizzo non valido";
                break;
            }
        }
        inc_val=false;
        //controllo rag sociale (sql injection)
        if(ragsociale_nominativo.length()==0)errors = errors + "ragione soc./ nominativo non valido ";
        for (int i=0 ; i<ragsociale_nominativo.length(); i++)
        {
            switch (ragsociale_nominativo.charAt(i))
            {
                case ';':

                case '=':

                case '(':

                case ')':
                    inc_val=true;

            }
            if(inc_val)
            {
                errors=errors+" ragione soc./ nominativo non valido";
                break;
            }
        }
        //controllo telefon
        if(cellphone.length()==0)errors = errors + "telefono non valido ";
        for (int i=0 ; i<cellphone.length(); i++)
        {
            if(cellphone.charAt(i)>('0'-1)&&cellphone.charAt(i)<('9'+1))continue;
            else
            {   errors=errors+" telefono non valido "; break;}

        }
        incorrect_value.setText(errors);
        if(incorrect_value.getText().length()==0)return true;
        else return false;
    }
}
