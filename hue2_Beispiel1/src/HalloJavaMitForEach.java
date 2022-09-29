import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavaMitForEach {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();

        for (String s: liste) {
            System.out.println(s);
        }

        liste.forEach((String s) -> System.out.println(s));

        Consumer<String> consumer = (String s) -> System.out.println(s);

        liste.forEach(System.out :: print);


    }

}