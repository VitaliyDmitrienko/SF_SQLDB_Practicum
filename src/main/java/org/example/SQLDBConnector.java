// SF Module "SQL DataBase Practicum"

package org.example;

import java.sql.*;

public class SQLDBConnector {

    private  final static String  HOST     = "localhost"  ; // сервер базы данных
    private  final static String  DATABASENAME = "SF_SQL_DB_Practicum"  ;// имя базы
    private  final static String  USERNAME = "postgres"; // учетная запись пользователя
    private  final static String  PASSWORD = "987654321"; // пароль


    private static final String URL="jdbc:postgresql://"+HOST+"/"+DATABASENAME+"?user="+USERNAME+"&password="+PASSWORD;

    private static final String conok="Соединение с БД " + DATABASENAME + " установлено.\n";
    private static final String conerr="Произошла ошибка подключения к БД" + DATABASENAME + " .\n";

    private static Statement statement = null;
    private static ResultSet resultSet = null;
    private static int disconnectorDB = 0;
    public static void main(String[] args) throws SQLException {



        try (Connection connection = DriverManager.getConnection(URL)){
            System.out.println(String.format("%s",conok));
            statement = connection.createStatement();

            do {
            }
                    while (disconnectorDB == 0);

//            String s = "SELECT * from test;";
//            String sql = "SELECT * FROM test";
//
//            boolean isExecuted=statement.execute(sql);
//            if (isExecuted){
//                System.out.println("Select executed");
//            }
//
//            statement.close();
//            connection.close();

//            ResultSet resultSet = statement.executeQuery(sql);
//            System.out.println("ID");
//            System.out.println("||------------||");
//            while (resultSet.next()){
//                System.out.println(resultSet.getInt("ID"));
//            }
//            System.out.println("||------------||");

//            statement.close();
//            resultSet.close();

//            UI.ChatMenu(statement);

            statement.close();
            connection.close();

            connection.close();

        } catch (SQLException e) {
            System.out.println(String.format("%s",conerr));
            e.printStackTrace();
        }
    }

    public static void DisconnectBD (int disconnector) {
        disconnectorDB = disconnector;
    }

    public static ResultSet SQLQueryExecution (String sqlQuery) throws SQLException {

//        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery(sqlQuery);

        boolean isExecuted=statement.execute(sqlQuery);
        if (isExecuted){
                System.out.println("Select executed.");
        }

//        resultSet.close();

        return  resultSet;


    }
}