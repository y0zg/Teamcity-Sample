package test.java.pk1a;

import main.java.pk1.ClassForMath;
//import junit.framework.*;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TestClassForMath {

@Ignore @Test       public void testMultiply() {
            ClassForMath tester = new ClassForMath();
            System.out.println("1");
            System.out.print("2");
            System.out.print("hello");
            System.err.print("hello again");
               assertEquals("Result", 30, tester.multiply(6, 5));

        }
        public void testMultiply2() {
            ClassForMath tester = new ClassForMath();
            System.out.print("2");
            System.out.print("hello");
            System.err.print("hello again");
               assertEquals("Result", 30, tester.multiply2(6, 5));
       }
////t


public void failingtestSumma() {
	
    ClassForMath tester = new ClassForMath();
    System.out.println("3");
    
       assertEquals("Result", 17, tester.summa(12, 5));
//dddddd
}

@Ignore @Test  public void testDifference() {


    ClassForMath tester = new ClassForMath();
    System.out.println("4");
       assertEquals("Result", 17, tester.difference(12, 5));

}


@Ignore @Test public void testDifference2() {
//sdfsfdfsdfdfsdf
	//sdfsdfsdfsdfsdf
	//dfkdkfjskfjsldkfjslkdjflskjflksdjfsf
    ClassForMath tester = new ClassForMath();
       assertEquals("Result", 7, tester.difference(12, 5));
assertEquals("Result", 50, tester.multiply(10, 5));

}
@Ignore @Test public void testDifference1() {
    ClassForMath tester = new ClassForMath();
       assertEquals("Result", 7, tester.difference(12, 5));

}
@Ignore @Test public void testDivision() {
    ClassForMath tester = new ClassForMath();
       assertEquals("Result", 8, tester.division(8,1));}

@Ignore @Test public void testDoubleSumma() {
	//dfdfdfsfsdfsfdsfsf
	//dfsfdfsdfdfsdfsff
    ClassForMath tester = new ClassForMath();
       assertEquals("Result", 34, tester.double_summa(12, 5));
       //zzxzxzxzxzxzxzxzxzxzx
       
}
@Ignore @Test public void testTripleSumma()
{ClassForMath test1= new ClassForMath();
assertEquals("Result", 12, test1.triple_summa(2,2) );
	}


}

