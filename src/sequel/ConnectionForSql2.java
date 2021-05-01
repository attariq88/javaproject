package sequel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class ConnectionForSql2 {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {


        String query = "Select * From students;";
        Connection connection = connectionToMySqlDb();
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
        clearDatabase(statement,connection);

    }

    public static String getDataFromProperties(String location, String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(location);
        properties.load(inputStream);

        String info = properties.getProperty(key);
        return info;
    }

    public static Connection connectionToMySqlDb() throws IOException, ClassNotFoundException, SQLException {
        String username = getDataFromProperties("src/sequel/config.properties", "username");
        String password = getDataFromProperties("src/sequel/config.properties", "password");
        String dbname = getDataFromProperties("src/sequel/config.properties", "dbname");

        String url = "jdbc:mysql://localhost:3306/" + dbname;

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);

        return connection;
    }

    public static void clearDatabase(Statement statement,Connection connection) throws SQLException {
        if (statement != null){
            statement.close();
        }

        if (connection != null){
            connection.close();
        }

    }

//    public static ResultSet getTableFrtomDB(String query) throws SQLException, IOException, ClassNotFoundException {
//        Connection connection = connectionToMySqlDb();
//        Statement statement = connection.createStatement();
//        ResultSet table = statement.executeQuery(query);
//        return table;
//    }
}
