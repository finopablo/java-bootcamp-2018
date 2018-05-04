import Builder.Director;
import Builder.MySQLBuilder;
import Connections.DataBaseConnection;

public class Proxy {
	Director myConnectionDirector = null;
	
	public Proxy() {}
	
	/** This method return true if the connection was done 
	 * or false if there was any error.
	 * */
	public boolean mySqlConnection(){
		boolean result=false;
		try {
			if(myConnectionDirector == null) {
				MySQLBuilder mysql = new MySQLBuilder("testingDataBase");
				this.myConnectionDirector = new Director(mysql);
				this.myConnectionDirector.constructConnection();
			}
			result=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
