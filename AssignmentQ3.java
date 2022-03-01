import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AssignmentQ3 {
    public static void main(String[] args) {
        //Consumer
        Consumer<Integer>consumer=(t)-> System.out.println("Hi your number is " + t);
        consumer.accept(28);
        Consumer<String>consumer1=(t)-> System.out.println("Hi my name is " + t);
        consumer1.accept("Kaveesh");
        //supplier
        Supplier<String>supplier=()-> "Supplier method is done";
        System.out.println(supplier.get());
        //predicate
        Predicate<Integer>predicate=(t)->t-5==0;
        System.out.println(predicate.test(5));

    }
}