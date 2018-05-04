package Connections;

public class Connection {
	
	private static Boolean connect = false;
	private String dataBase = "testingDataBase";
	private String user = "sara";
	private String password = "myConnection";
	
	public Connection(String database, String user, String password) {
		if(this.dataBase.equals(database) && this.user.equals(user) && this.password.equals(password) ) {
			connect = true;
		}else {
			System.out.print("You have an error in your connection. Please, try again later");	
		}
	}

}
