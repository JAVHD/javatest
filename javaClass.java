import java.util.ArrayList;
import java.util.List;

public class javaClass {
    public static void main(String[] args)
    {
        List list = new ArrayList<>();

        //System.out.println(list.class); //错误: 找不到符号
        System.out.println(List.class); //interface java.util.List
        System.out.println(list.getClass()); //class java.util.ArrayList
        System.out.println(list.getClass().getName()); //java.util.ArrayList




    }
}