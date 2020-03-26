import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainWindow extends JFrame implements ActionListener, WindowListener
{
    private JButton nuova_pratica;
    private JButton aggiorna_pratica;
    private JButton esci;
    protected static boolean is_win_opened = false;
    public static void main(String[] args)
    {
       try{ UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");}
       catch (ClassNotFoundException e){System.out.println("cant found gtk");} catch (IllegalAccessException e) {
           e.printStackTrace();
       } catch (InstantiationException e) {
           e.printStackTrace();
       } catch (UnsupportedLookAndFeelException e) {
           e.printStackTrace();
       }


        new MainWindow();

    }
    MainWindow()
    {
        this.setSize(700,500);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("Repair Genie");
        Dimension desktop_screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(new Point((desktop_screen.width-this.getWidth())/2,(desktop_screen.height-this.getHeight())/2));
        JPanel panel = new JPanel();
        JLabel titolo = new JLabel("Quale operazione vuoi eseguire ?");
        nuova_pratica = new JButton("Nuova Pratica");
        aggiorna_pratica = new JButton("Aggiorna Pratica");
        esci = new JButton("Esci");
        panel.add(titolo);
        panel.add(nuova_pratica);
        panel.add(aggiorna_pratica);
        panel.add(esci);
        this.add(panel);
        this.setVisible(true);
        this.addWindowListener(this);
        nuova_pratica.addActionListener(this);
        aggiorna_pratica.addActionListener(this);
        esci.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Object p;

        if(actionEvent.getSource() == aggiorna_pratica && !is_win_opened)
        {is_win_opened=true; p = new AggiornaPratica(); }

        if (actionEvent.getSource() == esci && !is_win_opened)
            System.exit(0);

        if (actionEvent.getSource() == esci && is_win_opened)
            JOptionPane.showMessageDialog(this, "Prima fanno chiuse tutte le finestre del programma.","Errore",JOptionPane.ERROR_MESSAGE);

        if(actionEvent.getSource() == nuova_pratica && !is_win_opened)
        {is_win_opened=true; p = new NuovaPratica(); }


    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {

        if(is_win_opened)
        {
            JOptionPane.showMessageDialog(this, "Prima fanno chiuse tutte le finestre del programma.","Errore",JOptionPane.ERROR_MESSAGE);

        }
        else
            this.dispose();

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
