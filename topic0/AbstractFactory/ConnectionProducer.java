package abstractFactory;

import connections.Connection;
import drivers.MySQLDriverManager;
import drivers.SQLDriverManager;

public class ConnectionProducer {
	private static Connection connection;
	
	public static Connection getConnection(String choise, String dataBase, String user, String password) {
		if(  choise == null) {
			connection = null;
		}
		
		if(choise.equalsIgnoreCase("MySql")) {
			MySQLDriverManager mySql= new MySQLDriverManager();
			connection = mySql.getConnection(dataBase, user, password);
			
		} else if(choise.equalsIgnoreCase("SqlServer")) {
			SQLDriverManager sqlServer = new SQLDriverManager();
			connection = sqlServer.getConnection(dataBase, user, password);
		} else {
		    throw  new Exception("the sql is not supported in this version of the program." +
                    "Please try with Mysql or SqlServer");
        }
		
		return connection;
	}
}
