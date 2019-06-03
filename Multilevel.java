class MultilevelInheritance{
    protected String str;
    MultilevelInheritance(){
        str = "this";
    }
}
class ChildClass1 extends MultilevelInheritance{
    ChildClass1(){
        str = str.concat("is");
    }
}
class ChildClass2 extends ChildClass1{
    ChildClass2(){
        str = str+"Multilevel Inheritance";
    }
    void display(){
        System.out.println(str);
    }
}
class MultilevelInheritanceMain {
	public static void main(String args[]) {
		ChildClass2 obj = new ChildClass2();
		obj.display();
	}
}
