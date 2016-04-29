import org.junit.*;
import static org.junit.Assert.*;

public class DictionaryTest {
  @After
  public void tearDown() {
    Dictionary.clear();

  }
  @Test
  public void dictionary_instantiatesCorrectly_true() {
    Dictionary testDictionary = new Dictionary("Example");
    assertEquals(true, testDictionary instanceof Dictionary);
  }
  @Test
  public void getWord_returnsNewWordName_Word() {
    Dictionary testDictionary = new Dictionary("Example");
    assertEquals("Example", testDictionary.getWord());
  }
  @Test
  public void getDictionary_returnsAllInstancesOfDictionary_True() {
    Dictionary firstWord = new Dictionary("Example");
    Dictionary secondWord = new Dictionary("Computer");
    assertTrue(Dictionary.getDictionary().contains(firstWord));
    assertTrue(Dictionary.getDictionary().contains(secondWord));
  }
  @Test
  public void clear_emptiesAllDictionaryWords_0() {
    Dictionary testDictionary = new Dictionary("Example");
    Dictionary.clear();
    assertEquals(Dictionary.getDictionary().size(), 0);
  }
  @Test
  public void getId_dictionaryWordsInstantiatesWithAnId_1() {
    Dictionary testDictionary = new Dictionary("Example");
    assertEquals(1, testDictionary.getId());
  }
  @Test
  public void find_returnsDictionaryWordWithSameId_secondWord() {
    Dictionary firstWord = new Dictionary("Example");
    Dictionary secondWord = new Dictionary("Computer");
    assertEquals(Dictionary.find(secondWord.getId()), secondWord);
  }
}
