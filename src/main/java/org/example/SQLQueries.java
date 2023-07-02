package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLQueries {

    private static ResultSet resultSet;
    public static void PrintSchemaTables() throws SQLException {
        String sqlQuery = "SELECT table_name FROM information_schema.tables WHERE table_schema='public';";

            resultSet = SQLDBConnector.SQLQueryExecution(sqlQuery);

    }

    public static void DisconnectorDB () {
        SQLDBConnector.DisconnectBD(1);
    }

}
