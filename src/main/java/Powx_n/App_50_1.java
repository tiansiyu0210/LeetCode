package Powx_n;

public class App_50_1 {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, -2147483648));
    }

    public static double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }

        if(n > 0){
            return dfs(x, n);
        }else{
            return dfs(1/x, -n);
        }
    }

    public static double dfs(double x, int n){
        if(n == 0){
            return 1;
        }

        if(n == 1){
            return x;
        }
        double half = dfs(x, n/2);
        if(n % 2 == 0){

            return  half * half;
        }

        else{

            return half * half * x;
        }
    }
}
