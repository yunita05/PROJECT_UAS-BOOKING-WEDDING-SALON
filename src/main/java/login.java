import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {

    public login() {
        setTitle("KHY BRIDAL");
        setSize(400, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);

        add(new masuk());
        add(new signin());

        final Database db = new Database();
        signin.btnsignin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                db.Masuk();
                dispose();
            }
        });
    }
}

class masuk extends JPanel {
    static JTextField txtusername = new JTextField();
    static JTextField txtpassword = new JPasswordField();

    public masuk(){
        setBackground(Color.pink);
        setLayout(new GridLayout(2,1));

        add(new JLabel("Username"));
        add(txtusername);

        add(new JLabel("Password"));
        add(txtpassword);

        Border etchedBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        TitledBorder titledBorder = BorderFactory.createTitledBorder(etchedBorder, "LOGIN");
        titledBorder.setTitleFont(titledBorder.getTitleFont().deriveFont(Font.BOLD));

        setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10,10),
                titledBorder));
    }
}

class signin extends JPanel {
    static JButton btnsignin = new JButton("Sign In");
    public signin() {
        setBackground(Color.pink);

        add(btnsignin);

    }

}


