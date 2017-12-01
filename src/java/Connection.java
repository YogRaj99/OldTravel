
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dnyaneshwar
 */
public class Connection {
    public static void main(String[] args) throws ClassNotFoundException
    {
         
Class.forName("com.mysql.jdbc.Driver");  
//Connection con=DriverManager.getConnection("jdbc:mysql/localhost:3306/mauli","root","");  

 
//Statement stmt=con.createStatement(); 
System.out.println("Connected...!!!!!!!!!!!!!!");
        

    }
    
}
 
