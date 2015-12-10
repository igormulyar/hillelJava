package database;

import java.sql.*;

/**
 * Created by IMulyar on 10.12.2015.
 */
public class DatabaseMain {

    public static void main(String[] args) throws SQLException {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        String connectionString = "jdbc:postgresql://localhost:5432/postgres";

        Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres");

        //read(connection);

        notCorrectUpdate(connection);

        String sql = "UPDATE store SET name =  ? WHERE id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Keyboard'--");
        preparedStatement.setInt(2, 1);
        preparedStatement.executeUpdate();
        preparedStatement.close();

        read(connection);

        connection.close();
    }

    private static void notCorrectUpdate(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String newName = "Keyboard";
        // String newName = "Keyboard'--";                                                                                   -    ACHTUNG!!! SQL INJECTION! because "--" comments the next part of the query
        int id = 1;
        String sql = "UPDATE store SET name = '" + newName + "' WHERE id = " + id;

        int rowsUpdated = statement.executeUpdate(sql);
        System.out.println("rows updated: " + rowsUpdated);
    }

    private static void read(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "SELECT id as item_id, name, category, price FROM store";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt("item_id");
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");

            Product product = new Product(id, name, category, price);

            System.out.println(product);
        }

        resultSet.close();
    }
}

/*
* connectionString = jdbc: db_type : address : port/database_name
*
*
*
* */
