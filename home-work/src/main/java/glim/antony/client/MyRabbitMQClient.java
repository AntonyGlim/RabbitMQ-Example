package glim.antony.client;

import java.util.Scanner;

public class MyRabbitMQClient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название канала...");
        String chanelName = scanner.nextLine();
        while (true){
            String msg = scanner.nextLine();
            if (msg.equals("exit") || msg.equals("quit")) break;
            if (msg.startsWith("/chch ")){
                chanelName = msg.split(" ", 2)[1];
                //change chanel
            }
            //sending messages
        }
        scanner.close();
    }

}
