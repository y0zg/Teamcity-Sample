package test.java.pk1a;

 //fffffffffffffffffffffffffffffffff
import main.java.pk1.HelloPease;
import junit.framework.*;
//fffff
public class  TestHelloPease extends TestCase {
  public void testSimpleMessage() {
     String message = new HelloPease("World222").sayHello();
     Assert.assertEquals("Test Hello Machine", "Hello, World222", message);
  }
}
