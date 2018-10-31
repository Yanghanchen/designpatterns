package Pattern17;

public class firstHandler extends Handler{
    @Override
    public void handleRequest(String str) {
        if(!str.startsWith("first"))
            getSuccessor().handleRequest(str);
        else{
            System.out.println("First Handler processed :"+str);
        }
    }
}
