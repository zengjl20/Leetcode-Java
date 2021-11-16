public class TraditionalThreadSynchronized {
    public static void main(String[] args){
        final Outputter output = new Outputter();
        new Thread(){
            public void run(){
                output.output("zengjielin");
            }
        }.start();
        new Thread(){
            public void run(){
                output.output("zhangjunbo");
            }
        }.start();
    }
}

class Outputter{
    public void output(String name){
        synchronized (this){
            for(int i = 0; i < name.length(); i++){
                try {
                    System.out.print(name.charAt(i));
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}