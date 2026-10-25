package Calculator2;
import java.util.Scanner;
public class Driver {
        
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WElcome to Java Calculator: ");
         
       

        // Code block that handles doubles
//if (dataType.equalsIgnoreCase("double")) {

    double value1 = input.nextDouble(); // your scanner object must be named input to avoid a mismatch or change the input object name to match your scanner object name
    double value2 = input.nextDouble();
    String dataType = input.next();
      String operator = input.next();
    Object result = null;

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
}

