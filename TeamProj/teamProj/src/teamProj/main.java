package teamProj;

public class main {

	public static void main(String[] args) {
        MainScreen mainScreen = new MainScreen();
        
        // 게임 진행
        
        new EndScreen(mainScreen);
    }
}
