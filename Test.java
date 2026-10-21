package Calculator2;

public class Test {
    private int num1;
    private int num2;
    public Test(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void oneString(){
    Test object = new Test(num1, num2);
    System.out.println(object);
    }
    public void ownMethod(){
       System.out.println("Welcome to Java Math Calculator!");
       System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        //System.out.printf("The total is %d\n" , ( num1 + num2));
    }

    public void ownMethod2(){
        System.out.println(num1 + " * " + num2 + "=" + (num1 * num2));
    }
    
}
