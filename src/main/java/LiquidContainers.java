
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Containers containers = new Containers(0, 0);
        while (true) {

            System.out.println(containers.toString());
            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int quantity = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                containers.addLiquid(quantity);
                System.out.println("");
            } else if (command.equals("move")) {
                containers.moveLiquid(quantity);
                System.out.println("");
            } else if (command.equals("remove")) {
                containers.removeLiquid(quantity);
                System.out.println("");
            }

        }
    }

}
