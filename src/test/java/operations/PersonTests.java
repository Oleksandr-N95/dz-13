package operations;

import com.rd.dz13.Person;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonTests {

    private Person person = null;

    @Before
    private void createUsers() {
        person = new Person("John", "Johnson", "Kyiv", "Ukraine");
    }
    @Test
    public void testNameLenght(boolean expected){
        Assert.assertEquals(person.nameLength(), expected,"This result is wrong for person");
    }
    @Test
    public void testChangeCountry(){
        Person person = new Person("John", "Johnson", "Kyiv", "Ukraine");
        person.setCountry("USA");
        Assert.assertEquals(person.getCountry(), "USA", "This country is wrong for person");
    }
}
