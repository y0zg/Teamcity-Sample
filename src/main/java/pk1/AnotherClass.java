package main.java.pk1;

public class AnotherClass {
	int myResult;
	int newResult;
	int myResult1;
	ClassForMath aaa;
//test test test
	public int  AnotherClass(){
 ClassForMath math1 = new ClassForMath();
  myResult1=math1.multiply(5, 6);
  return myResult1;
 
}
	
	public int  newMultiplicity(int x, int y){
		  myResult=aaa.multiply(x, y);
		  return myResult;
		  //
	}
	
	//test
		  
	public int  NewSumma(int num)	{
		newResult=myResult+num;
		return newResult;
	}
	public void publish()
	{
		System.out.println (this.AnotherClass());
		System.out.println (this.NewSumma(29));
		System.out.println (this.newMultiplicity(2,9));
	}
		
		


}
