import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add implements ActionListener {
private MyFrame frame;

   public void something(MyFrame frame){
       this.frame = frame;
   }


    @Override
    public void actionPerformed(ActionEvent e) {
    JButton button = new JButton("J1");
    frame.add(new JButton("J1"), FlowLayout.CENTER);
    frame.revalidate();
    }

}
