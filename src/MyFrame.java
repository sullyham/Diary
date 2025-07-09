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
        setSize(800,600);
        setTitle("Diary App");
        setResizable(true);
        JPanel title = new JPanel();
        title.setLayout(new BorderLayout());
        JLabel top = new JLabel("My Diary");
        top.setFont(new Font("Serif", Font.PLAIN, 30));
        top.setHorizontalAlignment(SwingConstants.CENTER);
        title.add(top, BorderLayout.CENTER);
        title.setBackground(Color.PINK);
        title.setPreferredSize(new Dimension(100,100));
        JPanel sidemenu = new JPanel();
        sidemenu.setPreferredSize(new Dimension(200,100));
        sidemenu.setBackground(new Color(217, 179, 255));
        add(title, BorderLayout.NORTH);
        add(sidemenu, BorderLayout.WEST);


    }
}
