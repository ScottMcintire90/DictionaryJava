import java.time.LocalDateTime;
import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("example definition");
    assertEquals(true, testDefinition instanceof Definition);
  }
  @Test
  public void word_instantiatesWithDefinition_String() {
    Definition testDefinition = new Definition("example definition");
    assertEquals("example definition", testDefinition.getDefinition());
  }
  @Test
  public void isCompleted_isFalseAfterInstantiation_false() {
    Definition testDefinition = new Definition("example definition");
    assertEquals(false, testDefinition.isCompleted());
  }
  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    Definition testDefinition = new Definition("example definition");
    assertEquals(LocalDateTime.now().getDayOfWeek(), testDefinition.getCreatedAt().getDayOfWeek());
  }
  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("example definition");
    Definition secondDefinition = new Definition("example definition two");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }
  @Test
  public void clear_emptiesAllDefinitionDefinitionsFromArrayList_0() {
    Definition testDefinition = new Definition("example definition");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }
  @Test
  public void getId_wordDefinitionsInstantiatesWithAnId_1() {
    Definition.clear();
    Definition testDefinition = new Definition("example definition");
    assertEquals(1, testDefinition.getId());
  }
  @Test
  public void find_returnsDefinitionDefinitionsWithSameId_secondDefinition() {
    Definition firstDefinition = new Definition("example definition");
    Definition secondDefinition = new Definition("example definition two");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  }
  @Test
  public void find_returnsNullWhenNoDefinitionDefinitionFound_null() {
    assertTrue(Definition.find(999) == null);
  }
}
