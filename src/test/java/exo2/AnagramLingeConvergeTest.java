package exo2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import exo2.Anagram;

public class AnagramLingeConvergeTest {

    @Test
    public void testIsAnagramWithValidAnagrams() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    public void testIsAnagramWithNonAnagrams() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }

    @Test
    public void testIsAnagramWithDifferentLengths() {
        assertFalse(Anagram.isAnagram("cat", "acteur"));
    }

    @Test
    public void testIsAnagramWithNullString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "abc"));
    }

    @Test
    public void testIsAnagramWithEmptyStrings() {
        assertTrue(Anagram.isAnagram("", ""));
    }

    @Test
    public void testIsAnagramWithDifferentSpacesAndCase() {
        assertTrue(Anagram.isAnagram("Listen", "S I L E N T"));
    }

    // Ajoutez des tests supplémentaires pour couvrir d'autres cas de test
}
