import java.util.Scanner;
public class week3_question3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many powers do you want to show?");
        int exponents = scan.nextInt();

        System.out.println(exponent(exponents));

        for(int i = 0; i <= exponents; i++){
            System.out.println(exponent(i));
        }
    }


    //static int exponent(int n)
    //used double so that the algorithm can handle larger numbers. 

    
    static double exponent(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return 2 * exponent(n - 1);
        }
    }
}