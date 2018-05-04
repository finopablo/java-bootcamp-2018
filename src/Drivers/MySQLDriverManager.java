package Drivers;

import Connections.Connection;

public class MySQLDriverManager implements DriverConnection{
	public MySQLDriverManager() {
	}
	
	public Connection getConnection(String dataBase, String user, String password) {
		return new Connection(dataBase, user, password);
	}

}
