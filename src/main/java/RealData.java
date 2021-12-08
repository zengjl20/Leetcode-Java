public class RealData implements Data{
    private String result;

    public RealData(String data){
        System.out.println("正在使用data" + data + "网络请求耗时需要等待");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("操作完毕，返回结果");
        result = "成功获取返回结果";
    }

    @Override
    public String getRequest(){
        return result;
    }
}
