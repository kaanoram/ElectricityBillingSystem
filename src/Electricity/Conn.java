package Electricity;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    
    public Conn() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "Ko!2192050");
            s = c.createStatement();
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}
