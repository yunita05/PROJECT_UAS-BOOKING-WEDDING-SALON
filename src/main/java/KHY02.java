import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class KHY02 extends JFrame {
    public KHY02() {
        setTitle("KHY BRIDAL");
        setSize(370, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new pakett2());
        add(new back2());
        setVisible(true);
    }

    static class pakett2 extends JPanel {
        JLabel paket2 = new JLabel();

        public pakett2() {
            setBackground(Color.white);
            add(paket2);
            ImageIcon khy2 = new ImageIcon(new ImageIcon("images/paket2.jpeg").getImage().getScaledInstance(370, 460, Image.SCALE_SMOOTH));
            paket2.setIcon(khy2);
        }
    }
    class back2 extends JPanel {
        JButton Back2 = new JButton("BACK");

        public back2() {
            setBackground(Color.white);
            add(Back2);

            Back2.addActionListener(new KHY02.back2.Back2Listener());
        }

        class Back2Listener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new paket();
                dispose();
            }
        }
    }
}
