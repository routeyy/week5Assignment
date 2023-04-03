package week5;

public class App {

  public static void main(String[] args) {
    
    String testStr = "Kumusta";
    
    Logger asteriskLogger = new AsteriskLogger();
    Logger spacedLogger = new SpacedLogger();
    
    asteriskLogger.Log(testStr);
    asteriskLogger.Error(testStr);
    spacedLogger.Log(testStr);
    spacedLogger.Error(testStr);
    
  }

}
