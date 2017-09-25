/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longest.palindrome.substring;

/**
 * abaab abaabbaabxsd
 *
 * @author admin
 */
public class Solution {

    int lo = 0;
    int hi = 0;

    public String longestPalindrome(final String s) {
        if (s.length() < 2) {
            return s;
        }

        if (isPallindrone(s)) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = s.length() - 1; j >= i + 1; j--) {
                checkLongestPalindrone(i, j, s);
            }
        }
        return s.substring(lo, hi + 1);
    }

    private void checkLongestPalindrone(int start, int end, String s) {
        int halfway = start + ((end - start) / 2);
        int st = start, n = end;

        while (end != halfway && start < s.length() && s.charAt(start) == s.charAt(end)) {
            end--;
            start++;
        }
        if (end == halfway && n - st > hi - lo) {
            lo = st;
            hi = n;
        }
    }

    public boolean isPallindrone(final String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

//    final StringBuilder sb = new StringBuilder();
//    String longest = "";
//    public boolean isPallindrone(final String s) {
//        sb.delete(0, sb.length());
//        sb.append(s);
//        return s.equals(sb.reverse().toString());
//    }
//        public String longestPalindrome(final String s) {
//        if (s.isEmpty() || s.length() == 1) {
//            return s;
//        }
//        String longest = "";
//
//        for (int i = 0; i < s.length() - 1; i++) {
//            for (int j = s.length(); j > i + 1; j--) {
//                final String substring = s.substring(i, j);
//                if (isPallindrone(substring) && substring.length() > longest.length()) {
//                    longest = substring;
//                }
//            }
//        }
//        return longest.isEmpty() ? s.substring(0, 1) : longest;
//    }
    //
//    public String longestPalindrome(String s) {
//        int start = 0, end = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int len1 = expandAroundCenter(s, i, i);
//            int len2 = expandAroundCenter(s, i, i + 1);
//            int len = Math.max(len1, len2);
//            if (len > end - start) {
//                start = i - (len - 1) / 2;
//                end = i + len / 2;
//            }
//        }
//        return s.substring(start, end + 1);
//    }
//
//    private int expandAroundCenter(String s, int left, int right) {
//        int L = left, R = right;
//        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
//            L--;
//            R++;
//        }
//        return R - L - 1;
//    }
}
