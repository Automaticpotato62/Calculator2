package Calculator2;

public class Calculator {

    public static <T extends Number> T addTwo(T num1, T num2){
          return num1.doubleValue() + num2.doubleValue();
}
   public static <T extends Number> T multiplyTwo(T num1, T num2){
        return num1.doubleValue() * num2.doubleValue();
   }
   public static <T extends Number> T subtractTwo(T num1, T num2){
      return num1.doubleValue() - num2.doubleValue();
   }
   public static <T extends Number> T divideTwo(T num1, T num2){
      return num1.doubleValue() / num2.doubleValue();
   }


}