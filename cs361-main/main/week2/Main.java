import java.util.Scanner;

public class Main {
    public static void main (String args[]){

        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt(); // the range of elements
        int amountOfElements = scan.nextInt(); // the amount of different combinations required. (k)

        //array of combinations
        int[] combos = new int[amountOfElements];
        generate(1, range, amountOfElements, 0, combos);

    }

    static void generate(int start, int range, int amount, int i, int[] combos){
        //base case: if index == amount of elements required, simply print combination array
        if (i == amount){
            printAll(combos);
            return;
        }

        //else recursively call the generate function to print all the different combinations as stated by the question.
        for (int j = start; j <= range; j++){
            combos[i] = j;
            generate(j + 1, range, amount, i + 1, combos);
        }
    }


    //function to print all of the numbers out.
    static void printAll(int[] combos){
        for (int i : combos){
            System.out.print(i + " ");
        }

        System.out.println();
    }

}