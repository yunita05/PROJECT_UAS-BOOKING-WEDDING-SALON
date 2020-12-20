import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class regis extends JFrame {

    public regis(){
        setTitle("KHY BRIDAL");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new Dmember());
        add(new buttonD());

        final Database db = new Database();
        buttonD.btnRegistration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                db.Insert();
                new login();
                dispose();
            }
        });

        setVisible(true);
    }
}
class Dmember extends JPanel {
    static JTextField txtid = new JTextField();
    static JTextField txtnama = new JTextField();
    static JTextField txtusername = new JTextField();
    static JTextField txtpassword = new JTextField();
    static JTextField txtCpassword = new JTextField();

    public Dmember(){
        setBackground(Color.pink);
        setLayout(new GridLayout(5,1));

        add(new JLabel("ID"));
        add(txtid);

        add(new JLabel("Nama"));
        add(txtnama);

        add(new JLabel("Username"));
        add(txtusername);

        add(new JLabel("Password"));
        add(txtpassword);

        add(new JLabel("Confirm Password"));
        add(txtCpassword);

        Border etchedBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        TitledBorder titledBorder = BorderFactory.createTitledBorder(etchedBorder, "REGISTER");
        titledBorder.setTitleFont(titledBorder.getTitleFont().deriveFont(Font.BOLD));

        setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10,10), titledBorder));
    }
}

class buttonD extends JPanel {
    static JButton btnRegistration = new JButton("Create Member");

    public buttonD() {
        setBackground(Color.pink);

        add(btnRegistration);

    }

}


