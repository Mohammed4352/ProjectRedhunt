
public class constructorExample {

	public void testAdd() {
	
	System.out.println("this is method");
	}
	
	
	public void constructorExample() {
		  
		System.out.println("this is constructorExample");
	}
	
	
	
	public void constructorExample(int a,int b) {   
	int c = a+b;
	
	
    System.out.println("value of c--->"+c);		
	}
	
	public static void main(String[] args) {
		
		constructorExample aon = new constructorExample();
		constructorExample aon2 = new constructorExample();
		aon.constructorExample();
		aon2.constructorExample(24, 26);

		aon.testAdd();
	}

}
