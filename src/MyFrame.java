import javax.smartcardio.Card;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class MyFrame extends JFrame {

    public MyFrame(){
        //Frame settings
        setVisible(true);
        setSize(600,400);
        setTitle("Diary App");
        setLayout(new FlowLayout());


        //Components
        JButton add = new JButton("+");
        JButton delete = new JButton("-");
        JPanel adder = new JPanel();



        //Add/remove settings
        Add instant = new Add();
        add.addActionListener(instant);

        instant.something(this);
        delete.addActionListener(new Remove());
        adder.add(add);
        adder.add(delete);





        //Adding components to frame
        this.add(adder,BorderLayout.WEST);
    }
}
