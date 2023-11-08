  // Interface E
interface E{
    void traffic_lights();
}
   // Class A extends B and implements interface E
class A extends B implements E { 
    public void traffic_lights() {
        System.out.println("Traffic lights");
    }
    public void red() {
        System.out.println("stop");
    }
}
        // Class B extends C
class B extends C {
    public void yellow() {
        System.out.println("go slowly and ready to stop ");
    }
}
   // Class C extends D
class C extends D {
    public void Green() {
        System.out.println("you have to go");
    }
}
      // Class D
class D {
    public void other_colors() {
        System.out.println("invalid color");
    }
}

    // main class  
public class hybrid {
    public static void main(String[] args) {
        //  object naming
        A road_sign = new A();

         // method calling
         road_sign.traffic_lights();
        road_sign.red();
        road_sign.yellow();
        road_sign.Green();
        road_sign.other_colors();
    }
}


/*
 * 
 *           Output
 
 Traffic lights
stop
go slowly and ready to stop 
you have to go
invalid color
 */