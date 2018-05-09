package drivers;

import connections.Connection;

public interface DriverConnection {
	public Connection getConnection(String dataBase, String u, String p);
}
