package org.example.easy;

import java.util.HashMap;

public class RomanToInteger {
    protected static int romantoInt(String s) {

        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));
            if (i + 1 < s.length() && current < romanMap.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romantoInt("XXV"));
        System.out.println(romanToInteger.romantoInt("XXVI"));
        System.out.println(romanToInteger.romantoInt("XCI"));

    }
}
