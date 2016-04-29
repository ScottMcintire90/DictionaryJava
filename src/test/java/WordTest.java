import java.time.LocalDateTime;
import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testDefinition = new Word("example definition");
    assertEquals(true, testDefinition instanceof Word);
  }
  @Test
  public void word_instantiatesWithDefinition_String() {
    Word testDefinition = new Word("example definition");
    assertEquals("example definition", testDefinition.getDefinition());
  }
  @Test
  public void isCompleted_isFalseAfterInstantiation_false() {
    Word testDefinition = new Word("example definition");
    assertEquals(false, testDefinition.isCompleted());
  }
  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    Word testDefinition = new Word("example definition");
    assertEquals(LocalDateTime.now().getDayOfWeek(), testDefinition.getCreatedAt().getDayOfWeek());
  }
  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstDefinition = new Word("example definition");
    Word secondDefinition = new Word("example definition two");
    assertTrue(Word.all().contains(firstDefinition));
    assertTrue(Word.all().contains(secondDefinition));
  }
  @Test
  public void clear_emptiesAllWordDefinitionsFromArrayList_0() {
    Word testDefinition = new Word("example definition");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }
  @Test
  public void getId_wordDefinitionsInstantiatesWithAnId_1() {
    Word.clear();
    Word testDefinition = new Word("example definition");
    assertEquals(1, testDefinition.getId());
  }
  @Test
  public void find_returnsWordDefinitionsWithSameId_secondDefinition() {
    Word firstDefinition = new Word("example definition");
    Word secondDefinition = new Word("example definition two");
    assertEquals(Word.find(secondDefinition.getId()), secondDefinition);
  }
}
