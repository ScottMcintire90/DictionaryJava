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
}
