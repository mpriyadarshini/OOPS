public class Encapsulation {
    

    public static void main(String[] args) {
        Main obj = new Main();
            obj.setEmpSerial(321);
            obj.setEmpAge(32);
            obj.setEmpName("xyz");
          
            System.out.println(obj.getEmpName());
            System.out.println(obj.getEmpAge());
            System.out.println(obj.getEmpSerial());


        
    }
}