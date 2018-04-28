import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambaTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("oskar", "paweł", "magda", "ryś"));
        names.sort((s,s1)->s1.compareTo(s));

    }
}
