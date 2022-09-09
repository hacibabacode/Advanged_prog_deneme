package final_adv;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.io.*;
import java.lang.Math;

public class Final extends JFrame{
	private int [][] pixels;
	private int width, height;
	private OriginalImage OriginalImage;
	private GrayImage GrayImage;
	private BinaryImage BinaryImage;
	private XEdgeImage XEdgeImage;
	private YEdgeImage YEdgeImage;
	private XYEdgeImage XYEdgeImage;
	private BufferedImage image;
	
	Final(){
		readImage();
		JTabbedPane jtp = new JTabbedPane();
		jtp.setBounds(0, 0, 586, 463);
		OriginalImage = new OriginalImage();
		jtp.add("Original Image", OriginalImage);
				
		GrayImage = new GrayImage();
		jtp.add("Gray Image.", GrayImage);
		
		BinaryImage = new BinaryImage();
		jtp.add("Binary Image.", BinaryImage);
		
		XEdgeImage = new XEdgeImage();
		jtp.add("XEdgeImage", XEdgeImage);
		
		YEdgeImage = new YEdgeImage();
		jtp.add("YEdgeImage", YEdgeImage);
		
		XYEdgeImage = new XYEdgeImage();
		getContentPane().setLayout(null);
		jtp.add("XYEdgeImage", XYEdgeImage);
		
		getContentPane().add(jtp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,500);
		this.setVisible(true);
	}
	private void readImage() {
		//assume that you read the image pixels here
		width = 500;
		height = 400;
		pixels = new int[width][height];
		Random random = new Random();
		//instead of reading the actual image file I mimic it
		//by randomly generating the pixles. Of course, you will
		//read the file.
	      for(int row = 0; row < height; row++)
			for(int col = 0; col < width; col++)
				pixels[col][row] = random.nextInt(256);
	     
	      
	     		
	}
	class OriginalImage extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this); 
			
			
			for(int row = 0; row < height; row++)
				for(int col = 0; col < width; col++) {
					g.setColor(new Color(pixels[col][row], pixels[col][row], pixels[col][row]));
					g.drawRect(col, row, 1, 1);}
			
		}
	}
	class GrayImage extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("This is the seconasdasdasdas", 10, 200);
		}
	}
	class BinaryImage extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("This is the second Tab", 10, 200);
		}
	}
	class XEdgeImage extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("This is the second Tab", 10, 200);
		}
	}
	class YEdgeImage extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("This is the second Tab", 10, 200);
		}
	}
	class XYEdgeImage extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("This is the second Tab", 10, 200);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Final();		

		int[][] tBtI = {{255,0,0},{255,255,0},{255,255,255}};
		int[][] xdir = {{-1,0,1},{-2,0,2},{-1,0,1}};
		int[][] ydir = {{-1,-2,-1},{0,0,0},{1,2,1}};
		
		int Gx = xdir[0][0]*tBtI[0][0]+xdir[1][0]*tBtI[1][0]+xdir[2][0]*tBtI[2][0]+
				xdir[0][2]*tBtI[0][2]+xdir[1][2]*tBtI[1][2]+xdir[2][2]*tBtI[2][2];
		
		int Gy = ydir[0][0]*tBtI[0][0]+ydir[0][1]*tBtI[0][1]+ydir[0][2]*tBtI[0][2]+
				xdir[2][0]*tBtI[2][0]+xdir[2][1]*tBtI[2][1]+xdir[2][2]*tBtI[2][2];
		System.out.println("Gx:  "+Gx);
		System.out.println("Gy:  "+Gy);
		
		System.out.println("magnitude:" +Math.sqrt(Gx*Gx+Gy*Gy));
		System.out.println("gradident:" +Math.toDegrees(Math.atan(-Gy/Gx)));


		}
	
		}
