package Calculator2;

public class Test {
    private int num1 = 5;
    private int num2 = 10;
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
        System.out.printf("The total is %d\n" + num1 + num2);
    }
}
