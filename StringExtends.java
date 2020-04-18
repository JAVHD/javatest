
public class StringExtends {


    public static void main(String[] args) {

        Object1 object1 = new Object1();
        Object2 object2 = new Object2();

        System.out.println(object1.name);
        System.out.println(object2.name);

    }


}


class Object1 {
    String name = "bear";
}

class Object2  extends Object1{

}