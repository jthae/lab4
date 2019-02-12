/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    public void fullConstructorTest() throws AssertException
    {
    	Animal animal = new Animal("brown", "fox", 0.5, 1.5);
    	
    	Assert.assertEquals("brown", animal.getColor());
    	Assert.assertEquals("fox", animal.getName());
    	Assert.assertEquals(0.5, animal.getHeight(), 0.01);
    	Assert.assertEquals(1.5, animal.getWeight(), 0.01);
    	
    }
    
    public void getColorTest() throws AssertException
    {
    	Animal animal = new Animal("brown", "fox", 0.5, 1.5);
    	
    	Assert.assertEquals("brown", animal.getColor());
    }
    
    public void getNameTest() throws AssertException
    {
    	Animal animal = new Animal("brown", "fox", 0.5, 1.5);
    	
    	Assert.assertEquals("fox", animal.getName());
    }
    
    public void getHeightTest() throws AssertException
    {
    	Animal animal = new Animal("brown", "fox", 0.5, 1.5);
    	
    	Assert.assertEquals(0.5, animal.getHeight(), 0.01);
    }
    
    public void getWeightTest() throws AssertException
    {
    	Animal animal = new Animal("brown", "fox", 0.5, 1.5);
    	
    	Assert.assertEquals(1.5, animal.getWeight(), 0.01);
    }
    
    public void toStringTest() throws AssertException
    {
    	Animal animal = new Animal("brown", "fox", 0.5, 1.5);
    	
    	Assert.assertEquals("fox, a brown-colored animal. 0.5 pounds, 1.5 inches\n", animal.toString());
    }
}
