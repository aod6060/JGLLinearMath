package com.aod6060.math;

import java.nio.FloatBuffer;

/**
 * This is a simple Utility class. This is were 
 * stuff that doesn't make since to place it 
 * goes here
 * @author Fred
 *
 */
public final class Util {
	
	/**
	 * Float version of PI from java Math library
	 */
	public static final float PI = 3.1415f;
	
	/**
	 * This is the reciprocal value of 180 degree
	 */
	public static final float RECIPROCAL_180 = 1.0f / 180.0f;
	
	/**
	 * This is the reciprocal value of PI
	 */
	public static final float RECIPROCAL_PI = 1.0f / Util.PI;
	
	
	/**
	 * This is the float version of Java Math toRadian 
	 * function
	 * @param float degree
	 * @return float 
	 */
	public static float toRadian(float degree) {
		return degree * (Util.PI * Util.RECIPROCAL_180);
	}
	
	/**
	 * This is the float version of Java Math toDegree 
	 * function.
	 * @param radian
	 * @return
	 */
	public static float toDegree(float radian) {
		return radian * (180.0f * Util.RECIPROCAL_PI);
	}
	
	
	/**
	 * This returns a FloatBuffer representation of 
	 * a 2x2 array
	 * @param Mat2f f
	 * @return FlotBuffer
	 */
	public static FloatBuffer toFloatBuffer(Mat2f f) {
		return f.toBuffer();
	}
	
	/**
	 * This returns a FloatBuffer representation of 
	 * a 3x3 array
	 * @param Mat2f f
	 * @return FlotBuffer
	 */
	public static FloatBuffer toFloatBuffer(Mat3f f) {
		return f.toBuffer();
	}
	
	/**
	 * This returns a FloatBuffer representation of 
	 * a 4x4 array
	 * @param Mat2f f
	 * @return FlotBuffer
	 */
	public static FloatBuffer toFloatBuffer(Mat4f f) {
		return f.toBuffer();
	}
}
