package main.java.pk1;

public class HelloWorld {
private String name;

     public static void main(String [] args) {
     System.out.println(new HelloWorld("Test").sayHello());
         System.out.println("Bye");
 //        my first change
     }
  public HelloWorld(String name) {
      this.name = name;
  }

  public String sayHello() {
      return "Hello, " + name;
  }
}