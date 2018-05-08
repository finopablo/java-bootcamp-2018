
public class Main {

	public static void main(String[] args) {
		Proxy aConnection = new Proxy();
		if(aConnection.mySqlConnection())  
			System.out.print("i'm functioning");
		else 
			System.out.print("I failed");

	}

}
