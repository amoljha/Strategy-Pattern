package strategy;

@SuppressWarnings("serial")
public class InvalidSizeException extends Exception {
  
  public InvalidSizeException(int size) {
    System.out.printf("Invalid size: %d passed in!\n", size);
  }
}
