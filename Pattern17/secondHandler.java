package Pattern17;

public class secondHandler extends Handler{
    @Override
    public void handleRequest(String str) {
        if(!str.startsWith("second"))
            System.out.println("No handler can process this string");
        else{
            System.out.println("Second Handler processed :"+str);
        }
    }
}
