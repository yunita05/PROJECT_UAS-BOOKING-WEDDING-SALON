import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class paket extends JFrame {
    public paket(){
        setTitle("KHY BRIDAL");
        setSize(500, 110);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new button());

        setVisible(true);
    }

    class button extends  JPanel {
        JButton khy1 = new JButton("KHY01");
        JButton khy2= new JButton("KHY02");
        JButton khy3 = new JButton("KHY03");
        JButton khy4 = new JButton("KHY04");
        JButton button1 = new JButton("NEXT");

        public button() {
            setBackground(Color.pink);

            add(khy1);
            add(khy2);
            add(khy3);
            add(khy4);
            add(button1);

            khy1.addActionListener(new button1Listener());
            khy2.addActionListener(new button2Listener());
            khy3.addActionListener(new button3Listener());
            khy4.addActionListener(new button4Listener());
            button1.addActionListener(new buttonnextListener());

            Border etchedBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

            TitledBorder titledBorder = BorderFactory.createTitledBorder(etchedBorder, "KHY PACKAGE");
            titledBorder.setTitleFont(titledBorder.getTitleFont().deriveFont(Font.BOLD));

            setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(5, 5, 5,5),
                    titledBorder));
        }

        class buttonnextListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Booking();
                dispose();
            }
        }
        class button1Listener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new KHY01();
                dispose();
            }
        }
        class button2Listener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new KHY02();
                dispose();
            }
        }
        class button3Listener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new KHY03();
                dispose();
            }
        }
        class button4Listener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new KHY04();
                dispose();
            }
        }
    }
}