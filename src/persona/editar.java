package persona;
import conexion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milto
 */
public class editar {
    
     public static void main(String[] args) {

    conexion con = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    int id_editar = 1;
    String new_nombre = "Esteban";
    String new_apellido = "Posada";
    int new_edad = 26;

    String sql = "UPDATE persona SET "
            + "nombre='" + new_nombre + "', "
            + "apellido='" + new_apellido + "', "
            + "edad=" + new_edad + " "
            + "WHERE id=" + id_editar;

    try {
        cn = con.getConection();
        st = cn.createStatement();

        st.executeUpdate(sql);

        rs = st.executeQuery("SELECT * FROM persona");

        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " 2 " +
                rs.getString("nombre") + " - " +
                rs.getString("apellido") + " - " +
                rs.getInt("edad")
            );
        }

    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
  }   
