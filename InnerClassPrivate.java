
public class InnerClassPrivate {
    public static void main(String[] args) {
        Object1.doSomething();
        //Object1.main({"hello", "world"});
        Object1.doSomething1(new String[]{"hello", "world"});
    }

    private static class Object1 {
        public static void main(String[] args) {
            System.out.println("Object1.main()");
        }

        public static void doSomething() {
            System.out.println("Object1.doSomething()");
        }

        public static void doSomething1(String[] param) {
            System.out.println("Object1.doSomething1()");
        }

    }

}