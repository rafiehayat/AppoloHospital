/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author hayat
 */
public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/hospitalDemo";
            String user ="root";
            String pwd ="Hayat@2580";
            Connection con =DriverManager.getConnection(url,user,pwd);
            return con;
        }catch(Exception e){
            return null;
        }
    }
    
}
