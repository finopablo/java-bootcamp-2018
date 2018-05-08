import org.junit.Assert;
import org.junit.Test;

public class myTest {
    @Test
    public void myFirstTest(){
        Person myPerson = new Person("name", "pass", "dni");
        Assert.assertNotNull(myPerson);
        Assert.assertEquals(myPerson.getUserName(), "name");
        Assert.assertEquals(myPerson.getPassword(), "pass");
        Assert.assertEquals(myPerson.getDni(), "dni");
    }

}
