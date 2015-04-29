package com.aod6060.math;

import java.util.Random;

public class Mat3f {
	public static final int SIZE = 3;
	
	private float[] m;
	
	private Mat3f() {
		m = new float[Mat3f.SIZE * Mat3f.SIZE];
	}
	
	public void set(int c, int r, float value) {
		m[r * Mat3f.SIZE + c] = value;
	}
	
	public float get(int c, int r) {
		return m[r * Mat3f.SIZE + c];
	}
	
	public static Mat3f zero() {
		Mat3f temp = new Mat3f();
		
		temp.set(0, 0, 0);
		temp.set(1, 0, 0);
		temp.set(2, 0, 0);
		
		temp.set(0, 1, 0);
		temp.set(1, 1, 0);
		temp.set(2, 1, 0);
		
		temp.set(0, 2, 0);
		temp.set(1, 2, 0);
		temp.set(2, 2, 0);
		
		
		return temp;
	}

	public static Mat3f identity() {
		Mat3f temp = new Mat3f();

		temp.set(0, 0, 1);
		temp.set(1, 0, 0);
		temp.set(2, 0, 0);
		
		temp.set(0, 1, 0);
		temp.set(1, 1, 1);
		temp.set(2, 1, 0);
		
		temp.set(0, 2, 0);
		temp.set(1, 2, 0);
		temp.set(2, 2, 1);
		
		return temp;
	}

	public static Mat3f random(int i) {
		Mat3f temp = new Mat3f();
		Random rand = new Random();
		
		/*
		temp.set(0, 0, rand.nextInt(i));
		temp.set(1, 0, rand.nextInt(i));
		temp.set(0, 1, rand.nextInt(i));
		temp.set(1, 1, rand.nextInt(i));
		*/
		
		temp.set(0, 0, rand.nextInt(i));
		temp.set(1, 0, rand.nextInt(i));
		temp.set(2, 0, rand.nextInt(i));
		
		temp.set(0, 1, rand.nextInt(i));
		temp.set(1, 1, rand.nextInt(i));
		temp.set(2, 1, rand.nextInt(i));
		
		temp.set(0, 2, rand.nextInt(i));
		temp.set(1, 2, rand.nextInt(i));
		temp.set(2, 2, rand.nextInt(i));
		
		return temp;
	}

	public static Mat3f create(
			float m00, float m10, float m20,
			float m01, float m11, float m21,
			float m02, float m12, float m22) {
		Mat3f temp = new Mat3f();
		
		temp.set(0, 0, m00);
		temp.set(1, 0, m10);
		temp.set(2, 0, m20);
		
		temp.set(0, 1, m01);
		temp.set(1, 1, m11);
		temp.set(2, 1, m21);
		
		temp.set(0, 2, m02);
		temp.set(1, 2, m12);
		temp.set(2, 2, m22);
		
		return temp;
	}
	
	@Override
	public String toString() {
		String str = "Mat3f\n";
		
		
		for(int r = 0; r < Mat3f.SIZE; r++) {
			str = str + "|";
			for(int c = 0; c < Mat3f.SIZE; c++) {
				str = str + this.get(c, r) + " ";
			}
			str = str + "|\n";
		}
		
		return str;
	}
	
	
	
}
