package com.aod6060.math;

import java.util.Random;

/**
 * This class represents a 2x2 matrix
 * @author Fred
 *
 */
public class Mat2f {
	public static final int SIZE = 2;
	
	private float[] m;
	
	private Mat2f() {
		m = new float[Mat2f.SIZE * Mat2f.SIZE];
	}
	
	public void set(int c, int r, float value) {
		m[r * Mat2f.SIZE + c] = value;
	}
	
	public float get(int c, int r) {
		return m[r * Mat2f.SIZE + c];
	}
	
	public static Mat2f zero() {
		Mat2f temp = new Mat2f();
		
		temp.set(0, 0, 0);
		temp.set(1, 0, 0);
		temp.set(0, 1, 0);
		temp.set(1, 1, 0);
		
		return temp;
	}

	public static Mat2f identity() {
		Mat2f temp = new Mat2f();
		
		temp.set(0, 0, 1);
		temp.set(1, 0, 0);
		temp.set(0, 1, 0);
		temp.set(1, 1, 1);
		
		return temp;
	}

	public static Mat2f random(int i) {
		Mat2f temp = new Mat2f();
		Random rand = new Random();
		
		temp.set(0, 0, rand.nextInt(i));
		temp.set(1, 0, rand.nextInt(i));
		temp.set(0, 1, rand.nextInt(i));
		temp.set(1, 1, rand.nextInt(i));
		
		return temp;
	}

	public static Mat2f create(float m00, float m10, float m01, float m11) {
		Mat2f temp = new Mat2f();
		
		temp.set(0, 0, m00);
		temp.set(1, 0, m10);
		temp.set(0, 1, m01);
		temp.set(1, 1, m11);
		
		return temp;
	}
	
	@Override
	public String toString() {
		String str = "Mat2f\n";
		
		
		for(int r = 0; r < Mat2f.SIZE; r++) {
			str = str + "|";
			for(int c = 0; c < Mat2f.SIZE; c++) {
				str = str + this.get(c, r) + " ";
			}
			str = str + "|\n";
		}
		
		return str;
	}
	
	
	
}
