package teamProj;

import java.util.Scanner;

public class EndScreen {
    private int[] votes = new int[4];
    private Scanner scanner;
    private MainScreen mainScreen;

    public EndScreen(Scanner scanner, MainScreen mainScreen) {
        this.scanner = scanner;
        this.mainScreen = mainScreen;
    }

    public void displayEndScreen() {
        System.out.println("=== Game Over ===");
        System.out.println("Time to vote for the best player!");

        // 투표 기능
        for (int i = 0; i < 4; i++) {
            System.out.print("Vote for the best player (1-4): ");
            int vote = scanner.nextInt();
            if (vote >= 1 && vote <= 4) {
                votes[vote - 1]++;
            } else {
                System.out.println("Invalid player number. Please vote between 1 and 4.");
                i--; // 유효하지 않은 투표 시 다시 투표
            }
        }

        showResults();
        returnToMainMenu();
    }

    private void showResults() {
        System.out.println("=== Voting Results ===");
        for (int i = 0; i < votes.length; i++) {
            System.out.println("Player " + (i + 1) + " received " + votes[i] + " votes.");
        }

        int maxVotes = 0;
        int bestPlayer = -1;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                bestPlayer = i + 1;
            }
        }

        if (bestPlayer != -1) {
            System.out.println("Player " + bestPlayer + " is the best player!");
        } else {
            System.out.println("No votes were cast.");
        }

        // 투표 결과 초기화
        votes = new int[4];
    }

    private void returnToMainMenu() {
        System.out.println("Returning to Main Menu...");
        mainScreen = new MainScreen();  // MainScreen의 메인 메뉴로 돌아가기
    }
}