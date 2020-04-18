import java.lang.reflect.Array;

public class StringBuilderTest {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("123");
        //Class<?> klass = str.getClass();

        System.out.println(str.getClass().getName());

    }
}