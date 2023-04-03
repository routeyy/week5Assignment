package week5;

public class SpacedLogger implements Logger {

  @Override
  public void Log(String str) {
    String spacedStr = "";
    for (int i = 0; i < str.length(); i++) {
      spacedStr += str.charAt(i);
      if (i != str.length() - 1) {
        spacedStr += " ";
      }
    }
    System.out.println(spacedStr);
  }

  @Override
  public void Error(String str) {
    String spacedStr = "";
    for (int i = 0; i < str.length(); i++) {
      spacedStr += str.charAt(i);
      if (i != str.length() - 1) {
        spacedStr += " ";
      }
    }
    System.out.println("ERROR: " + spacedStr);
  }
  
}
