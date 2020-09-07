package task_1;

import org.hsqldb.server.Server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Connection;
import java.util.ResourceBundle;

public class Main implements ServletContextListener {
    private ResourceBundle properties = ResourceBundle.getBundle("resource");
    private Connection connection;
    private Server s;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        try {
            System.out.println("Start");
            s = new Server();
            s.setDatabaseName(0, properties.getString("db.name"));
            s.setDatabasePath(0, properties.getString("db.path"));
            s.start();

            System.out.println("Create connections");

            ConnectionPool pool = new ConnectionPool(properties.getString("db.url"), "org.hsqldb.jdbc.JDBCDriver",
                    properties.getString("db.user"), properties.getString("db.password"), 1);
            connection = pool.retrieve();

            if (connection != null) {

                System.out.println("You made it, take control your database now!");
                int r = connection.createStatement().executeUpdate("create table test(text varchar(255));");
                System.out.println(r);
                if (r == 0) {
                    System.out.println("It is work!");
                } else {
                    System.out.println("It is not work!");
                }
            } else {
                System.out.println("Failed to make connection!");
            }
            pool.putback(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
