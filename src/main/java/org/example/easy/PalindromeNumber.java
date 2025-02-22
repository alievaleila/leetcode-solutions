package org.example.easy;

public class PalindromeNumber {
    private boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original=x;
        int reversed=0;

        while(x>0){
            int digit=x%10;
            reversed=reversed*10+digit;
            x/=10;
        }
        return original==reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber pn=new PalindromeNumber();
        boolean result=pn.isPalindrome(121);
        System.out.println(result);

    }

}

