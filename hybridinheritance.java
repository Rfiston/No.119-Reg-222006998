// Interface E
interface E {
    void methodE();
}

// Class A extends B and implements interface E
class A extends B implements E { 
   public  void methodE() { 
        System.out.println("it is possible to get scholarship");
     }
    
    public void methodA() {
        System.out.println("you're allowed to full scholarship");
    }
}

// Class B extends C
class B extends C {
    void methodB() {
        System.out.println("you will get a quartal of sholarship");
    }
}

// Class C extends D
class C extends D {
    void methodC() {
        System.out.println("you're allowed to a partial scholarship");;
    }
}

// Class D 
class D  {
    void methodD() { 
        System.out.println("not enough grade to get any scholarship");

    }
}
    // main class
public class hybridinheritance {
    public static void main(String[] args) {
        //  object naming
        A a = new A();
        // method calling
         a.methodE();
         a.methodA();
         a.methodB();
         a.methodC();
         a.methodD();
    }
}

   /*    
                     output
                     
           it is possible to get scholarship
           you're allowed to full scholarship
           you will get a quartal of sholarship
          you're allowed to a partial scholarship
          not enough grade to get any scholarship
     */