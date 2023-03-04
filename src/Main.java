import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

//        connect();

        System.out.println(getAllTeacher());

    }

    public static Connection connect() throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/task2";
        String userName = "postgres";
        String password = "12131";
        Connection connection = DriverManager.getConnection(url, userName, password);

        if (connection != null) {
            System.out.println("Connected to DB");
        }

        return connection;
    }

    public static List<Teacher> getAllTeacher() throws Exception {
        List<Teacher> res = new ArrayList<>();
        try (Connection con = connect();) {
            Statement st = con.createStatement();
            st.execute("SELECT * FROM teacher");
            ResultSet rs = st.getResultSet();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                res.add(new Teacher(id, name, surname));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;

    }
}