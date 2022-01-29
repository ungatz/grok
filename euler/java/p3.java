public class p3 implements EulerSolution{
    public static void main(String[] args) {
        System.out.println(new p3().run());
    }
    @Override
    public String run() {
        // So the largest prime is that prime which divides the number in the end. ex, 600851475143 = 71 * 839 * 1471 * 6857
        long n = 600851475143L;
        while(true){
            var smallerFactor = smallerFactor(n);
            long p = smallerFactor;
            if(p < n) n /= p;
            else return Long.toString(n);
        }
    }
    private static long smallerFactor(long n){
        if(n <= 1) throw new IllegalArgumentException();
        for(long i = 2, m = Library.sqrt(n); i <= m; i++){
            if(n%i == 0) return i;
        }
        return n;
    }
}
