/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;

import java.sql.DriverManager;

/**
 *
 * @author guan97005
 */
public class connectDB {
    public static java.sql.Connection getConnection(){
        java.sql.Connection con;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/filmregister", "root", "");
            return con;
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
        
    }
}
