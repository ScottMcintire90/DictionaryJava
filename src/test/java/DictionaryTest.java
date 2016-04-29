import org.junit.*;
import static org.junit.Assert.*;

public class DictionaryTest {
  @After
  public void tearDown() {
    // Dictionary.clear();

  }
  @Test
  public void dictionary_instantiatesCorrectly_true() {
    Dictionary testDictionary = new Dictionary("Example");
    assertEquals(true, testDictionary instanceof Dictionary);
  }
  @Test
  public void dictionary_returnsNewWordName_Word() {
    Dictionary testDictionary = new Dictionary("Example");
    assertEquals("Example", testDictionary.getWord());
  }
  @Test
  public void dictionary_returnsAllInstancesOfDictionary_True() {
    Dictionary firstWord = new Dictionary("Example");
    Dictionary secondWord = new Dictionary("Computer");
    assertTrue(Dictionary.getDictionary().contains(firstWord));
    assertTrue(Dictionary.getDictionary().contains(secondWord));
  }
}
