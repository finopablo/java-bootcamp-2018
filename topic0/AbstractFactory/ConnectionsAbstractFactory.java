package abstractFactory;

import drivers.DriverConnection;

public abstract class ConnectionsAbstractFactory {
	abstract DriverConnection getConnection(String SQL);
}
