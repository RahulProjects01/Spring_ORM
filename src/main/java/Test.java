import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rahul?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
