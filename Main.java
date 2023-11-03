// this program display simple interest
public class Main { // this is the main class
    static int interest(int p, int r, int t){ // name of the method
        return (p*r*t)/100; // output that will be returned
    }

    public static void main(String[] args) { // main class
        Main I = new Main(); // object name
        System.out.println("simple interest is = " + I.interest(100000, 5, 5)); // out put
    }    
} // end of a program 
