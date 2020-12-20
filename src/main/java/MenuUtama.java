import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUtama extends JFrame{

    public MenuUtama(){
        setTitle("KHY BRIDAL");
        setSize(350,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new logo());
        add(new btn());

        setVisible(true);
    }

    class logo extends JPanel {
        JLabel gambar = new JLabel();

        public logo(){
            setBackground(Color.pink);
            add(gambar);
            ImageIcon gambar1 = new ImageIcon(new ImageIcon("images/logo.png").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
            gambar.setIcon(gambar1);
            gambar.setBounds(5,15,5,5);
        }
    }


    class btn extends  JPanel {
        JButton masuk = new JButton("MASUK");
        JButton register = new JButton("REGISTER");

        public btn() {
            setBackground(Color.pink);

            add(masuk);
            add(register);

            masuk.addActionListener(new MasukListener());
            register.addActionListener(new RegisterListener());
        }

        class MasukListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new login();
                dispose();
            }
        }
        class RegisterListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new regis();
                dispose();
            }
        }

    }

}


