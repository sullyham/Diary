import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Add implements ActionListener {
private JPanel panel;

   public void pass(JPanel panel){
       this.panel = panel;
   }



    @Override
    public void actionPerformed(ActionEvent e) {
        String path = JOptionPane.showInputDialog(null,"Select a name for your entry","New entry", JOptionPane.INFORMATION_MESSAGE);
        JButton button = new JButton(path);
    panel.add(button);
    panel.revalidate();
    }

}
