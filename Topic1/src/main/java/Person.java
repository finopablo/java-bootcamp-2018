public class Person {
    String userName;
    String password;
    String dni;

    public Person(String userName) {
        this.userName = userName;
    }

    public Person(String myuserName, String mypassword, String myDni) {
        this.userName = myuserName;
        this.dni = myDni;
        this.password = mypassword;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
