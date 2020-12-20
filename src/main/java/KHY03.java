import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class KHY03 extends JFrame {
    public KHY03() {
        setTitle("KHY BRIDAL");
        setSize(370, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new pakett3());
        add(new back3());
        setVisible(true);
    }

    static class pakett3 extends JPanel {
        JLabel paket3 = new JLabel();

        public pakett3() {
            setBackground(Color.white);
            add(paket3);
            ImageIcon khy3 = new ImageIcon(new ImageIcon("images/paket3.jpeg").getImage().getScaledInstance(370, 460, Image.SCALE_SMOOTH));
            paket3.setIcon(khy3);
        }
    }
    class back3 extends JPanel {
        JButton Back3 = new JButton("BACK");

        public back3() {
            setBackground(Color.white);
            add(Back3);

            Back3.addActionListener(new Back3Listener());
        }

        class Back3Listener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new paket();
                dispose();
            }
        }
    }
}
