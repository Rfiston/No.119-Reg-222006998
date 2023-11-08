// class A extends B
class A extends B implements E{
    int Add(int y,int x){
        return y+x;
    }
    public double power(double x,double y){
        return Math.pow(x, y);
    }
}
  //class B extends C
class B extends C{
    int sub(int x, int y){
        return x-y;
    }
}  
   // class C extends D
class C extends D {
    double division(double x, double y){
        return x/y;
    }
}
  // class D
class D{
  int multiply(int x,int y){
    return x*y;
  }
}  
   // interface E
interface E{
  double power(double x,double y);  
}
  // main class
public class work2inhertance {
public static void main(String[]args){
    // object name
 A Obj = new A();
 System.out.println("adding two numbers:"+Obj.Add(12, 10));
 System.out.println("subtracting two numbers:"+Obj.sub(15, 10));
 System.out.println(" power of 2 on 3:"+pow(2,3));
}
}   
 /*
             output
         adding two numbers:  22
         subtracting two numbers: 5
          power of 2 on 3: 8
  */