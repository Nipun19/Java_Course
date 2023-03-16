package LotterySystem;

import java.util.Random;

public class LotteryTicket {

    private static int length = 6;
    public static void main(String[] args) {

        int[] ticket = getRandomNumbers();
        printTicket(ticket);
    }

    public static int[] getRandomNumbers(){

        int[] ticket = new int[length];
        Random random = new Random();
        for(int i=0;i<length;i++)
        {
            ticket[i] = random.nextInt(6);// maxmimum genarate number is 5
        }
        return ticket;
    }

    public static void printTicket(int ticket[]){
        for (int i=0;i<length;i++)
        {
            System.out.print(ticket[i]+ " ");
        }
    }
}
