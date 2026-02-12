/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

// Importar lo necesario
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    Connection con;

    public conexion() {
        try {
            // Cargar driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //esta linea es vital para la conexion 
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo_conexion1","root","1234");
            System.out.println("CONEXION EXITOSA");
        } catch(ClassNotFoundException| SQLException e){
        System.out.println("No Conectado");
        
        }
      }
    
    public  Connection getConection (){
        return con;
            }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    }

   
    


    

    


