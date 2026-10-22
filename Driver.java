package Calculator2;

public class Driver {
    public static void main(String[] args){
        Test object2 = new Test(7, 8);
        object2.ownMethod();
        
        Calculator.addTwo(7,8);

        object2.ownMethod2();
        Calculator.multiplyTwo(7,8);

        object2.ownMethod3();
        Calculator.subtractTwo(7,8);

        object2.ownMethod4();
        Calculator.divideTwo(7,8);
    }
}
