// this program display amount to be paid after three years
public class compound { // class name
    static double comp(double p, double r, double t, double n){ // method name with variables declaration
        return  p*(Math.pow(1+(r/(n*100)),n*t)); // output to be returned
    }
    public static void main(String[] args) { // main class 
        compound C= new compound(); // object name
        System.out.println("the amount he will have paid after 3 years period is equal to: " + comp(500000,18,3,12));//output
    }
} // end of program
