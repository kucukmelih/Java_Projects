package game;

public class Launcher {
	public static void main(String[] args) {

		Game game1 = new Game("Tetris-1");
		Game game2 = new Game("Tetris-2");

		Thread thread1 = new Thread(game1);
		Thread thread2 = new Thread(game2);

		thread1.start();
		thread2.start();

	}
}
