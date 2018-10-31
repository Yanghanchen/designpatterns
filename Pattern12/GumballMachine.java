package Pattern12;

import java.util.Random;

public class GumballMachine {
    final static int SOLD_OUT=0;
    final static int NO_SQUARE=1;
    final static int HAS_SQUARE=2;
    final static int SOLD=3;

    private int state=SOLD_OUT;
    int count=0;

    public GumballMachine(int count){
        if(count>0){
            this.count=count;
            state=NO_SQUARE;
        }
    }

    public void insertCoin(){
        switch (state){
            case SOLD_OUT:
                System.out.println("The Machine is sold out.You can't insert a coin.");break;
            case NO_SQUARE: {
                System.out.println("You inserted a quarter.");
                state=HAS_SQUARE;
            }break;
            case HAS_SQUARE:
                System.out.println("There is enough coin.Don't insert anymore");break;
            case SOLD:{
                System.out.println("You inserted a quarter.");
                state=HAS_SQUARE;
            }break;
        }
    }

    public void ejectCoin(){
        switch (state){
            case SOLD_OUT:
                System.out.println("You haven't inserted any coin.");break;
            case NO_SQUARE:
                System.out.println("You haven't inserted any coin.");break;
            case HAS_SQUARE: {
                if(count>0) {
                    System.out.println("Coin returned.");
                    state = NO_SQUARE;
                }else
                    state=SOLD_OUT;
            }break;
            case SOLD:
                System.out.println("You have already used the cash.");break;
        }
    }

    public void turnCrank(){
        switch (state){
            case SOLD_OUT:
                System.out.println("There is no gumball to be sold.");break;
            case NO_SQUARE:
                System.out.println("You haven't inserted any coin.");break;
            case HAS_SQUARE: {
                System.out.println("Please waiting for your gumball!");
                dispense();
            }break;
            case SOLD:
                System.out.println("You have already buy a gumball.You can't turn crank twice!");break;
        }
    }

    private void dispense() {
        if(state==HAS_SQUARE){
            if(count>0) {
                int winner= new Random(System.currentTimeMillis()).nextInt(10);
                if(winner==0&&count>1){
                    System.out.println("WOW!You are lucky to get two gumball for one quarter.");
                    count-=2;
                }else {
                    System.out.println("A gumball comes rolling out the slot!");
                    count--;
                }
                state=SOLD;
                if(count==0)
                    state=SOLD_OUT;
            }else if(count==0){
                System.out.println("Oops!There is no gumball to sell!You can eject your coin!");
                state=SOLD_OUT;
            }
        }
    }

    public void refill(int n){
        if(state==SOLD_OUT) {
            System.out.println("Now players can get gunmball~");
            count = n;
            state=NO_SQUARE;
        }else
            System.out.println("There are still gumballs in the machine.You don't need to fill it.");
    }

    public int getCount() {
        return count;
    }

    public int getState() {
        return state;
    }
}
