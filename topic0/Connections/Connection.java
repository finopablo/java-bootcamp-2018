package connections;

public class Connection {
	
	private static Boolean connected = false;
	private String dataBase = "testingDataBase";
	private String user = "sara";
	private String password = "myConnection";
	
	public Connection(String database, String user, String password) {
		if(this.dataBase.equals(database) && this.user.equals(user) && this.password.equals(password) ) {
			connected = true;
		}else {
			throw  new Exception("You have an error in your connection. Please, try again later");
		}
	}

}
