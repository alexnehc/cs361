public class week3_question4{
    
    static double fibonnaciRecursive(double n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        else {
            return fibonnaciRecursive(n-1) + fibonnaciRecursive(n-2);
        }     
    }

    static double fibonnaciIterative(double n){
        
        
        if (n == 0)
            return 0;


        double zero = 0, one = 1, res;
        for (int i = 2; i <= n; i++) {
            res = zero + one;
            zero = one;
            one = res;
        }
        return one;
    }

    public static void main(String[] args){
        
            System.out.println(fibonnaciRecursive(10));
            System.out.println(fibonnaciRecursive(40));        
           // System.out.println(fibonnaciRecursive(80));
            //System.out.println(fibonnaciRecursive(800));
        

        System.out.println(fibonnaciIterative(10));
        System.out.println(fibonnaciIterative(40));
        System.out.println(fibonnaciIterative(80));
        System.out.println(fibonnaciIterative(800));
}
}