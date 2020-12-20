import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Booking extends JFrame {
    public Booking(){
        setTitle("KHY BRIDAL");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new data());
        add(new data.btnnext());
        final Database db = new Database();

        data.btnnext.btnnext1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                db.Booking();
                new pembayaran();
                dispose();
            }
        });


        setVisible(true);
    }

}

class data extends JPanel {
    static JTextField txtnama = new JTextField();
    static JTextField txtkode_booking = new JTextField();
    static JTextField waktu = new JTextField();
    static JTextField tanggal = new JTextField();

    public data() {
        setBackground(Color.pink);
        setLayout(new GridLayout(4, 1));


        add(new JLabel("Nama"));
        add(txtnama);

        add(new JLabel("Kode Booking"));
        add(txtkode_booking);

        add(new JLabel("Waktu (HH:MM)"));
        add(waktu);

        add(new JLabel("Tanggal (YYYY-MM-DD)"));
        add(tanggal);

        Border etchedBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        TitledBorder titledBorder = BorderFactory.createTitledBorder(etchedBorder, "BOOKING");
        titledBorder.setTitleFont(titledBorder.getTitleFont().deriveFont(Font.BOLD));

        setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 40,10), titledBorder));

    }
    static class btnnext extends  JPanel {
        static JButton btnnext1 = new JButton("NEXT");

        public btnnext () {
            setBackground(Color.pink);

            add(btnnext1);


        }

    }

}



