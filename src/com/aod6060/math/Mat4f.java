package com.aod6060.math;

import java.nio.FloatBuffer;
import java.util.Random;

import org.lwjgl.BufferUtils;

/**
 * This class represents a 4x4 matrix
 * @author Fred
 *
 */
public class Mat4f {
	public static final int SIZE = 4;
	
	private float[] m;
	
	/**
	 * This is private because I want user to use the other
	 * matrix creation methods.
	 */
	private Mat4f() {
		m = new float[Mat4f.SIZE * Mat4f.SIZE];
	}
	/**
	 * This sets a value of a given 4x4 Matrix given 
	 * the column and row
	 * @param int c
	 * @param int r
	 * @param float value
	 */
	public void set(int c, int r, float value) {
		m[r * Mat4f.SIZE + c] = value;
	}
	/**
	 * This returns a value of a given 4x4 Matrix given 
	 * the column and row
	 * @param int c
	 * @param int r
	 * @return float
	 */
	public float get(int c, int r) {
		return m[r * Mat4f.SIZE + c];
	}
	/**
	 * This creates a 4x4 Zero Matrix
	 * @return Mat4f
	 */
	public static Mat4f zero() {
		Mat4f temp = new Mat4f();
		
		temp.set(0, 0, 0);
		temp.set(1, 0, 0);
		temp.set(2, 0, 0);
		temp.set(3, 0, 0);
		
		temp.set(0, 1, 0);
		temp.set(1, 1, 0);
		temp.set(2, 1, 0);
		temp.set(3, 1, 0);
		
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
	/**
	 * This creates a 4x4 Identity Matrix
	 * @return Mat4f
	 */
	public static Mat4f identity() {
		Mat4f temp = new Mat4f();
		
		temp.set(0, 0, 1);
		temp.set(1, 0, 0);
		temp.set(2, 0, 0);
		temp.set(3, 0, 0);
		
		temp.set(0, 1, 0);
		temp.set(1, 1, 1);
		temp.set(2, 1, 0);
		temp.set(3, 1, 0);
		
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
	/**
	 * This creates a 4x4 Random Matrix
	 * @return Mat4f
	 */
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
		temp.set(3, 1, rand.nextInt(i));
		
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
	
	/**
	 * This creates a 4x4 Matrix from 
	 * given set of values.
	 * @param float m00
	 * @param float m10
	 * @param float m20
	 * @param float m30
	 * @param float m01
	 * @param float m11
	 * @param float m21
	 * @param float m31
	 * @param float m02
	 * @param float m12
	 * @param float m22
	 * @param float m32
	 * @param float m03
	 * @param float m13
	 * @param float m23
	 * @param float m33
	 * @return Mat4f
	 */
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
		temp.set(3, 1, m31);
		
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
	
	/**
	 * This returns a floatbuffer for Mat4f
	 * @return FloatBuffer
	 */
	public FloatBuffer toBuffer() {
		FloatBuffer temp = BufferUtils.createFloatBuffer(Mat4f.SIZE * Mat4f.SIZE);
		temp.put(m);
		temp.rewind();
		return temp;
	}
	
}
