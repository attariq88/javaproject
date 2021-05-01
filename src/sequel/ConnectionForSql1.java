package sequel;

import java.sql.*;
import java.util.ArrayList;

public class ConnectionForSql1 {
    public static void main(String[] args) throws SQLException {

        String username = "root";
        String password = "020619";
        String dbname = "peopleNtech";

        //jdbc:mysql --> driver name
        //localhost --> host name
        //3306 --> port number

        //SSL error --> "?useSSl=false"
        // server timezone --> "?serverTimezone=UTC"
        //both --> "?serverTimezone=UTC&useSSl=false"

        String url = "jdbc:mysql://localhost:3306/" + dbname;
        String query = "Select * From students;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred in driver");
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet table = statement.executeQuery(query);

        ArrayList<String> names = new ArrayList<>();

        while (table.next()) {
            int idFromDB = table.getInt("id");
            String nameFromDb = table.getString("name");
            String stateFromDB = table.getString("state");
            String zipFromDB = table.getString("zipcode");
            names.add(nameFromDb);
            System.out.println(idFromDB + " " + nameFromDb + " " + stateFromDB + " " + zipFromDB);
        }
        System.out.println(names);
        statement.close();
        connection.close();

    }
}
