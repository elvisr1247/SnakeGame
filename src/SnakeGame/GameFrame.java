package SnakeGame;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
GameFrame(){
//same as the bottom one
//  GamePanel panel = new GamePanel();
//	this.add(panel);
	
	
	this.add(new GamePanel(null));
	this.setTitle("Snake");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.pack();
	this.setVisible(true);
	//makes the screen appear in the middle of the computer
	this.setLocationRelativeTo(null);
	
}
	
}
