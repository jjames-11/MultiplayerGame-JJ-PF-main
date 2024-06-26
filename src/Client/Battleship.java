package Client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Battleship extends JPanel implements KeyListener{

    String gameState = "waiting"; // waiting, playing, game over
    boolean playerInitiated = false; // tracks if we already set up the player for this game

    int W_HEIGHT = 500, W_WIDTH = 500, SQUARE_W = 50, SQUARE_H = 50, REPAINT_RATE = 100;
    boolean gameOver, player1Turn;

    ArrayList<ship> Player1Ships = new ArrayList<ship>();    
    ArrayList<ship> Player2Ships = new ArrayList<ship>();    

    // grid that creates the format of the game's background
    // int[][] grid = {{0,0,3,4,0,0,0,0,0,0,0,0}, 
    //                 {0,1,1,1,1,1,1,1,1,1,1,0}, 
    //                 {0,1,1,1,1,1,1,1,1,1,1,0}, 
    //                 {0,1,1,1,1,1,1,1,1,1,1,0}, 
    //                 {0,1,1,1,1,1,1,1,1,1,1,0},
    //                 {0,1,1,1,1,1,1,1,1,1,1,0},
    //                 {0,1,1,1,1,1,1,1,1,1,1,0},
    //                 {0,1,1,1,1,1,1,1,1,1,1,0},
    //                 {0,1,1,1,1,1,1,1,1,1,1,0},
    //                 {0,1,1,1,1,1,1,1,1,1,1,0},
    //                 {0,1,1,1,1,1,1,1,1,1,1,0},
    //                 {0,0,0,0,0,0,0,0,0,0,0,0}};

    square [][]grid = new square[10][10];


    public Battleship(){
        // JFrame frame = new JFrame("FitzJames Battleship!");
        // frame.setSize(W_WIDTH, W_HEIGHT);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.add(this);

        this.setPreferredSize(new Dimension(W_WIDTH,W_HEIGHT));
        // where ever we set up the board, after we make all the squares of the board grid
        // when ever the player places a ship, add the squares of the ship: whichever square the person clicks is the first square, 
        // then all of the other squares in one direction to make up the full size
        // basically, we add the squares of the grid to the list of squares in the ship object (ship_name.Squares.add(the grid square))

        int x = 0;
        int y = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = new square(x, y);
                x += SQUARE_W;
            }
            y += SQUARE_H;
        }
        // sets up key listener
		this.addKeyListener(this);

        run();
    }

    public void run() {
        while (true) {
			if (gameOver == false) {
				// s.move();
                // s.checkCollisions(appleCol, appleRow, trashCol, trashRow);
                // checkCollisions();
			}
			try {
				Thread.sleep(REPAINT_RATE);
			} catch (InterruptedException e) {
			}
            repaint();
        }
    }


    public void drawGame(Graphics g){
        // iterates through the 2D array
        // for (int row = 0; row < grid.length; row++) {
        //     for (int col = 0; col < grid[0].length; col++) {
        //         // draws the border
        //         if (grid[row][col] == 0) {
        //             g.setColor(Color.BLACK);
        //             g.fillRect(col*SQUARE_W, row*SQUARE_H, SQUARE_W, SQUARE_H);
        //         }
        //         // draws the blue squares
        //         else if (grid[row][col] == 1) {
        //             g.setColor(new Color(45, 134, 216));
        //             g.fillRect(col*SQUARE_W, row*SQUARE_H, SQUARE_W, SQUARE_H);
        //             // adds a dark grey border
        //             g.setColor(Color.DARK_GRAY);
        //             g.drawLine(col*SQUARE_W, row*SQUARE_H, col*SQUARE_W+ SQUARE_W, row*SQUARE_H+SQUARE_H);
        //         }
        //     }
        // }

    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,this.getWidth(), this.getHeight());

        
        switch (gameState) {
            case "waiting":
                // g.setColor(Color.BLACK);
                // g.fillRect(0,0,this.getWidth(), this.getHeight());
                g.setColor(Color.WHITE);
                g.drawString("waiting for server", 300, 300);
                break;
            case "playing":
                drawGame(g);
                break;
            case "Game Over":
                break;

            default:
                g.drawString("something went wrong... :/", 300, 300);
                break;
        }
    }
// 
    public void keyPressed(KeyEvent e) {
        // to access and modify the instance variables of PONG, we are going to call this method from game class:
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_DOWN:
                
                break;
            case KeyEvent.VK_UP:
                
                break;
            case KeyEvent.VK_LEFT:
                
                break;
            case KeyEvent.VK_RIGHT:
                
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        // we must implement all three, Pressed, Released, Typed, but for this use case we don't need all of them
        // we can leave this one blank
        int keyCode = e.getKeyCode();
        System.out.println(keyCode);

        switch (keyCode) {
            case KeyEvent.VK_DOWN:
                
                break;
            case KeyEvent.VK_UP:
                
                break;
            case KeyEvent.VK_LEFT:
                
                break;
            case KeyEvent.VK_RIGHT:
                
                break;
        }
    }

    public void keyTyped(KeyEvent e) {
        // we must implement all three, Pressed, Released, Typed, but for this use case we don't need all of them
        // we can leave this one blank
    }
}
