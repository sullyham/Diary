import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    public MyFrame(){
        //Frame settings
        setVisible(true);
        setSize(600,400);
        setTitle("Diary App");



        //Components
        JButton add = new JButton("+");
        JButton delete = new JButton("-");
        JPanel adder = new JPanel();


        //Add/remove settings
        add.addActionListener(new Add());
        delete.addActionListener(new Remove());
        adder.add(add);
        adder.add(delete);
        adder.add(new JLabel("                           J1"));





        //Adding components to frame
        this.add(adder);
    }
}
