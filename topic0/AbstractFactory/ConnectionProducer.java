package AbstractFactory;

import Connections.Connection;
import Drivers.MySQLDriverManager;
import Drivers.SQLDriverManager;

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
		}
		
		return connection;
	}
}
