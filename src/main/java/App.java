import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.console.Console;
import util.console.Output;

public class App {
  private static final Logger LOGGER  =
    LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    Console.clrscr();
    Output.printIsPresent("df");

  }
}