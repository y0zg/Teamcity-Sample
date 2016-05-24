package main.java.pk1;

public class HelloWorld {
private String name;

     public static void main(String [] args) {
     System.out.println(new HelloWorld("Test").sayHello());
         System.out.println("Bye");
 //      more  changes to testda;gjs;agjhas
     }
  public HelloWorld(String name) {
      this.name = name;
  }

  public String sayHello() {
      return "Hello, " + name;
  }
}
