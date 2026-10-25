package Calculator2;
import java.util.Scanner;
public class Driver {
        
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WElcome to Java Calculator: ");
         String dataType = input.next();
         String operator = input.next();

        // Code block that handles doubles
if (dataType.equals("double")) {

    double value1 = input.nextDouble(); // your scanner object must be named input to avoid a mismatch or change the input object name to match your scanner object name
    double value2 = input.nextDouble();
    double result ;

    if (operator.equals("+"))
        result = Calculator.addTwo(value1, value2);
    else if (operator.equals("-"))
        result = Calculator.subtractTwo(value1, value2);
    else if (operator.equals("*"))
        result = Calculator.multiplyTwo(value1, value2);
    else if (operator.equals("/"))
        result = Calculator.divideTwo(value1, value2);
    else {
        System.err.println("Invalid operator.");
        return;
    }
    // Add your result printing statement here
    System.out.println(result);
}

// Code block that deals with integers
else if (dataType.equals("integer")) {

    int value1 = input.nextInt();
    int value2 = input.nextInt();
    int result;

    if (operator.equals("+"))
          result = Calculator.addTwo(value1, value2);
    else if (operator.equals("-"))
        result = Calculator.subtractTwo(value1, value2);
    else if (operator.equals("*"))
        result = Calculator.multiplyTwo(value1, value2);
    else if (operator.equals("/"))
        result = Calculator.divideTwo(value1, value2);
    else {
        System.err.println("Invalid operator.");
        return;
    }
    // Add your result printing statement here
    System.out.println(result);
} 

// Code block to deal with a non-valid data type input
else {
    System.err.println("Data type incompatible - exiting program.");
}
    // //
    //     //Test object2 = new Test(7, 8);
    //     //object2.ownMethod();
    //     double num1 = 7.0;
    //     double num2 = 8.0;
        
    //     System.out.println("Welcome to Java....");
    //     System.out.println();
    //     System.out.println(num1 + " + " + num2 + "= " + Calculator.addTwo(num1,num2));
    //     //object2.ownMethod2();
    //     System.out.println(num1 + " * " + num2 + " = " + Calculator.multiplyTwo(num1,num2));

    //     //object2.ownMethod3();
    //    System.out.println(num1 + " - " + num2 + " = " + Calculator.subtractTwo(num1,num2));

    //     //object2.ownMethod4();
    //     System.out.println( num1 + " / " + num2 + " = " + Calculator.divideTwo(num1,num2));

    // 
}
}
