
public class finalTest {
    public static void main(String[] args) {
        System.out.println(ClassB.getAge());
    }

    public static class ClassA {
        public static final int age = 18; //不可被重写

        public static int getAge() {
            return age;
        }

    }

    public static class ClassB extends ClassA {
        public static final int age = 30;

//        public static test() {
//            System.out.println("ClassB.test()");
//        }
    }

}