package exo1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import exo1.Palindrome;

public class PalindromeBranchCovergeTest {
    @Test
    public void testIsPalindromeWithPalindromeString() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeString() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithNullString() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }


    // Ajoutez des tests supplémentaires pour couvrir d'autres cas de test
}
