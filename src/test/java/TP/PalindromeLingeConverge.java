package TP;


import org.example.TP.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PalindromeLingeConverge{

    @Test
    public void testIsPalindromeWithPalindromeString() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    public void testIsPalindromeWithPalindromeStringIgnoringCase() {
        assertTrue(Palindrome.isPalindrome("a l ergonome ruse  mesure mon ogre la"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeString() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithNullString() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

}
