/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_6_bse203165_bse183145_a3;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;

/**
 *
 * @author Muhammad Abdullah
 */
public class DaoLogIn {
    public boolean LoginAccess(String username,String password)
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement st= con.createStatement();
             String sql = "Select * from signup where username='"+username+"' AND password='"+password+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                 JOptionPane.showMessageDialog(null, "Login Sucessfully");
                 return true;
            }
        }catch(Exception e)
        {
           throw new RuntimeException(e);
        }
         return false;
    }
    
}


