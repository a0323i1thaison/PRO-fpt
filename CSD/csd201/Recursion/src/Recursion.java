public class Recursion {
    int factorial (int n){
        if (n==0) return 1;
        else return n*factorial(n-1);
    }
    
    int fibo(int n){
        if (n==0) return 0;
        else if (n==1) return 1;
        else return fibo(n-2) + fibo(n-1);
    }
    
    void decToBin(long n){
        int q = (int) (n/2);
        int r = (int) (n%2);
        if (n>0) {decToBin(q);
        System.out.print(r);}
    }
    
    void printFiboSequence(int index){
    
    }
}