//package demogame;
//
//import javax.swing.JFrame;
//
//public class MainClass {
//
//	public static void main(String[] args) {
//		JFrame f=new JFrame();
//		f.setBounds(10, 10, 700, 600);
//		f.setTitle("Brick Breaker");	
//		f.setSize(700,600);
//		f.setLocationRelativeTo(null);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setVisible(true);
//		f.setResizable(false);
//		
//		GamePlay gamePlay=new GamePlay();
//		f.add(gamePlay);
//	}
//
//}

package demogame;
import javax.swing.JFrame;

public class MainClass {

public static void main(String[] args) {
    JFrame obj = new JFrame();
    GamePlay gameplay = new GamePlay();
    obj.setBounds(10, 10, 700, 600);
    obj.setTitle("Breakout Ball");
    obj.setResizable(false);
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    obj.add(gameplay);
}

}