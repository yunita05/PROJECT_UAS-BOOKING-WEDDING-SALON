import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pembayaran extends JFrame {
    public pembayaran (){
        setTitle("KHY BRIDAL");
        setSize(500,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new bayar());
        add(new btnnext1());
        setVisible(true);

    }

    private class btnnext1 extends JPanel {
        JButton btnnext1 = new JButton("NEXT");

        public btnnext1() {
            setBackground(Color.pink);
            final Database db = new Database();

            add(btnnext1);
            btnnext1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    db.Pembayaran();
                    new logout();
                    dispose();
                }
            });

        }

    }
}
class bayar extends JPanel {
    static JTextField txtkode = new JTextField();
    static JTextField txtnama = new JTextField();
    static JTextField txtpembayaran = new JTextField();


    static JComboBox<String> cmbpaket = new JComboBox(new String[]{"KHY01", "KHY02", "KHY03", "KHY04"});
    static JComboBox<String> cmbmetode = new JComboBox(new String[]{"Cash", "Debit", "Kredit"});

    public bayar() {
        setBackground(Color.pink);
        setLayout(new GridLayout(9,1));

        add(new JLabel("Kode pembayaran"));
        add(txtkode);

        add(new JLabel("Nama"));
        add(txtnama);

        add(new JLabel("Paket Wedding"));
        add(cmbpaket);

        add(new JLabel("Total Pembayaran (Rp xx.xxx.xxx)"));
        add(txtpembayaran);

        add(new JLabel(("Metode Pembayaran")));
        add(cmbmetode);

        add(new JLabel("Price : "));
        add(new JLabel(""));
        add(new JLabel("KHYO1 : Rp 35.199.000"));
        add(new JLabel("KHY02 : Rp 31.999.000"));
        add(new JLabel("KHYO3 : Rp 29.789.000"));
        add(new JLabel("KHY04 : Rp 27.899.000"));

        Border etchedBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

        TitledBorder titledBorder = BorderFactory.createTitledBorder(etchedBorder, "CASIER");
        titledBorder.setTitleFont(titledBorder.getTitleFont().deriveFont(Font.BOLD));

        setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 40,10), titledBorder));

    }

}
