public class p4 extends Library implements EulerSolution {
    public static void main(String[] args) {
        System.out.println(new p4().run());
    }
    public String run() {
       // How to know when to stop?
       // -> Well we know the last 3 digit number.
        int palindrome = 0;
        for(int i = 100; i < 999; i++){
            for (int j = 100; j < 999; j++) {
                if(Library.isPalindrome(i*j)) {
                        palindrome = Math.max(palindrome, i*j);
                }
            }
        }
        return Long.toString(palindrome);
    }
}
