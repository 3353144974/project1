package operation.As7._02;

public interface AA {
  public abstract void showA();
  private void show10(String str){
      for (int i = 0; i < 10; i++) {
          System.out.print(str+"    ");
      }
      System.out.println();
  }
  public default void showB(){
      show10("BBBB");
  }
  public default void showC(){
      show10("CCCC");
  }
}
