
package student_registration_mgt;

import java.sql.*;

import javax.swing.JOptionPane;
public class javaconnect {
    
    Connection con= null;
    ResultSet set = null;
    PreparedStatement pst= null;
    
    public static Connection ConnectDB() {
        try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sims","root","");
                 return con;
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
