package lambdaexp;

public class Test {
	public static void main(String[] args) {
		FuncInt f = () -> {
//			for ( int i=1;i<=10;i++) {
//			System.out.println("i ="+i);
//				
//				
//			}
    try {
    	int i = 10/5;
    	System.out.println(i);
    } catch (Exception e) {
    	System.out.println("Exception..");
    }
		};
		
		//FuncInt2 f2 = (int i) - >{
			//for ( int j=1;j<=i;j++);
		//System.out.println(j);	}
		
	 f.printVal ();
	// f2.printVal(5);
	}

}
