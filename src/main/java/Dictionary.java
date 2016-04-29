import java.util.ArrayList;

public class Dictionary {
  private String mWord;
  private static ArrayList<Dictionary> dictionaryArray = new ArrayList<Dictionary>();
  private int mId;
  private ArrayList<Word> mWordDefinition;

  public Dictionary(String word) {
    mWord = word;
    dictionaryArray.add(this);
    mId = dictionaryArray.size();
    mWordDefinition = new ArrayList<Word>();
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
  public static Dictionary find(int id) {
    try {
      return dictionaryArray.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
    public ArrayList<Word> getWords() {
      return mWordDefinition;
  }
  public void addWord(Word definition) {
    mWordDefinition.add(definition);
  }
}
