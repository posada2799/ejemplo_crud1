
package persona;
import conexion.conexion;// Traigo la clase que me permite conectarme a la base de datos
import java.sql.Connection;// Para manejar la conexión a MySQL
import java.sql.SQLException;// Para manejar errores de SQL
import java.sql.Statement;//Statement: permite ejecutar sentencias SQL simples (como INSERT, UPDATE, DELETE, SELECT).

public class agregar {

    public static void main(String[] args)  {
        conexion cn = new conexion(); // Creo un objeto conexion, esto abre la conexión a MySQL
        Connection con = cn.getConection();// Pido la conexión que creó el objeto anterior

        try {
            Statement st = con.createStatement();// Creo un mensajero para enviar comandos SQL
            // Datos que quiero insertar
            String apellido = "Martinez";
            String edad = "23";
            String nombre = "Yuli";

            String sql = "INSERT INTO persona (nombre, apellido, edad) VALUES ('"
                    + nombre + "', '" + apellido + "', " + edad + ")";// Creo el texto del comando SQL que va a insertar la persona

            st.executeUpdate(sql);// Envío el comando SQL a la base de datos

            System.out.println("Persona insertada correctamente");// Si todo sale bien, muestro un mensaje

        } catch (SQLException ex) {
            System.out.println("Error al insertar: " + ex.getMessage());  // Si algo sale mal, muestro el error
        }
    }
}

    
          

