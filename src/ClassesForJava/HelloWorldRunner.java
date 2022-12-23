package ClassesForJava;

public class HelloWorldRunner {
  public static void main(String[] args) {
    HelloWorld goodbye = new HelloWorld("Goodbye World");
    System.out.println(goodbye.getMessage());
    goodbye.setMessage("aloha");
    System.out.println(goodbye.getMessage());
  }
}
