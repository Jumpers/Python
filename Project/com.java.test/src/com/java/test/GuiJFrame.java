package com.java.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiJFrame {
	public static JButton button;
	public String note = "click me.";
	public int count = 0;

	// public static JFrame frame;

	public static void main(String[] args) {
		GuiJFrame gui = new GuiJFrame();
		// gui.go();
		JFrame frame = new JFrame();
		MyDrawPanel mDrawPanel = new MyDrawPanel();
		Graphics mGraphics = new Graphics() {

			@Override
			public void translate(int x, int y) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setXORMode(Color c1) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setPaintMode() {
				// TODO Auto-generated method stub

			}

			@Override
			public void setFont(Font font) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setColor(Color c) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setClip(int x, int y, int width, int height) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setClip(Shape clip) {
				// TODO Auto-generated method stub

			}

			@Override
			public FontMetrics getFontMetrics(Font f) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Font getFont() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Color getColor() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Rectangle getClipBounds() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Shape getClip() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void fillRoundRect(int x, int y, int width, int height,
					int arcWidth, int arcHeight) {
				// TODO Auto-generated method stub

			}

			@Override
			public void fillRect(int x, int y, int width, int height) {
				// TODO Auto-generated method stub

			}

			@Override
			public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
				// TODO Auto-generated method stub

			}

			@Override
			public void fillOval(int x, int y, int width, int height) {
				// TODO Auto-generated method stub

			}

			@Override
			public void fillArc(int x, int y, int width, int height,
					int startAngle, int arcAngle) {
				// TODO Auto-generated method stub

			}

			@Override
			public void drawString(AttributedCharacterIterator iterator, int x,
					int y) {
				// TODO Auto-generated method stub

			}

			@Override
			public void drawString(String str, int x, int y) {
				// TODO Auto-generated method stub

			}

			@Override
			public void drawRoundRect(int x, int y, int width, int height,
					int arcWidth, int arcHeight) {
				// TODO Auto-generated method stub

			}

			@Override
			public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
				// TODO Auto-generated method stub

			}

			@Override
			public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
				// TODO Auto-generated method stub

			}

			@Override
			public void drawOval(int x, int y, int width, int height) {
				// TODO Auto-generated method stub

			}

			@Override
			public void drawLine(int x1, int y1, int x2, int y2) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean drawImage(Image img, int dx1, int dy1, int dx2,
					int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor,
					ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean drawImage(Image img, int dx1, int dy1, int dx2,
					int dy2, int sx1, int sy1, int sx2, int sy2,
					ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean drawImage(Image img, int x, int y, int width,
					int height, Color bgcolor, ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean drawImage(Image img, int x, int y, int width,
					int height, ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean drawImage(Image img, int x, int y, Color bgcolor,
					ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean drawImage(Image img, int x, int y,
					ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void drawArc(int x, int y, int width, int height,
					int startAngle, int arcAngle) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public Graphics create() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void copyArea(int x, int y, int width, int height, int dx,
					int dy) {
				// TODO Auto-generated method stub

			}

			@Override
			public void clipRect(int x, int y, int width, int height) {
				// TODO Auto-generated method stub

			}

			@Override
			public void clearRect(int x, int y, int width, int height) {
				// TODO Auto-generated method stub

			}
		};
		mDrawPanel.paintComponent(mGraphics);

		frame.add(mDrawPanel);
		// 显示出来
		frame.setSize(300, 300);
		frame.setVisible(true);
		// 添加radio button

	}
	/*
	 * public void go() { // 创建frame JFrame frame = new JFrame();
	 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * 
	 * // 创建widget button = new JButton(note); // 把widget添加到frame上。
	 * frame.getContentPane().add(button);
	 * 
	 * // 显示出来 frame.setSize(300, 300); frame.setVisible(true); //添加radio button
	 */

	/*
	 * button.addActionListener(new ActionListener() {
	 * 
	 * @Override public void actionPerformed(ActionEvent arg0) { // TODO
	 * Auto-generated method stub count++; if(count%2==0){
	 * button.setText("click me."); System.out.print(arg0.toString()); }else {
	 * button.setText("你他妈点击了我呀！"); System.out.print(arg0.toString()); } } });
	 */

}

class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(20, 50, 100, 100);
	}
}
