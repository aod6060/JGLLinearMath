package com.aod6060.math;

import java.nio.FloatBuffer;
import java.util.Random;

import org.lwjgl.BufferUtils;

/**
 * This class represents a 2x2 matrix
 * @author Fred
 *
 */
public class Mat2f {
	// The size of the square matrix
	public static final int SIZE = 2;
	
	private float[] m;
	
	/**
	 * This is private because I want user to use the other
	 * matrix creation methods.
	 */
	private Mat2f() {
		m = new float[Mat2f.SIZE * Mat2f.SIZE];
	}
	/**
	 * This sets a value of a given 2x2 Matrix given 
	 * the column and row
	 * @param int c
	 * @param int r
	 * @param float value
	 */
	public void set(int c, int r, float value) {
		m[r * Mat2f.SIZE + c] = value;
	}
	/**
	 * This returns a value of a given 2x2 Matrix given 
	 * the column and row
	 * @param int c
	 * @param int r
	 * @return float
	 */
	public float get(int c, int r) {
		return m[r * Mat2f.SIZE + c];
	}
	/**
	 * This creates a 2x2 Zero Matrix
	 * @return Mat2f
	 */
	public static Mat2f zero() {
		Mat2f temp = new Mat2f();
		
		temp.set(0, 0, 0);
		temp.set(1, 0, 0);
		temp.set(0, 1, 0);
		temp.set(1, 1, 0);
		
		return temp;
	}
	/**
	 * This creates a 2x2 Identity Matrix
	 * @return Mat2f
	 */
	public static Mat2f identity() {
		Mat2f temp = new Mat2f();
		
		temp.set(0, 0, 1);
		temp.set(1, 0, 0);
		temp.set(0, 1, 0);
		temp.set(1, 1, 1);
		
		return temp;
	}
	/**
	 * This creates a 2x2 Random Matrix
	 * @param int i
	 * @return Mat2f
	 */
	public static Mat2f random(int i) {
		Mat2f temp = new Mat2f();
		Random rand = new Random();
		
		temp.set(0, 0, rand.nextInt(i));
		temp.set(1, 0, rand.nextInt(i));
		temp.set(0, 1, rand.nextInt(i));
		temp.set(1, 1, rand.nextInt(i));
		
		return temp;
	}
	/**
	 * This creates a 2x2 Matrix from 
	 * given set of values.
	 * @param float m00
	 * @param float m10
	 * @param float m01
	 * @param float m11
	 * @return
	 */
	public static Mat2f create(
			float m00, float m10, 
			float m01, float m11) {
		
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
	
	/**
	 * This returns a floatbuffer for Mat2f
	 * @return FloatBuffer
	 */
	public FloatBuffer toBuffer() {
		/*
		FloatBuffer temp = FloatBuffer.wrap(this.m);
		
		temp.flip();
		*/
		FloatBuffer temp = BufferUtils.createFloatBuffer(Mat2f.SIZE * Mat2f.SIZE);
		temp.put(m);
		temp.rewind();
		return temp;
	}
}
