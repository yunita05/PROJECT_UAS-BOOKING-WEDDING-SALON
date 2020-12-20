import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class KHY04 extends JFrame {
    public KHY04() {
        setTitle("KHY BRIDAL");
        setSize(370, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new pakett4());
        add(new back4());
        setVisible(true);
    }

    static class pakett4 extends JPanel {
        JLabel paket4 = new JLabel();

        public pakett4() {
            setBackground(Color.white);
            add(paket4);
            ImageIcon khy4 = new ImageIcon(new ImageIcon("images/paket4.jpeg").getImage().getScaledInstance(370, 460, Image.SCALE_SMOOTH));
            paket4.setIcon(khy4);
        }
    }
    class back4 extends JPanel {
        JButton Back4 = new JButton("BACK");

        public back4() {
            setBackground(Color.white);
            add(Back4);

            Back4.addActionListener(new KHY04.back4.Back4Listener());
        }

        class Back4Listener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new paket();
                dispose();
            }
        }
    }
}
