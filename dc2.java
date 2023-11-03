//  this is a program that display the greater letter using if   else if 
public class dc2{  // this shows name of class
public static void main(String[] args) {   // this shows main class
     String c="color"; // variable declaration
    String r="red"; // variable declaration
    String y="yellow"; // variable declaration
    String g="green"; // variable declaration
if(c!=r) {   // if condition
System.out.println("stop"); //output while color is red
}else if (c!=y) {  // if condition
    System.out.println("ready to stop"); }  //output while color is yellow
    else if (c!=g)  // if condition
    { 
        System.out.println("go");  //output while color is green
    }
    else  { //  last else
        System.out.println("invalid color");  //output while it is invalid color
    }
}
}  // end of program 
