package Drivers;

import Connections.Connection;

public interface DriverConnection {
	public Connection getConnection(String dataBase, String u, String p);
}
