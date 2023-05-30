package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import entity.Player;
import tile.TileManager;
import object.*;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	//Screen Settings
	final int orignalTileSize = 16; //16x16 tile
	final int scale = 3;
	
	public final int tileSize = orignalTileSize * scale; //48x48 tile
	public final int maxScreenCol = 16;
	public final int maxScreenRow = 12;
	public final int screenWidth = tileSize * maxScreenCol; //768 pixels
	public final int screenHeight = tileSize * maxScreenRow; // 576 pixels
	
	//WORLD SETTINGS
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;

	
	//System
	TileManager tileM = new TileManager(this);
	KeyHandler keyH = new KeyHandler();
	Sound se = new Sound();
	Sound music = new Sound();
	public CollisionChecker cChecker= new CollisionChecker(this);
	public AssetSetter aSetter = new AssetSetter(this);
	public UI ui = new UI(this);
	Thread gameThread;
	//Entity AND Object
	public Player player =new Player(this,keyH);
	public SuperObject obj[] = new SuperObject[10];// amount of objects
	
	//Set player's default position
	int playerX= 100;
	int playerY = 100;
	int playerSpeed = 4;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
	}
	
	public void setupGame() {
		aSetter.setObject();
		
		playMusic(0);
	}
	

	public void startGameThread() {
		
		gameThread = new Thread(this);
		gameThread.start();// automatically call run();
	}

	@Override
	public void run() {
		double FPS = 60.0;
		double drawInterval = 1000000000/FPS;
		double nextDrawTime = System.nanoTime() + drawInterval;
		
		while(gameThread != null) {
		
		// 1 UPDATE: update information such as character position
			update();
		// 2 DRAW: draw the screen with updated info
			repaint();
			
			try {
				double remainingTime = nextDrawTime - System.nanoTime();
				remainingTime = remainingTime/100000;
				if(remainingTime<0) {
					remainingTime = 0;
				}
				
				Thread.sleep((long) remainingTime);
				
				nextDrawTime += drawInterval;
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			}
		
		}
			
	
	public void update() {
		player.update();
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		//Tile
		tileM.draw(g2);// draw tiles first then players
		
		//Object
		for(int i = 0; i<obj.length; i++) {
			if(obj[i] !=null) {
				obj[i].draw(g2, this);
			}
		}
		
		//Player
		player.draw(g2);
		
		//UI
		ui.draw(g2);
		g2.dispose();
	}
	public void playMusic(int i) {
		music.setFile(i);
		music.play();
		music.loop();
	}
	public void stopMusic() {
		se.stop();
	}
	public void playSE(int i) {
		se.setFile(i);
		se.play();
	}

}
