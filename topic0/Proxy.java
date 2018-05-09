import builder.Director;
import builder.MySQLBuilder;
import connections.DataBaseConnection;

public class Proxy {
	Director myConnectionDirector = null;
	
	public Proxy() {}
	
	/** This method return true if the connection was done 
	 * or false if there was any error.
	 * */
	public void mySqlConnection(){
		try {
			if(myConnectionDirector == null) {
				MySQLBuilder mysql = new MySQLBuilder("testingDataBase");
				this.myConnectionDirector = new Director(mysql);
				this.myConnectionDirector.constructConnection();
			}else{
			    throw  new Exception("We are sorry, something happened during the connection");
            }

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

    public void setMyConnectionDirector(Director myConnectionDirector) {
        this.myConnectionDirector = myConnectionDirector;
    }
}
