package AbstractFactory;

import Drivers.DriverConnection;
import Drivers.MySQLDriverManager;
import Drivers.SQLDriverManager;

public class ConnectionFactory extends ConnectionsAbstractFactory {
	@Override
	public DriverConnection getConnection(String SQL) {
		if(  SQL == null) {
			return null;
		}
		
		if(SQL.equalsIgnoreCase("MySql")) {
			return new MySQLDriverManager();
			
		} else if(SQL.equalsIgnoreCase("SqlServer")) {
			return new SQLDriverManager();
		}
		
		return null;
		
	}
}
