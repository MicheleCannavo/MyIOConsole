
import util.console.Console;
import util.console.Input;
import util.console.Output;

public class App {

  public static void main(String[] args) {
    Console.clrscr();
    Output.printIsPresent("df");
    var e = Input.readLine("uno");
    Console.clrscr();
    Input.readLine("due --"+e);

  }
}