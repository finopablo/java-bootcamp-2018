package Drivers;

import Connections.Connection;

public class SQLDriverManager implements DriverConnection{ 
	
	public SQLDriverManager() {
	}
	
	public Connection getConnection(String dataBase, String user, String password) {
		return new Connection(dataBase, user, password);
	}

}
