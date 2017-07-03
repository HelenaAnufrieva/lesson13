import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Hillel on 03.07.2017.
 */
public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        list.stream().forEach((element) -> System.out.println(element));
        // =
        list.stream().forEach(System.out::println);

        list
                .stream()
                .filter((element) -> element.equals("d")) // оставит только д в списке
                .collect(Collectors.toList());


        IterStr s = new IterStr();
        System.out.println(s.doIt());
    }
}
