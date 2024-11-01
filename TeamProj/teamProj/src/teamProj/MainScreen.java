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
                    // 게임 시작 로직 추가
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
        // 게임 규칙 추가
    }

    private void selectPlayer() {
        System.out.println("=== Select Player ===");
        System.out.print("Enter the number (1-4): ");
        int playerNum = scanner.nextInt();
        
        // 이미 선택된 숫자 or 1 ~ 4 사이의 숫자가 아닐 때 다시 시도
        if (playerNum >= 1 && playerNum <= 4) {
            System.out.println("Player " + playerNum + " selected.");
            // 플레이어 선택 로직 추가
        } else {
            System.out.println("Invalid player number. Please enter between 1 and 4.");
        }
    }
}
