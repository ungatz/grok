public class p5 implements EulerSolution{
    public static void main(String[] args) {
        System.out.println(new p5().run());
    }
    @Override
    public String run() {
        // How to know the limits? When to stop?
        // -> Just return the first one we get.
        int smol = 1;
        while(true){
            if(divisible(smol)) return Integer.toString(smol);
            else {
               smol++;
            }
        }
    }
    private static boolean divisible(int smol){
        for(int i = 0; i <= 20; i++){
            if(smol%i != 0) return false;
        }
        return true;
    }
}
