import java.util.ArrayList;
import java.time.LocalDateTime;

public class Definition {
  private String mDefinition;
  private boolean mCompleted;
  private LocalDateTime mCreatedAt;
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private int mId;

  public Definition(String definition) {
    mDefinition = definition;
    mCompleted = false;
    mCreatedAt = LocalDateTime.now();
    instances.add(this);
    mId = instances.size();
  }

  public String getDefinition() {
    return mDefinition;
  }
  public boolean isCompleted() {
    return mCompleted;
  }
  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }
  public static ArrayList<Definition> all() {
    return instances;
  }
  public static void clear() {
    instances.clear();
  }
  public int getId() {
    return mId;
  }
  public static Definition find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
