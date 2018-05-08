package Builder;

import Connections.DataBaseConnection;

public class MySQLBuilder implements Builder{
	
	private DataBaseConnection myConnection;
	
	public MySQLBuilder(String dataBase) {
		myConnection.getInstance("MySql", dataBase , "sara", "myConnection");
	}

	@Override
	public DataBaseConnection getConnection() {
		return myConnection;
	}


}
