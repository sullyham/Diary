import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action implements ListSelectionListener {
    JPanel panel;
    public void pass(JPanel panel){
        this.panel = panel;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(e.getValueIsAdjusting()){
            System.out.println("SWITCHED!");
            panel.
        }
    }
}
