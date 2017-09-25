/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longest.palindrome.substring;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class SolutionTest {

    public SolutionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of longestPalindrome method, of class Solution.
     */
    @Test
    public void testLongestPalindrome() {
        System.out.println("longestPalindrome");
        String s = "aba";
        Solution instance = new Solution();
        String expResult = "aba";
        String result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
    }
    @Test
    public void testLongestPalindrome2() {
        System.out.println("longestPalindrome2");
        String s = "abaab";
        Solution instance = new Solution();
        String expResult = "baab";
        String result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
    }
    @Test
    public void testLongestPalindrome3() {
        System.out.println("longestPalindrome3");
        String s = "abaabbaabxsd";
        Solution instance = new Solution();
        String expResult = "baabbaab";
        String result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
    }
    @Test
    public void testLongestPalindrome4() {
        System.out.println("longestPalindrome4");
        String s = "abaabbaabxsdzzzzzzzzzzzz";
        Solution instance = new Solution();
        String expResult = "zzzzzzzzzzzz";
        String result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
    }
    @Test
    public void testLongestPalindrome5() {
        System.out.println("longestPalindrome5");
        String s = "a";
        Solution instance = new Solution();
        String expResult = "a";
        String result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
    }
    @Test
    public void testLongestPalindrome6() {
        System.out.println("longestPalindrome6");
        String s = "ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy";
        Solution instance = new Solution();
        String expResult = "fklkf";
        String result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
    }
    @Test
    public void testLongestPalindrome7() {
        System.out.println("longestPalindrome6");
        String s = "cbbd";
        Solution instance = new Solution();
        String expResult = "bb";
        String result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPallindrone method, of class Solution.
     */
//    @Test
//    public void testIsPallindrone() {
//        System.out.println("isPallindrone");
//        String s = "abaaba";
//        Solution instance = new Solution();
//        boolean expResult = true;
//        boolean result = instance.isPallindrone(s);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testIsPallindrone2() {
//        System.out.println("isPallindrone2");
//        String s = "abaabab";
//        Solution instance = new Solution();
//        boolean expResult = false;
//        boolean result = instance.isPallindrone(s);
//        assertEquals(expResult, result);
//    }

}
