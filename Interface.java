//interfaces are not instantiated but rather implemented

interface Main{
    public void display();
    public void disp();

}

class Interface implements Main{
    public void display(){
        System.out.println("first implementation");
    }
    public void disp(){
        System.out.println("second implementation");
    }
    public static void main(String[] args) {
        Main obj = new Interface();
        obj.display();
        obj.disp();
    }
}