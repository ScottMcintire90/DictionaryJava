import org.junit.*;
import static org.junit.Assert.*;

public class DictionaryTest {
  @After
  public void tearDown() {
    Dictionary.clear();

  }
  @Test
  public void dictionary_instantiatesCorrectly_true() {
    Dictionary testDictionary = new Dictionary();
    assertEquals(true, testDictionary instance of Dictionary);
  }
}
