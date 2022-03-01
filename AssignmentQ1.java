@FunctionalInterface
interface calc {
    public void Calc();
}
public class AssignmentQ1 {
    
    public static void main(String[] args) {
    	
    	int num1 = 13 ;int num2 = 5;
        
        calc arithmetic = () -> {  
            System.out.println("Addition of 2nos is :"+ num1+num2);
            System.out.println("Subraction of 2nos is :"+ (num1-num2));
            System.out.println("Multiplication of 2nos is :"+ (num1*num2));
            System.out.println("Division of 2nos is :"+(num1/num2));
        };
        arithmetic.Calc();
    }
}