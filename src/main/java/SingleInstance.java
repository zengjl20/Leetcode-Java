// 饿汉式单例模式
// 加载类时便创建对象了，如果该实例对象自始至终没使用过，则可能造成内存浪费；
public class SingleInstance {

    private SingleInstance(){};

    private static SingleInstance singleInstance = new SingleInstance();

    public static SingleInstance getInstance(){
        return singleInstance;
    }
}

// 简单饿汉式，解决了上述内存浪费问题
// 公有函数声明为sychronized，解决多线程下的问题；
class SingleInstaceV2{

    private SingleInstaceV2(){};

    private static SingleInstaceV2 singleInstaceV2 = null;

    public static synchronized SingleInstaceV2 getInstance(){
        if(singleInstaceV2 == null){
            singleInstaceV2 = new SingleInstaceV2();
        }
        return singleInstaceV2;
    }
}

// 双重检测机制（DCL）懒汉式
// 方法上加锁性能可能会比较低下，将锁的范围减小
// 添加volatile关键字避免重排序问题
class SingleInstanceV3{

    private SingleInstanceV3(){};

    private static volatile SingleInstanceV3 singleInstanceV3 = null;

    public static SingleInstanceV3 getInstance(){
        if(singleInstanceV3 == null){
            synchronized (SingleInstanceV3.class){
                if(singleInstanceV3 == null){
                    singleInstanceV3 = new SingleInstanceV3();
                }
            }
        }
        return singleInstanceV3;
    }
}

// 静态内部类懒汉式
// 初始化静态数据时，Java提供了的线程安全性保证
class SingleInstanceV4{

    private SingleInstanceV4(){}

    private static class LazyHolder{
        private static final SingleInstanceV4 instanceV4 = new SingleInstanceV4();
    }

    public static final SingleInstanceV4 getInstance(){
        return LazyHolder.instanceV4;
    }
}