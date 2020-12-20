import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class logout extends JFrame {

    public logout(){
        setTitle("KHY BRIDAL");
        setSize(350,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new logokhy());
        add(new btn());

        setVisible(true);
    }

    static class logokhy extends JPanel {
        JLabel gambar1 = new JLabel();

        public logokhy(){
            setBackground(Color.pink);
            add(gambar1);
            ImageIcon gambarr = new ImageIcon(new ImageIcon("images/logo.png").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
            gambar1.setIcon(gambarr);
            gambar1.setBounds(5,15,5,5);
        }
    }

    static class btn extends  JPanel {
        JButton btnlogout = new JButton("LOG OUT");

        public btn() {
            setBackground(Color.pink);
            add(btnlogout);

            btnlogout.addActionListener(new ButtonLogoutListener());
        }

        static class ButtonLogoutListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuUtama();
            }
        }

    }

}