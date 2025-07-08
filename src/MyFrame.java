import javax.smartcardio.Card;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class MyFrame extends JFrame {

    public MyFrame(){
        //Frame settings
        setVisible(true);
        setResizable(false);
        setSize(1000,600);
        setTitle("Diary App");

        //Components
        JButton add = new JButton("+");
        JButton delete = new JButton("-");
        JPanel adder = new JPanel();
        adder.setLayout(new GridLayout(0,2));

        //Add/remove settings
        Add instant = new Add();
        add.addActionListener(instant);
        instant.pass(adder);


        delete.addActionListener(new Remove());
        adder.add(add);
        adder.add(delete);





        //Adding components to frame
        this.add(adder);
       // this.add(new JEditorPane(), BorderLayout.CENTER);
    }
}
