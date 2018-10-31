package Pattern20;

public class Mediator {
    public static void doSettlement(Result result,Player player1,Player player2){
        if(result == Result.AWin){
            player1.setBalance(player1.getBalance()+10);
            player2.setBalance(player2.getBalance()-10);
        }else if(result == Result.BWin){
            player1.setBalance(player1.getBalance()-10);
            player2.setBalance(player2.getBalance()+10);
        }
    }

    public static void main(String[] args){
        Player A=new Player(100),B=new Player(100);
        System.out.println("Origin:  A:"+A.getBalance()+",B:"+B.getBalance());
        Mediator.doSettlement(Result.AWin,A,B);
        System.out.println("After Round 1:  A:"+A.getBalance()+",B:"+B.getBalance());
    }
}
