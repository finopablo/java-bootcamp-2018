package AbstractFactory;

import Drivers.DriverConnection;

public abstract class ConnectionsAbstractFactory {
	abstract DriverConnection getConnection(String SQL);
}
