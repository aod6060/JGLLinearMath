package com.aod6060.math;

import java.util.Random;

/**
 * This class represents a 3x3 matrix
 * @author Fred
 *
 */
public class Mat3f {
	public static final int SIZE = 3;
	
	private float[] m;

	/**
	 * This is private because I want user to use the other
	 * matrix creation methods.
	 */

	private Mat3f() {
		m = new float[Mat3f.SIZE * Mat3f.SIZE];
	}
	/**
	 * This sets a value of a given 3x3 Matrix given 
	 * the column and row
	 * @param int c
	 * @param int r
	 * @param float value
	 */
	public void set(int c, int r, float value) {
		m[r * Mat3f.SIZE + c] = value;
	}
	/**
	 * This returns a value of a given 3x3 Matrix given 
	 * the column and row
	 * @param int c
	 * @param int r
	 * @return float
	 */
	public float get(int c, int r) {
		return m[r * Mat3f.SIZE + c];
	}
	/**
	 * This creates a 3x3 Zero Matrix
	 * @return Mat3f
	 */
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
	/**
	 * This creates a 3x3 Identity Matrix
	 * @return Mat3f
	 */
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
	/**
	 * This creates a 3x3 Random Matrix
	 * @param int i
	 * @return Mat3f
	 */
	public static Mat3f random(int i) {
		Mat3f temp = new Mat3f();
		Random rand = new Random();
		
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
	/**
	 * This creates a 3x3 Matrix from 
	 * given set of values.
	 * @param float m00
	 * @param float m10
	 * @param float m20
	 * @param float m01
	 * @param float m11
	 * @param float m21
	 * @param float m02
	 * @param float m12
	 * @param float m22
	 * @return Mat3f
	 */
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
