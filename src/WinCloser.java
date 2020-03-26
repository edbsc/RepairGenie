import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinCloser implements ActionListener
{
    private JButton exit;
    private JFrame target_frame;
    private boolean is_last_win = false;
    WinCloser(JFrame target)
    {
        target_frame = target;
        exit= new JButton("Chiudi");
        exit.addActionListener(this);

    }

    public Component getButton()
    {
        return exit;
    }
    public void enableProgramClose(boolean b){is_last_win=b;}


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()== exit)
        {
            if(is_last_win)
                System.exit(0);
            else
                target_frame.setVisible(false);

        }



    }
}
