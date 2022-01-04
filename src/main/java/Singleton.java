public class Singleton {

    // volatile关键字防止实例化对象的时候指令重排
    private volatile static Singleton singleton;

    private Singleton() {}

    public static Singleton getUniqueInstance() {
        // 第一次判断对象是否被创建过
        // 为了在已创建singleton对象的情况下，避免进入同步代码块，提高效率
        if(singleton == null) {
            synchronized (Singleton.class) {
                // 第二次判断
                // 防止重复创建对象
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
