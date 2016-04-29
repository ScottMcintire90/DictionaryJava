import java.util.ArrayList;
import java.time.LocalDateTime;

public class Word {
  private String mDefinition;
  private boolean mCompleted;
  private LocalDateTime mCreatedAt;

  public Word(String definition) {
    mDefinition = definition;
    mCompleted = false;
    mCreatedAt = LocalDateTime.now();
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
}
