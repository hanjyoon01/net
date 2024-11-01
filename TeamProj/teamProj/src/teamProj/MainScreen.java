package teamProj;

import java.util.Scanner;

public class MainScreen {
    private boolean isRunning = true;
    private Scanner scanner = new Scanner(System.in);

    public MainScreen() {
        startMenu();
    }

    private void startMenu() {
        while (isRunning) {
            System.out.println("=== Main Menu ===");
            System.out.println("1. View Game Rules");
            System.out.println("2. Select Players");
            System.out.println("3. Start Game");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showGameRules();
                    break;
                case 2:
                    selectPlayer();
                    break;
                case 3:
                    System.out.println("Starting the game...");
                    // ���� ���� ���� �߰�
                    break;
                case 4:
                    System.out.println("Exiting the game. Goodbye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private void showGameRules() {
        System.out.println("=== Game Rules ===");
        System.out.println("Here are the rules of the game...");
        // ���� ��Ģ �߰�
    }

    private void selectPlayer() {
        System.out.println("=== Select Player ===");
        System.out.print("Enter the number (1-4): ");
        int playerNum = scanner.nextInt();
        
        // �̹� ���õ� ���� or 1 ~ 4 ������ ���ڰ� �ƴ� �� �ٽ� �õ�
        if (playerNum >= 1 && playerNum <= 4) {
            System.out.println("Player " + playerNum + " selected.");
            // �÷��̾� ���� ���� �߰�
        } else {
            System.out.println("Invalid player number. Please enter between 1 and 4.");
        }
    }
}
