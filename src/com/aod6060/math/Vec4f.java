package com.aod6060.math;

/**
 * The Vec4f class represents a 4D vector.
 * @author Fred
 *
 */
public class Vec4f {
	private float x;
	private float y;
	private float z;
	private float w;
	
	/**
	 * This is the default constructor for Vec4f. It just 
	 * sets the components to zero
	 */
	public Vec4f() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.w = 0;
	}
	
	/**
	 * This is the main constructor you should use. It sets the values
	 * to whatever value you specify to x and y component.
	 * @param float x
	 * @param float y
	 * @param float z
	 * @param float w
	 */
	public Vec4f(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * This returns the x component
	 * @return float
	 */
	public float getX() {
		return x;
	}
	
	/**
	 * This sets the x component
	 * @param float x
	 */
	public void setX(float x) {
		this.x = x;
	}
	
	/**
	 * This returns the y component
	 * @return float
	 */
	public float getY() {
		return y;
	}
	
	/**
	 * This sets the y component
	 * @param float
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * This returns the z component
	 * @return float
	 */
	public float getZ() {
		return z;
	}
	
	/**
	 * This sets the z component
	 * @param float z
	 */
	public void setZ(float z) {
		this.z = z;
	}
	
	/**
	 * This returns the w component
	 * @return float w
	 */
	public float getW() {
		return w;
	}

	/**
	 * This sets the w component
	 * @param float w
	 */
	public void setW(float w) {
		this.w = w;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "Vec4f ["+x+", "+y+", "+z+", "+w+"]";
	}
	
	
}
