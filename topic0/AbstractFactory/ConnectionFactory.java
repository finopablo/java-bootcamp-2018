package abstractFactory;

import drivers.DriverConnection;
import drivers.MySQLDriverManager;
import drivers.SQLDriverManager;

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
