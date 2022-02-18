// https://leetcode.com/problems/multiply-strings

class Solution {
    public String multiply(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        
        if(l1 == 0 || l2 == 0) return "0";
        
        // now result of multiplication of two numbers
        // would always have size less than equal to length
        // if the two numbers so,
        
        int[] res = new int[l1+l2];
        String s = "";
        
        // idea is to simulate the multiplication we do on 
        // paper the one where last digit of second number is
        // multiplied with the first then we add a 0 in next step
        // and continue. Add the whole shebang to get the final ans.
        
        // to find pos in result.
        int idx1 = 0;
        int idx2 = 0;
        
        for(int i = l1-1; i >= 0; i--){
            int carry = 0;
            int n1 = num1.charAt(i) - '0';
            
            // reset the second pos idx
            idx2 = 0;
            for(int j = l2-1; j >= 0; j--){
                int n2 = num2.charAt(j) - '0';
                int sum = n1 * n2 + res[idx1+idx2] + carry;
                res[idx1+idx2] = sum%10; // we only store the last digit
                idx2++;
                carry = sum/10;
            }
            if(carry>0) res[idx1+idx2] += carry;
            idx1++;
        }
        
        int i = res.length-1;
        while(i >= 0 && res[i] == 0) i--; // ignore 0s from right
        if(i == -1) return "0"; // i.e all were 0s
        while(i >= 0) {
            s += res[i];
            i--;
        }
        return s;
    }
}