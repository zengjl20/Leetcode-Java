public class FutureData implements Data{

    public volatile static boolean ISFLAG = false;
    private RealData realData;

    public synchronized void setRealData(RealData realData){
        if(ISFLAG){
            return;
        }
        this.realData = realData;
        ISFLAG = true;
        notify();
    }

    @Override
    public synchronized String getRequest(){
        while (!ISFLAG){
            try {
                wait();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return realData.getRequest();
    }
}
