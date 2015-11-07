package test.java.pk1;


import main.java.pk1.HelloPease;
import junit.framework.*;
//ffffff
//dfdfdf
//jjjjjjjjjjjjjjjjjjjjjjj
public class  TestHelloPease extends TestCase {
  public void testSimpleMessage() {
     String message = new HelloPease("World222").sayHello();
     Assert.assertEquals("Test Hello Machine", "Hello, World222", message);
  }
}
