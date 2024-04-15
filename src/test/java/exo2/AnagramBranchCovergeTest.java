package exo2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import exo2.Anagram;

public class AnagramBranchCovergeTest {
    @Test
    public void testIsAnagramWithNullString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "abc"));
    }
    @Test
    public void testIsAnagramWithDifferentLengths() {
        assertFalse(Anagram.isAnagram("cat", "acteur"));
    }
    @Test
    public void testIsAnagramWithValidAnagrams() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    public void testIsAnagramWithNonAnagrams() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }

}
