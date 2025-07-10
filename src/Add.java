import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Add implements ActionListener {
private DefaultListModel<String> list;

   public void pass(DefaultListModel<String> list){
       this.list = list;
   }



    @Override
    public void actionPerformed(ActionEvent e) {
        String path = JOptionPane.showInputDialog(null,"Select a name for your entry","New entry", JOptionPane.INFORMATION_MESSAGE);
        list.addElement(path);
    }

}
