
public class finalTest {
    public static void main(String[] args) {
        System.out.println(ClassB.getAge());
        System.out.println(ClassB.getInch());

        ClassD classD = new ClassD();
        System.out.println(classD.getAge());

    }

    public static class ClassA {
        public static final int age = 18; //final不可被重写
        public static int inch = 13; //静态变量和静态常量属于类，不属于对象，因此它们不能被覆盖

        public static int getAge() {
            return age;
        }

        public static int getInch() {
            return inch;
        }

    }

    public static class ClassB extends ClassA {
        public static final int age = 30;
        public static int inch = 15;

//        public static test() {
//            System.out.println("ClassB.test()");
//        }
    }

}

class ClassC {
    public int age = 18;

    public ClassC() {
        System.out.println("construct:ClassC()");
    }

    public int getAge() {
        return age;
    }

}

class ClassD extends ClassC {
    public ClassD() {
        System.out.println("construct:ClassD()");
    }
    public int age = 30;
}