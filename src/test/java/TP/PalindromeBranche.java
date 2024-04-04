package TP;

import org.example.TP.Palindrome;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeBranche {

    @Test
    public void testIsPalindromeWithPalindromeString() {
        // Test with a palindrome string
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    public void testIsPalindromeWithPalindromeStringWithSpacesAndCase() {
        // Test with a palindrome string with spaces and case differences
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeString() {
        // Test with a non-palindrome string
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        // Test with an empty string
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test(expected = NullPointerException.class)
    public void testIsPalindromeWithNullString() {
        // Test with null string
        Palindrome.isPalindrome(null);
    }
}

