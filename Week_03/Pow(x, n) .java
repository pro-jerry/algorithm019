class Solution {
    public double myPow(double x, int n) {
        
        long N = n;

        return N>0? reversion(x,N): 1.0/reversion(x,-N);
    }

    private double reversion(double x, long n) {

         if (n == 0) {
            return 1.0;
        }

        double y = reversion(x,n/2);
        System.out.println(y+"---->>");
        return n%2==0? y*y:y*y*x;

    }
}