import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AggiornaPratica extends JFrame implements ActionListener
{

    private JButton cerca ;
    private JButton menu_principale ;
    private JTextField entry_codice;
    private String codice_p ;
    protected static int istance_counter =0;

    AggiornaPratica( )
    {

        this.setSize(700,500);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("Aggiorna Pratica");
        Dimension desktop_screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(new Point((desktop_screen.width-this.getWidth())/2,(desktop_screen.height-this.getHeight())/2));
        JPanel panel = new JPanel();
        JLabel titolo = new JLabel("Inserisci il codice della pratica da aggiornare qui sotto");
        cerca = new JButton("Cerca");
        menu_principale = new JButton("Indietro");
        entry_codice = new JTextField(30);
        panel.add(titolo);
        panel.add(entry_codice);
        panel.add(cerca);
        panel.add(menu_principale);
        this.add(panel);
        this.setVisible(true);
        cerca.addActionListener(this);
        menu_principale.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Object p;
        if(actionEvent.getSource()==menu_principale)
        {
            if(istance_counter==0)
            {
                MainWindow.is_win_opened=false ;
                this.dispose();
            }
            else
                JOptionPane.showMessageDialog(this, "Prima devi chiudere tutte le pratiche.","Errore",JOptionPane.ERROR_MESSAGE);

        }
        if(actionEvent.getSource()==cerca)
        {
            codice_p= entry_codice.getText();
            if(checkcode(codice_p))
            {
                if(istance_counter< 5) {
                    System.out.println("OK : " + codice_p);
                    istance_counter++;
                    p = new ModificaPratica(codice_p);
                }
                else {
                    JOptionPane.showMessageDialog(this, "Non puoi modificare conteporanemante piu di 5 pratiche.","Errore",JOptionPane.ERROR_MESSAGE);
                    istance_counter=5;
                }

            }


        }

    }
    public boolean checkcode(String code)
    {
        String s = code ;
        if (s.length()>10) s = s.substring(0,9);


        System.out.println("sub :"+s);
        for (int i= 0 ; i<s.length() ; i++)
        {

            if(s.charAt(i)<'0'|| s.charAt(i)> '9' )
            {
                JOptionPane.showMessageDialog(this, "Codice non valido","Errore",JOptionPane.ERROR_MESSAGE);
                return false;
            }

        }
        return true;
    }

}
