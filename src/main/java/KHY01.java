import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class KHY01 extends JFrame {
    public KHY01() {
        setTitle("KHY BRIDAL");
        setSize(370, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new pakett());
        add(new back());
        setVisible(true);
    }

    static class pakett extends JPanel {
        JLabel paket1 = new JLabel();

        public pakett() {
            setBackground(Color.white);

            add(paket1);
            ImageIcon khy1 = new ImageIcon(new ImageIcon("images/paket1.jpeg").getImage().getScaledInstance(370, 460, Image.SCALE_SMOOTH));
            paket1.setIcon(khy1);
        }
    }

    class back extends JPanel {
        JButton Back = new JButton("BACK");

        public back() {
            setBackground(Color.white);

            add(Back);

            Back.addActionListener(new BackListener());
        }

        class BackListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new paket();
                dispose();
            }
        }
    }
}
