
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            String[] part = input.split(" ");
            String command = part[0];
            int value = Integer.valueOf(part[1]);
            if (input.equals("quit")) {
                break;
            } 
            if (command.equals("add")) {
                first.add(value);
            }
            if (command.equals("move")) {
                if( value > first.contains()){
                    value = first.contains();
                }
                second.add(value);
                first.remove(value);
            }
            if (command.equals("remove")) {
                second.remove(value);
            }
        }
    }

}
