import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class test {
    public static void main(String[] args) throws InterruptedException {
        int[] a = {10,9,10,4,3,8,3,3,6,2,10,10,9};
        String p = "abc";
        int x = 1;
        for(int b : a){
            x  = x* b;
        }
        int cpuCoreSize = Runtime.getRuntime().availableProcessors();
        System.out.println("当前机器可用到CPU数：" + cpuCoreSize);
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Java虚拟机最大内存" + maxMemory + "字节" + maxMemory/1024/1024 + "MB");
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("Java虚拟机内存总量" + totalMemory + "字节" + totalMemory/1024/1024 + "MB");
        System.out.println("".equals(p.substring(3)));
        try{
            Class c = Student.class;
            Person person = (Person) c.newInstance();
            System.out.println(person.getInformation("zeng", 18));
        } catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
