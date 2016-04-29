import java.util.ArrayList;

public class Dictionary {
  private String mWord;
  private static ArrayList<Dictionary> dictionaryArray = new ArrayList<Dictionary>();
  private int mId;

  public Dictionary(String word) {
    mWord = word;
    dictionaryArray.add(this);
    mId = dictionaryArray.size();
  }
  public String getWord() {
    return mWord;
  }
  public static ArrayList<Dictionary> getDictionary() {
    return dictionaryArray;
  }
  public static void clear() {
    dictionaryArray.clear();
  }
  public int getId() {
    return mId;
  }

}
