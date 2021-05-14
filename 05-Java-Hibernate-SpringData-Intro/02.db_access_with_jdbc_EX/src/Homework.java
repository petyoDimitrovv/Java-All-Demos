import com.mysql.cj.jdbc.BlobFromLocator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.*;
import java.util.Properties;
import java.util.concurrent.BrokenBarrierException;

public class Homework {
    public static final String DB_CONNECTION_STRING =
            "jdbc:mysql://localhost:3306/";
    public static final String MINIONS_TABLE_NAME = "minions_db";

    private BufferedReader reader;
        
    private Connection connection;

    public Homework(){
        this.reader =  new BufferedReader(
                new InputStreamReader(System.in));
    }

    public void setConnection(String user, String password) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user",user);
        properties.setProperty("password",password);


        this.connection = DriverManager
                .getConnection(DB_CONNECTION_STRING + MINIONS_TABLE_NAME,properties);
    }

    public void getVillainsNamesEx2() throws SQLException {
        String query = "SELECT v.name, COUNT(mv.minion_id) AS 'count'\n" +
                "FROM villains v\n" +
                "JOIN minions_villains mv on v.id = mv.villain_id\n" +
                "GROUP BY v.id\n" +
                "HAVING count > 15\n" +
                "ORDER BY 'count' DESC;\n";


        PreparedStatement statement = connection
                .prepareStatement(query);

        ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                System.out.printf("%s %d %n",
                        resultSet.getString("name"),
                        resultSet.getInt(2));
            }

    }

    public void getMinionNamesEx3() throws IOException, SQLException {
        System.out.println("Enter villain id:");
        int villainId = Integer.parseInt(reader.readLine());

        String villainName = getEntityNameById(villainId, "villains");

        if(villainName == null){
            System.out.printf("No villain with id : %d",villainId);
            return;
        }
        System.out.printf("Villani: %s%n",villainName);

        String query = "SELECT m.name, m.age FROM minions m\n" +
                "JOIN minions_villains mv on m.id = mv.minion_id\n" +
                "WHERE mv.villain_id = ?";
        PreparedStatement statement = connection
                .prepareStatement(query);
        statement.setInt(1,villainId );

        ResultSet resultSet = statement.executeQuery();
        int counter = 1;
        while (resultSet.next()){
            System.out.printf("%d. %s %d%n", counter ++,
                    resultSet.getString("name"),
                    resultSet.getInt("age")
                    );
        }


    }

    private String getEntityNameById(int entityId, String tableName) throws SQLException {
        String query =String.format( "SELECT name FROM %s WHERE id = ?",tableName);


        PreparedStatement statement = connection
                .prepareStatement(query);

        statement.setInt(1, entityId);

        ResultSet resultSet = statement.executeQuery();

        return resultSet.next() ? resultSet.getString("name")
                : null ;

    }

    public void addMinionEx4() throws IOException, SQLException {
        System.out.println("Enter minions info: name, age, town name:");
        String[] minionsInfo = reader.readLine().split("\\s+");
        String minionName = minionsInfo[0];
        int minionAge = Integer.parseInt(minionsInfo[1]);
        String minionsTownName = minionsInfo[2];

        int townId = getEntityIdByName(minionsTownName, "towns");
        int minionsNames = getEntityIdByName(minionName, "minions");

        if(townId < 0){
            insertEntityInTowns(minionsTownName);
        }
        if(minionsNames < 0){
            insertEntityInNames(minionName, minionAge);
        }

    }

    private void insertEntityInNames(String minionName, int minionAge) throws SQLException {
        String query = "INSERT INTO minions(name, age) value(?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1 ,minionName);
        statement.setInt(2 ,minionAge);


        statement.executeUpdate();
    }

    private void insertEntityInTowns(String minionsTownName) throws SQLException {
        String query = "INSERT INTO towns(name) value(?)";
        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, minionsTownName);
        statement.executeUpdate();
    }

    private int getEntityIdByName(String entityName, String tableName ) throws SQLException {

        String query = String.format("SELECT id FROM %s WHERE name = ?", tableName);
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, entityName);

        ResultSet rs = statement.executeQuery();

        return rs.next() ? rs.getInt(1) : -1;
    }

    public void changeTownNamesCasingEx5() throws IOException, SQLException {
        System.out.println("Enter county:");
        String countryName = reader.readLine();

        String query = "UPDATE towns SET name = UPPER(name) WHERE country = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, countryName);
        int townsAffected = statement.executeUpdate();
        System.out.println(String.format("%d town names were affected.",townsAffected));

    }
}
