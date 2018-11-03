import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trial {

    public static void main(String[] args){

        List list = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
        }};

        list.stream().forEach(x -> System.out.print(x));
        System.out.print('\n');
        // If there was a method we could have referenced to it with .(x::SomeMethod)

        list.stream().forEach(i -> printPlusOne((Integer)i));
        System.out.print('\n');

        // An older way to do the previous
        for (Object x : list) {
            System.out.print(x);
        }
        System.out.print('\n');

    }

    public static void printPlusOne(Integer i) {
        System.out.print(i + 1);
    }
}



