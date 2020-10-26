package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



// класс записывает и выводит данные из базы данных
public class DatabaseHandler extends Configs {
    Connection dbConnection;



    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver"); // драйвер для работы

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    // записывает нового пользователя в базу данных при регистрации
    public void signUpUser(String name, String lastName,
                           String login, String password, String location, String gender) {
        // SQL запрос в базу данныъ при помощи которого мы будем помещать данные в базу данных
        String insert = "INSERT INTO " + Const.USER_TABLE
                + "("
                + Const.USERS_NAME + ","
                + Const.USERS_LAST_NAME + ","
                + Const.USERS_LOGIN + ","
                + Const.USERS_PASSWORD + ","
                + Const.USERS_LOCATION + ","
                + Const.USERS_GENDER
                + ")"
                + "VALUES(?,?,?,?,?,?)";

        try {
            // класс который и будет работать с запросом и вставлять данные в быазу
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, login);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, location);
            preparedStatement.setString(6, gender);

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
