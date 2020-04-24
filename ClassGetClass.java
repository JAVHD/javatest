import java.util.ArrayList;
import java.util.List;

public class ClassGetClass {
    public static void main(String[] args)
    {

        Integer age = 18;
        List list = new ArrayList<>();

        //System.out.println(list.class); //错误: 找不到符号
        System.out.println(List.class); //interface java.util.List
        System.out.println(list.getClass()); //class java.util.ArrayList
        System.out.println(list.getClass().getName()); //java.util.ArrayList

        System.out.println(int.class); //int
        System.out.println(Integer.class); //class java.lang.Integer
        System.out.println(Integer.TYPE); //int
        System.out.println(age.getClass()); //class java.lang.Integer






    }
}