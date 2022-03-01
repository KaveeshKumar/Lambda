import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;


public class AssignmentQ8 {
    public static void main(String[] args) {
        ArrayList <Integer> j = new ArrayList<>(Arrays.asList(74,96,57,12,61,89,21,96,92,81));
        Consumer <ArrayList<Integer>> i = (k) -> System.out.println(k);
        i.accept(j);
        new Thread(() -> i.accept(j)).start();  //lambda expression for new thread.
    }
}