package Calculator2;

public class Calculator {

    public static int addTwo(int num1,int num2){
          return num1 + num2;
}
   public static int multiplyTwo(int num1, int num2){
        return num1 * num2;
   }
   public static int subtractTwo(int num1, int num2){
      return num1 - num2;
   }
   public static int divideTwo(int num1, int num2){
      return num1 / num2;
   }

    //overloaded method in same class
   public static double addTwo(double num1, double num2){
      return num1 + num2;
   }
   public static double multiplyTwo(double num1, double num2){
      return num1 * num2;
   } public static double subtractTwo(double num1, double num2){
      return num1 - num2;
   } 
   public static double divideTwo(double num1, double num2){
      return num1 / num2;
   }


}