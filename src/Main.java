//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/clase";
        String user = "root";
        String password = "123456";
        String nombre = "Luis Diaz", cedula = "17523523";
        Double b1=5.4, b2=6.4;
        String sql = "insert into estudiantes(cedula, nombre, b1, b2) values(?,?,?,?)";
        try(Connection connection = DriverManager.getConnection(url, user, password)){
            PreparedStatement cadena = connection.prepareStatement(sql);
            cadena.setString(1, cedula);
            cadena.setString(2, nombre);
            cadena.setDouble(3, b1);
            cadena.setDouble(4, b2);
            System.out.println("Datos Insertados Correctamente");
            cadena.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}