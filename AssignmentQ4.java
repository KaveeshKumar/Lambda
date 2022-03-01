import java.util.ArrayList;
import java.util.Arrays;

public class AssignmentQ4 {
    public static ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        employeeList.removeIf(s -> ((s.length())%2 != 0));
        return employeeList;
    }
    public static void main(String[] args) {
        ArrayList<String> employeeList = new ArrayList<> (Arrays.asList("Lion","Tiger", "Bull", "Bear", "Black Panther"));
        System.out.println(removeOddLength(employeeList));
    }
}