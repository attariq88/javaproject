package sequel;

import com.mysql.cj.exceptions.ClosedOnExpiredPasswordException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSqlClass {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = ConnectionForSql2.connectionToMySqlDb();
        Statement statement = connection.createStatement();
        ResultSet table = statement.executeQuery("Select * From students");

        while (table.next()) {
            int idFromDB = table.getInt("id");
            String nameFromDb = table.getString("name");
            String stateFromDB = table.getString("state");
            String zipFromDB = table.getString("zipcode");
            //names.add(nameFromDb);
            System.out.println(idFromDB + " " + nameFromDb + " " + stateFromDB + " " + zipFromDB);
        }
        //System.out.println(names);
        ConnectionForSql2.clearDatabase(statement,connection);

    }
}
