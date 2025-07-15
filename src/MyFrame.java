import javax.smartcardio.Card;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class MyFrame extends JFrame{
List data = new List();
    public MyFrame() throws InterruptedException {
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

        JPanel center = new JPanel();
        center.setLayout(new CardLayout());
        JPanel tv = new JPanel();
        tv.add(new JLabel("HEHEH"));
        JPanel tvv = new JPanel();
        tvv.add(new JLabel("ERWERWE"));
        center.add(tv);
        center.add(tvv);

        JPanel sidemenu = new JPanel();
        sidemenu.setLayout(new BoxLayout(sidemenu, BoxLayout.Y_AXIS));
        sidemenu.setPreferredSize(new Dimension(200,100));
        sidemenu.setBackground(new Color(217, 179, 255));
        DefaultListModel<String> list = new DefaultListModel<>(); //ACtual list
        JList<String> list1 = new JList<>(list); //List for GUI
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.setLayoutOrientation(JList.VERTICAL);
        list1.setVisibleRowCount(-1);
        JScrollPane listscroll = new JScrollPane(list1);
        listscroll.setPreferredSize(new Dimension(100,200));
        sidemenu.add(listscroll);

        JButton add = new JButton("+");
        Add adder = new Add();
        add.addActionListener(adder);
        adder.pass(list);
        sidemenu.add(add);
        add(title, BorderLayout.NORTH);
        add(sidemenu, BorderLayout.WEST);
        add(center);

        int selected;
        Action action = new Action();
        action.pass(center);
        list1.addListSelectionListener(action);


    }
}
