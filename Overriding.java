class Example1{
	public void add(int num1,int num2){
		int result1=num1+num2;
		System.out.println("Result of parent class method is "+result1);
	}
}

class Example2{
		public void add(int num1,int	num2){
			int result2=num1-num2;
			System.out.println("Result of overridden method is "+result2);
	}
}

class MainOverriding{
	public static void main(String[] args){
	Example1 obj1= new Example1();
	obj1.add(7,5);
	Example2 obj2=new Example2();
	obj2.add(7,5);
	}
}