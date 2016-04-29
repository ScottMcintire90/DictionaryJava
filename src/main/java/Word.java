import java.util.ArrayList;

public class Word {
  private String mWord;
  private static ArrayList<Word> wordArray = new ArrayList<Word>();
  private int mId;
  private ArrayList<Word> mWordDefinition;

  public Word(String word) {
    mWord = word;
    wordArray.add(this);
    mId = wordArray.size();
    mWordDefinition = new ArrayList<Word>();
  }
  public String getWord() {
    return mWord;
  }
  public static ArrayList<Word> getWords() {
    return wordArray;
  }
  public static void clear() {
    wordArray.clear();
  }
  public int getId() {
    return mId;
  }
  public static Word find(int id) {
    try {
      return wordArray.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
    public ArrayList<Word> getDefinitions() {
      return mWordDefinition;
  }
  public void addWord(Word definition) {
    mWordDefinition.add(definition);
  }
}
