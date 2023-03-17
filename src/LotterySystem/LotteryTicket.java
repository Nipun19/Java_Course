package LotterySystem;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static int LENGTH = 6;
    private static int MAX_NUMBER = 20;
    public static void main(String[] args) {

        int[] ticket = getRandomNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] getRandomNumbers(){

        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i=0;i<LENGTH;i++)
        {
            // this is only get a random numbers with dublications.
            //ticket[i] = random.nextInt(MAX_NUMBER+1);// when gives 20 as a max number, maxmimum genarate number is 19.SO WEN NEED TO ADD 1 TO GET 20

            // this is get a random numbers without dublications.
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_NUMBER+1);
            }while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){

        //This is called enhance loop.It iterates through 'array' and each time assigns the current element to 'value'
        for (int value:array)
        {
            if(value == numberToSearchFor)
            {
                return true;
            }
        }

        //If we reach this point, then the entire array was searched and the value was not found.
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){
        //Array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index>=0){
            return true;
        }
        else return false;
    }

    public static void printTicket(int ticket[]){
        for (int i=0;i<LENGTH;i++)
        {
            System.out.print(ticket[i]+ " | ");
        }
    }
}
