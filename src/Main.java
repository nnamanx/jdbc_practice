import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //    Connection to Student database
    public static Connection connect() throws Exception {

        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/task2";
        String userName = "postgres";
        String password = "12131";

        Connection con = DriverManager.getConnection(url, userName, password);

        if (con != null) {
            System.out.println("Connected to Database!");
        }

        return con;
    }

//Getting Student info from database

    public static List<Student> getAllStudents() throws Exception {

        List<Student> res = new ArrayList<>();

        try (Connection con = connect();) {
            Statement st = con.createStatement();
            st.execute("SELECT * FROM student");
            ResultSet rs = st.getResultSet();

            while (rs.next()) {

                long id = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String major = rs.getString("major");
                double fee = rs.getDouble("fee");

                res.add(new Student(id, name, surname, major, fee));
            }


        } catch (SQLException e) {
            e.printStackTrace();

        }
        return res;
    }


    //    Main Method
    public static void main(String[] args) throws Exception {

        System.out.println(getAllStudents());

    }
}