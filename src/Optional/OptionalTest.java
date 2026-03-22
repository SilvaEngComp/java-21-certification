package Optional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> o1 = findName("Eliabe");
        o1.ifPresent(s->System.out.println(s.toUpperCase()));
        System.out.println(o1);
    }


    public static Optional<String> findName(String name){
        List<String> names = List.of("Eliabe", "Valquiria","Daniel");
        int index = name.indexOf(name);

        if(index!=-1){
            return Optional.of(names.get(index));
        }
        return Optional.empty();
    }
}
