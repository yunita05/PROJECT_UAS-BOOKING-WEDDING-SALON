import java.sql.*;
import javax.swing.JOptionPane;


public class Database {
    private Connection db;

    public Database() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/project_java";
            String user = "root";
            String password = "";

            Class.forName(driver);
            db = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Insert() {
        String id = Dmember.txtid.getText();
        String nama = Dmember.txtnama.getText();
        String username = Dmember.txtusername.getText();
        String password = Dmember.txtpassword.getText();
        try {
            String sql = "INSERT INTO member VALUES (?, ?, ?, ?)";
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, nama);
            ps.setString(3, username);
            ps.setString(4, password);

            ps.execute();

            JOptionPane.showMessageDialog(null, "Data berhasil Dimasukkan");
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Masuk() {

        try {
            String sql = "SELECT * FROM member WHERE memberUsername='"+masuk.txtusername.getText()+"' AND memberPassword='"+masuk.txtpassword.getText()+"'";
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                if(masuk.txtusername.getText().equals(rs.getString("memberUsername")) && masuk.txtpassword.getText().equals(rs.getString("memberPassword"))){
                    JOptionPane.showMessageDialog(null, "Berhasil Login");
                    new paket();

                }
            }else{
                JOptionPane.showMessageDialog(null, "Username atau Password Salah");
                new login();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void Booking() {
        String id = data.txtkode_booking.getText();
        String nama = data.txtnama.getText();
        String waktu = data.waktu.getText();
        String tanggal = data.tanggal.getText();

        try {
            String sql = "INSERT INTO booking VALUES (?, ?, ?, ?)";
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, nama);
            ps.setString(3, waktu);
            ps.setString(4, tanggal);

            ps.execute();

            JOptionPane.showMessageDialog(null, "Data berhasil Dimasukkan");

        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Pembayaran(){
        String kodeb = bayar.txtkode.getText();
        String nama = bayar.txtnama.getText();
        String paket = bayar.cmbpaket.getSelectedItem().toString();
        String total = bayar.txtpembayaran.getText();
        String metode = bayar.cmbmetode.getSelectedItem().toString();

        try {
            String sql = "INSERT INTO pembayaran VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1, kodeb);
            ps.setString(2, nama);
            ps.setString(3, paket);
            ps.setString(4, total);
            ps.setString(5, metode);

            ps.execute();

            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");

        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}