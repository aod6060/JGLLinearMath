package com.aod6060.math;


/**
 * This class contains all of the transformation 
 * that OpenGL has and much much more.
 * @author Fred
 *
 */
public final class Transforms {
	
	/*
	 * Model and View Transformations
	 */
	
	/**
	 * This method implements the functionality of 
	 * glTranslate method
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glTranslate.xml
	 * 
	 * @param float x
	 * @param float y
	 * @param float z
	 * @return Mat4f
	 */
	public static Mat4f translate(float x, float y, float z) {
		Mat4f temp = Mat4f.identity();
		
		temp.set(0, 3, x);
		temp.set(1, 3, y);
		temp.set(2, 3, z);
		
		return temp;
	}
	
	/**
	 * This method implements the functionality of 
	 * glTranslate method but allows the use of a 
	 * Vec3f instead of 3 scalars
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glTranslate.xml
	 * 
	 * @param Vec3f v
	 * @return Mat4f
	 */
	public static Mat4f translate(Vec3f v) {
		return translate(v.getX(), v.getY(), v.getZ());
	}
	
	/**
	 * This method implements the functionality of
	 * glScale method.
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glScale.xml
	 * 
	 * @param float x
	 * @param float y
	 * @param float z
	 * @return Mat4f
	 */
	public static Mat4f scale(float x, float y, float z) {
		Mat4f temp = Mat4f.identity();
		
		temp.set(0, 0, x);
		temp.set(1, 1, y);
		temp.set(2, 2, z);
		
		return temp;
	}
	
	/**
	 * This method implements the functionality of
	 * glScale method. The only difference is that 
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glScale.xml
	 * 
	 * @param Vec3f v
	 * @return Mat4f
	 */
	public static Mat4f scale(Vec3f v) {
		return scale(v.getX(), v.getY(), v.getZ());
	}
	
	/**
	 * This method implements the functionality of
	 * glRotate method. The only difference is that 
	 * the angle is in radiuns not degrees. To convert
	 * them just use the convient method I have in the
	 * Util class.
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glRotate.xml
	 * 
	 * @param float angle - Its in radians
	 * @param float x
	 * @param float y
	 * @param float z
	 * @return
	 */
	public static Mat4f rotate(float angle, float _x, float _y, float _z) {
		// This is one complicated function
		Mat4f temp = Mat4f.identity();
		Vec3f v = new Vec3f(_x, _y, _z);
		float c = (float) Math.cos(angle);
		float s = (float) Math.sin(angle);
		
		if(LinearMath.length(v) != 1.0f) {
			v = LinearMath.unit(v);
		}
		
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		temp.set(0, 0, x*x*(1-c)+c);
		
		temp.set(1, 0, y*x*(1-c) + z*s);
		
		temp.set(2, 0, x*z*(1-c) - y*s);
		
		temp.set(0, 1, x*y*(1-c) - z*s);
		
		temp.set(1, 1, y*y*(1-c)+c);
		
		temp.set(2, 1, y*z*(1-c) + x*s);
		
		temp.set(0, 2, x*z*(1-c) + y*s);
		
		temp.set(1, 2, y*z*(1-c) + x*s);
		
		temp.set(2, 2, z*z*(1-c)+c);
		
		return temp;
	}
	
	/*
	 * Projection Transformations
	 */
	
	/**
	 * This method implements the functionality of
	 * glOrtho.
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glOrtho.xml
	 * @param float left
	 * @param float right
	 * @param float bottom
	 * @param float top
	 * @param float nearVal
	 * @param float farVal
	 * @return Mat4f
	 */
	public static Mat4f ortho(float left, float right, float bottom, float top, float nearVal, float farVal) { 
		Mat4f temp = Mat4f.identity();
		
		float tx = -((right+left) / (right - left));
		float ty = -((top+bottom) / (top - bottom));
		float tz = - ((farVal + nearVal) / (farVal-nearVal));
		
		temp.set(0, 0, 2 / (right - left));
		temp.set(1, 1, 2 / (top - bottom));
		temp.set(2, 2, -2/(farVal - nearVal));
		temp.set(0, 3, tx);
		temp.set(1, 3, ty);
		temp.set(2, 3, tz);
		
		return temp;
	}
	
	/**
	 * This method implements the functionality of
	 * gluOrtho
	 * https://www.opengl.org/sdk/docs/man2/xhtml/gluOrtho2D.xml
	 * @param float left
	 * @param float right
	 * @param float bottom
	 * @param float top
	 * @return Mat4f
	 */
	public static Mat4f ortho(float left, float right, float bottom, float top) {
		return ortho(left, right, bottom, top, -1.0f, 1.0f);
	}
	
	/**
	 * This method implements the functionality of
	 * glFustrum
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glFrustum.xml
	 * @param float left
	 * @param float right
	 * @param float bottom
	 * @param float top
	 * @param float nearVal
	 * @param float farVal
	 * @return Mat4f
	 */
	public static Mat4f fustrum(float left, float right, float bottom, float top, float nearVal, float farVal) {
		Mat4f temp = Mat4f.identity();
		
		float a = (right + left)/(right-left);
		float b = (top + bottom)/(top - bottom);
		float c = -((farVal+nearVal)/(farVal-nearVal));
		float d = -((2*farVal*nearVal) / (farVal - nearVal));
		
		temp.set(0, 0, (2*nearVal)/(right-left));
		temp.set(1, 1, (2*nearVal)/(top-bottom));
		temp.set(3, 3, 0);
		
		temp.set(0, 2, a);
		temp.set(1, 2, b);
		temp.set(2, 2, c);
		temp.set(3, 2, -1);
		temp.set(2, 3, d);
		
		return temp;
	}
	
	/**
	 * This method implements the functionality of
	 * gluPerspective
	 * @param float fov
	 * @param float aspect
	 * @param float zNear
	 * @param float zFar
	 * @return Mat4f
	 */
	public static Mat4f perspective(float fov, float aspect, float zNear, float zFar) {
		Mat4f temp = Mat4f.identity();
		
		float f = (float) (1.0f/Math.tan(fov/2));
		
		temp.set(0, 0, f / aspect);
		temp.set(1, 1, f);
		temp.set(2, 2, (zFar+zNear)/(zNear-zFar));
		temp.set(2, 3, (2*zFar*zNear)/(zNear-zFar));
		temp.set(3, 2, -1);
		temp.set(3, 3, 0);
		return temp;
	}
}
