package com.aod6060.math;


/**
 * The Vec2f class represents a 2D vector.
 * @author Fred
 *
 */
public class Vec2f {
	private float x;
	private float y;
	
	/**
	 * This is the default constructor for Vec2f. It just 
	 * sets the components to zero
	 */
	public Vec2f() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * This is the main constructor you should use. It sets the values
	 * to whatever value you specify to x and y component.
	 * @param float x
	 * @param float y
	 */
	public Vec2f(float x, float y) {
		this.x = x;
		this.y = y;
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
	 * @param y
	 */
	public void setY(float y) {
		this.y = y;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "Vec2f ["+x+", "+y+"]";
	}
	
	
}
