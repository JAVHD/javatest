import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class ReflectFunc {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<A> cl = A.class;
        Object obj = cl.newInstance();
        Method[] methods = cl.getMethods(); //getMethods() 获取的方法可以获取到父类的方法,比如 java.lang.Object 下定义的各个方法
        Method[] methods1 = cl.getDeclaredMethods(); //getDeclaredMethods() 声明的方法
        Field[] fields = cl.getFields();
        Field[] fields1 = cl.getDeclaredFields();
        //cl.getAnnotation()

        System.out.println("获取的方法可以获取到父类的方法:");
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("当前类的方法:");
        for (Method method : methods1) {
            System.out.println(method);
        }

        System.out.println("获取的属性可以获取到父类的属性:");
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("当前类的属性:");
        for (Field field : fields1) {
            System.out.println(field);
        }

        Method method = cl.getMethod("getAge", Integer.class);
        Object result = method.invoke(obj, 20);

        System.out.println("invoke调用方法:");
        System.out.println(result);


    }
}

class A {
    public static final Integer TYPE = 1;
    public Integer age;
    public double height;

    public Integer getAge() {
        return this.age;
    }

    public Integer getAge(Integer age) {
        return this.age = age;
    }

    public Double getHeight() {
        return this.height;
    }

}