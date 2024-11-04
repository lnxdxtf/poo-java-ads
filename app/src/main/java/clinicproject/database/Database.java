package clinicproject.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database  {

    public interface Repository<CONN> {
        <MODEL> void create(MODEL model, CONN connection);
        <MODEL> MODEL read(int id, CONN connection);
        <MODEL> void update(MODEL model, CONN connection);
        <MODEL> void delete(int id, CONN connection);
    }


    public static  Connection createConnectionSQL() {
        String url = "jdbc:mysql://localhost:3306/clinic";
        String user = "root";
        String password = "root";
        
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void execSQL(Connection connection, String query) {
        
    }

    public class DatabaseSQL implements Repository<Connection> {


        @Override
        public <MODEL> void create(MODEL model, Connection connection) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'create'");
        }

        @Override
        public <MODEL> MODEL read(int id, Connection connection) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'read'");
        }

        @Override
        public <MODEL> void update(MODEL model, Connection connection) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'update'");
        }

        @Override
        public <MODEL> void delete(int id, Connection connection) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'delete'");
        }

    }

}
