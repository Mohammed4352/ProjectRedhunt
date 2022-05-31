
public class SwapTwoNumbers {
	int a=10;
	int b=20;
	int temp;
	public void swapTwoNumber() { 
		temp=a;
		a=b;
		b=temp;
	
	System.out.println( "a value"+a);
	System.out.println( "b value"+b);
	System.out.println( "temp value"+temp);
	
	}
	
	
public void amazon() {  
	       int d= 4;
	       int e= 8;
	       int num;
	       
	       
	      num=e;
	      e=a;
	      d=num;  //a=8,b=4,num=8;

	       System.out.println("d value is--->"+d);
	       System.out.println("e value is--->"+e);
	       System.out.println("num value is--->"+num);
	       	       
}
	       

	public static void main(String[] args) {
		// TODO Auto-generated mthod stub
SwapTwoNumbers sap = new SwapTwoNumbers();
            sap.swapTwoNumber();
             //  sap.amazon();

	}

}
