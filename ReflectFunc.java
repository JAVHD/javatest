import java.lang.reflect.Method;

public class ReflectFunc {
    public static void main(String[] args) {
        Class<?> cl = A.class;
        //A a = cl.newInstance();
        Method[] methods = cl.getMethods();
        Method[] methods1 = cl.getDeclaredMethods();

//        for (Method method : methods) {
//            System.out.println(method);
//        }
        for (Method method : methods1) {
            System.out.println(method);
        }

    }
}

class A {
    public Integer age;
    public double height;

    private Integer getAge() {
        return this.age;
    }

    public Double getHeight() {
        return this.height;
    }

}