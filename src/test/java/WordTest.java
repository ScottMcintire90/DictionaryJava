import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {
  @After
  public void tearDown() {
    Word.clear();

  }
  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWord = new Word("Example");
    assertEquals(true, testWord instanceof Word);
  }
  @Test
  public void getWord_returnsNewWordName_Word() {
    Word testWord = new Word("Example");
    assertEquals("Example", testWord.getWord());
  }
  @Test
  public void getWord_returnsAllInstancesOfWord_True() {
    Word firstWord = new Word("Example");
    Word secondWord = new Word("Computer");
    assertTrue(Word.getWords().contains(firstWord));
    assertTrue(Word.getWords().contains(secondWord));
  }
  @Test
  public void clear_emptiesAllWordWords_0() {
    Word testWord = new Word("Example");
    Word.clear();
    assertEquals(Word.getWords().size(), 0);
  }
  // @Test
  // public void getId_wordInstantiatesWithAnId_1() {
  //   Word testWord = new Word("Example");
  //   assertEquals(1, testWord.getId());
  // }
  @Test
  public void find_returnsWordWithSameId_secondWord() {
    Word firstWord = new Word("Example");
    Word secondWord = new Word("Computer");
    assertEquals(Word.find(secondWord.getId()), secondWord);
  }
  @Test
  public void find_returnsNullWhenWordNotFound_Null() {
    assertTrue(Word.find(999) == null);
  }
  @Test
  public void getWords_initiallyReturnsEmptyList_ArrayList() {
    Word testWord = new Word("Example");
    assertEquals(0, testWord.getDefinitions().size());
  }
  @Test
  public void addDefinition_addsDefinitionToList_true() {
    Word testWord = new Word("Example");
    Definition testDefinition = new Definition("Example definition.");
    testWord.addDefinition(testDefinition);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
  }
}
