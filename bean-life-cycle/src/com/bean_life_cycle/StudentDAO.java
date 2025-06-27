import org.springframework.beans.factory.annotation.Value;

import java.sql.*;


public class StudentDAO {

    @Value()
    private String url;
    private String driver;
    private String username;

    private String password;

    private Connection connection;

    @PostConstruct
    public void createStudentDatabaseConnection() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        connection = DriverManager.getConnection(url, username, password);


    }

    public void closeConnection() throws SQLException {
        connection.close();

    }

    public void getAllStudents() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultset = statement.executeQuery("select * from student");

        while (resultset.next()){
            String studentId = resultset.getString(1);
            System.out.println(studentId);
        }

    }


    public void deleteStudent(int studentId) throws SQLException {

        Statement statement = connection.createStatement();
        statement.executeUpdate("delete from student where studentID=",+studentId);
        System.out.println("Student record deleted for id "+studentId);
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
