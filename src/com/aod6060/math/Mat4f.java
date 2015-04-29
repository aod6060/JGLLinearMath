package com.aod6060.math;

import java.util.Random;

public class Mat4f {
	public static final int SIZE = 4;
	
	private float[] m;
	
	private Mat4f() {
		m = new float[Mat4f.SIZE * Mat4f.SIZE];
	}
	
	public void set(int c, int r, float value) {
		m[r * Mat4f.SIZE + c] = value;
	}
	
	public float get(int c, int r) {
		return m[r * Mat4f.SIZE + c];
	}
	
	public static Mat4f zero() {
		Mat4f temp = new Mat4f();
		
		temp.set(0, 0, 0);
		temp.set(1, 0, 0);
		temp.set(2, 0, 0);
		temp.set(3, 0, 0);
		
		temp.set(0, 1, 0);
		temp.set(1, 1, 0);
		temp.set(2, 1, 0);
		temp.set(3, 2, 0);
		
		temp.set(0, 2, 0);
		temp.set(1, 2, 0);
		temp.set(2, 2, 0);
		temp.set(3, 2, 0);
		
		temp.set(0, 3, 0);
		temp.set(1, 3, 0);
		temp.set(2, 3, 0);
		temp.set(3, 3, 0);
		
		return temp;
	}

	public static Mat4f identity() {
		Mat4f temp = new Mat4f();
		
		temp.set(0, 0, 1);
		temp.set(1, 0, 0);
		temp.set(2, 0, 0);
		temp.set(3, 0, 0);
		
		temp.set(0, 1, 0);
		temp.set(1, 1, 1);
		temp.set(2, 1, 0);
		temp.set(3, 2, 0);
		
		temp.set(0, 2, 0);
		temp.set(1, 2, 0);
		temp.set(2, 2, 1);
		temp.set(3, 2, 0);
		
		temp.set(0, 3, 0);
		temp.set(1, 3, 0);
		temp.set(2, 3, 0);
		temp.set(3, 3, 1);
		
		return temp;
	}

	public static Mat4f random(int i) {
		Mat4f temp = new Mat4f();
		Random rand = new Random();
		
		temp.set(0, 0, rand.nextInt(i));
		temp.set(1, 0, rand.nextInt(i));
		temp.set(2, 0, rand.nextInt(i));
		temp.set(3, 0, rand.nextInt(i));
		
		temp.set(0, 1, rand.nextInt(i));
		temp.set(1, 1, rand.nextInt(i));
		temp.set(2, 1, rand.nextInt(i));
		temp.set(3, 2, rand.nextInt(i));
		
		temp.set(0, 2, rand.nextInt(i));
		temp.set(1, 2, rand.nextInt(i));
		temp.set(2, 2, rand.nextInt(i));
		temp.set(3, 2, rand.nextInt(i));
		
		temp.set(0, 3, rand.nextInt(i));
		temp.set(1, 3, rand.nextInt(i));
		temp.set(2, 3, rand.nextInt(i));
		temp.set(3, 3, rand.nextInt(i));
		
		return temp;
	}
	
	public static Mat4f create(
			float m00, float m10, float m20, float m30,
			float m01, float m11, float m21, float m31,
			float m02, float m12, float m22, float m32,
			float m03, float m13, float m23, float m33) {
		Mat4f temp = new Mat4f();
		
		temp.set(0, 0, m00);
		temp.set(1, 0, m10);
		temp.set(2, 0, m20);
		temp.set(3, 0, m30);
		
		temp.set(0, 1, m01);
		temp.set(1, 1, m11);
		temp.set(2, 1, m21);
		temp.set(3, 2, m31);
		
		temp.set(0, 2, m02);
		temp.set(1, 2, m12);
		temp.set(2, 2, m22);
		temp.set(3, 2, m32);
		
		temp.set(0, 3, m03);
		temp.set(1, 3, m13);
		temp.set(2, 3, m23);
		temp.set(3, 3, m33);
		
		return temp;
	}
	
	@Override
	public String toString() {
		String str = "Mat4f\n";
		
		
		for(int r = 0; r < Mat4f.SIZE; r++) {
			str = str + "|";
			for(int c = 0; c < Mat4f.SIZE; c++) {
				str = str + this.get(c, r) + " ";
			}
			str = str + "|\n";
		}
		
		return str;
	}
	
	
}
