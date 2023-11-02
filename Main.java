public class Main {
    static int interest(int p, int r, int t){
        return (p*r*t)/100;
    }

    public static void main(String[] args) {
        Main I = new Main();
        System.out.println("simple interest is = " + I.interest(100000, 5, 5));
    }    
} 