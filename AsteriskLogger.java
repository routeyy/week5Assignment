package week5;

public class AsteriskLogger implements Logger {

  @Override
  public void Log(String str) {
    System.out.println("***" + str + "***");
    
  }

  @Override
  public void Error(String str) {
    String asterisksHolder = "***Error: " + str + "***";
    String asterisks = "";
    for (int i = 0; i < asterisksHolder.length(); i++) {
      asterisks += "*";
    }
    System.out.println(asterisks + "\n***Error: " + str + "***" + "\n" + asterisks);
    
  }

}
