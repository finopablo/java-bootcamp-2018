package connections;

import abstractFactory.ConnectionProducer;

public class DataBaseConnection {

	private Connection myConnection;
	private static DataBaseConnection dataBaseConnection = null;
	
	private DataBaseConnection(){
		try {
			myConnection = ConnectionProducer.getConnection("MySql","testingDataBase", "sara", "myConnection");
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	
	public static DataBaseConnection getInstance() {
		if(dataBaseConnection == null) {
			dataBaseConnection = new DataBaseConnection();
		}
		return dataBaseConnection;		
	}
	
	//Builder Patron methods
	private DataBaseConnection(String odbc, String dataBase, String user, String password) {
		try {
			myConnection = ConnectionProducer.getConnection(odbc, dataBase, user, password);
		}catch(Exception e) {
			e.printStackTrace();}
	}

	public static DataBaseConnection getInstance(String odbc, String dataBase, String user, String password) {
		if(dataBaseConnection == null) {
			dataBaseConnection = new DataBaseConnection(odbc, dataBase, user, password);
		}
		return dataBaseConnection;		
	}
	
	public Connection getConnection() {
		return myConnection;
	}

}
