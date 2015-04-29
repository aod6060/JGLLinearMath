package com.aod6060.math;

import java.util.Random;

/**
 * This class contains all of the methods to do operation
 * on linear components such as vectors, matrices, and 
 * quaternion. For now its going to have just operation
 * for vectors and vector. 
 * @author Fred
 *
 */
public final class LinearMath {
	
	/*
	 * Vec2f
	 */
	/**
	 * This adds two 2D Vector together
	 * @param Vec2f a
	 * @param Vec2f b
	 * @return Vec2f
	 */
	public static Vec2f add(Vec2f a, Vec2f b) {
		return new Vec2f(a.getX() + b.getX(), a.getY() + b.getY());
	}
	/**
	 * This subtracts two 2D Vector together
	 * @param Vec2f a
	 * @param Vec2f b
	 * @return Vec2f
	 */
	public static Vec2f sub(Vec2f a, Vec2f b) {
		return new Vec2f(a.getX() - b.getX(), a.getY() - b.getY());
	}
	/**
	 * This multiplies a vec2f with a float
	 * @param Vec2f a
	 * @param float f
	 * @return
	 */
	public static Vec2f mul(Vec2f a, float f) {
		return new Vec2f(a.getX() * f, a.getY() * f);
	}
	/**
	 * This divides a vec2f with a float
	 * @param a
	 * @param f
	 * @return
	 */
	public static Vec2f div(Vec2f a, float f) {
		// TODO Auto-generated method stub
		return new Vec2f(a.getX() / f, a.getY() / f);
	}
	/**
	 * This returns the length or magnetism of a 2D vector
	 * @param Vec2f a
	 * @return float
	 */
	public static float length(Vec2f a) {
		// TODO Auto-generated method stub
		return (float) Math.sqrt(a.getX()*a.getX() + a.getY()*a.getY());
	}
	/**
	 * This returns the length^2 of a 2D vector
	 * @param Vec2f a
	 * @return float
	 */
	public static float length2(Vec2f a) {
		// TODO Auto-generated method stub
		return a.getX()*a.getX() + a.getY()*a.getY();
	}
	/**
	 * This computes a unit from a Vec2f
	 * @param Vec2f a
	 * @return Vec2f
	 */
	public static Vec2f unit(Vec2f a) {
		// TODO Auto-generated method stub
		float len = length(a);
		return div(a, len);
	}
	/**
	 * This performs the dot product (inner product) between two 2D vectors
	 * @param Vec2f a
	 * @param Vec2f b
	 * @return float
	 */
	public static float dot(Vec2f a, Vec2f b) {
		// TODO Auto-generated method stub
		return a.getX() * b.getX() + a.getY() * a.getY();
	}
	/**
	 * This computes the angle between two 2D vectors
	 * @param Vec2f a
	 * @param Vec2f b
	 * @return float
	 */
	public static float angle(Vec2f a, Vec2f b) {
		// TODO Auto-generated method stub
		float adotb = dot(a, b);
		float la = length(a);
		float lb = length(b);
		return (float) Math.acos(adotb / (la * lb));
	}
	/**
	 * This negates a Vec2f
	 * @param Vec2f a
	 * @return Vec2f
	 */
	public static Vec2f negate(Vec2f a) {
		// TODO Auto-generated method stub
		return new Vec2f(-a.getX(), -a.getY());
	}
	
	/*
	 * Vec3f
	 */
	/**
	 * c = a + b
	 * @param Vec3f a
	 * @param Vec3f b
	 * @return Vec3f
	 */
	public static Vec3f add(Vec3f a, Vec3f b) {
		// TODO Auto-generated method stub
		return new Vec3f(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
	}
	/**
	 * c = a - b
	 * @param Vec3f a
	 * @param Vec3f b
	 * @return Vec3f
	 */
	public static Vec3f sub(Vec3f a, Vec3f b) {
		// TODO Auto-generated method stub
		return new Vec3f(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
	}
	/**
	 * c = a * f
	 * @param Vec3f a
	 * @param float f
	 * @return Vec3f
	 */
	public static Vec3f mul(Vec3f a, float f) {
		// TODO Auto-generated method stub
		return new Vec3f(a.getX() * f, a.getY() * f, a.getZ() * f);
	}
	/**
	 * c = a / f
	 * @param Vec3f a
	 * @param float f
	 * @return Vec3f
	 */
	public static Vec3f div(Vec3f a, float f) {
		// TODO Auto-generated method stub
		return new Vec3f(a.getX() / f, a.getY() / f, a.getZ() / f);
	}
	/**
	 * This returns the length or magnetism of a 3D vector
	 * @param Vec3f a
	 * @return float
	 */
	public static float length(Vec3f a) {
		// TODO Auto-generated method stub
		return (float) Math.sqrt(a.getX()*a.getX() + a.getY()*a.getY() + a.getZ()*a.getZ());
	}
	/**
	 * This returns the length^2 of a 3D vector
	 * @param Vec3f a
	 * @return float
	 */
	public static float length2(Vec3f a) {
		// TODO Auto-generated method stub
		return a.getX()*a.getX() + a.getY()*a.getY() + a.getZ()*a.getZ();
	}
	/**
	 * This computes a unit from a Vec3f
	 * @param Vec3f a
	 * @return Vec3f
	 */
	public static Vec3f unit(Vec3f a) {
		// TODO Auto-generated method stub
		float len = length(a);
		return div(a, len);
	}
	/**
	 * This performs the dot product (inner product) between two 3D vectors
	 * @param Vec3f a
	 * @param Vec3f b
	 * @return float
	 */
	public static float dot(Vec3f a, Vec3f b) {
		// TODO Auto-generated method stub
		return a.getX()*b.getX() + a.getY()*b.getY() + a.getZ()*b.getZ();
	}
	/**
	 * This computes the angle between two 3D vectors
	 * @param Vec3f a
	 * @param Vec3f b
	 * @return float
	 */
	public static float angle(Vec3f a, Vec3f b) {
		// TODO Auto-generated method stub
		float adotb = dot(a, b);
		float la = length(a);
		float lb = length(b);
		return (float) Math.acos(adotb / (la * lb));
	}
	/**
	 * This computes the cross product of two 3D vectors
	 * @param Vec3f a
	 * @param Vec3f b
	 * @return Vec3f 
	 */
	public static Vec3f cross(Vec3f a, Vec3f b) {
		// TODO Auto-generated method stub
		return new Vec3f(
				a.getY() * b.getZ() - a.getZ() * b.getY(),
				a.getZ() * b.getX() - a.getX() * b.getZ(),
				a.getX() * b.getY() - a.getY() * b.getX());
	}
	/**
	 * This negates a Vec3f
	 * @param Vec3f a
	 * @return Vec3f
	 */
	public static Vec3f negate(Vec3f a) {
		// TODO Auto-generated method stub
		return new Vec3f(-a.getX(), -a.getY(), -a.getZ());
	}
	/*
	 * Vec4f
	 */
	/**
	 * c = a + b
	 * @param Vec4f a
	 * @param Vec4f b
	 * @return Vec4f
	 */
	public static Vec4f add(Vec4f a, Vec4f b) {
		// TODO Auto-generated method stub
		return new Vec4f(
				a.getX() + b.getX(),
				a.getY() + b.getY(),
				a.getZ() + b.getZ(),
				a.getW() + b.getW());
	}
	/**
	 * c = a - b
	 * @param Vec4f a
	 * @param Vec4f b
	 * @return Vec4f
	 */
	public static Vec4f sub(Vec4f a, Vec4f b) {
		// TODO Auto-generated method stub
		return new Vec4f(
				a.getX() - b.getX(),
				a.getY() - b.getY(),
				a.getZ() - b.getZ(),
				a.getW() - b.getW());
	}
	/**
	 * c = a * f
	 * @param Vec4f a
	 * @param float b
	 * @return Vec4f
	 */
	public static Vec4f mul(Vec4f a, float f) {
		// TODO Auto-generated method stub
		return new Vec4f(
				a.getX() * f,
				a.getY() * f,
				a.getZ() * f,
				a.getW() * f);
	}
	/**
	 * c = a / f
	 * @param Vec4f a
	 * @param float f
	 * @return Vec4f
	 */
	public static Vec4f div(Vec4f a, float f) {
		// TODO Auto-generated method stub
		return new Vec4f(
				a.getX() / f,
				a.getY() / f,
				a.getZ() / f,
				a.getW() / f);
	}
	/**
	 * This returns the length or magnetism of a 4D vector
	 * @param Vec4f a
	 * @return float
	 */
	public static float length(Vec4f a) {
		// TODO Auto-generated method stub
		return (float) Math.sqrt(a.getX()*a.getX() + a.getY()*a.getY() + a.getZ()*a.getZ() + a.getW()*a.getW());
	}
	/**
	 * This returns the length^2 of a 4D vector
	 * @param Vec4f a
	 * @return float
	 */
	public static float length2(Vec4f a) {
		// TODO Auto-generated method stub
		return a.getX()*a.getX() + a.getY()*a.getY() + a.getZ()*a.getZ() + a.getW()*a.getW();
	}
	/**
	 * This computes a unit from a Vec4f
	 * @param Vec4f a
	 * @return Vec4f
	 */
	public static Vec4f unit(Vec4f a) {
		// TODO Auto-generated method stub
		float len = length(a);
		return div(a, len);
	}
	/**
	 * This performs the dot product (inner product) between two 4D vectors
	 * @param Vec4f a
	 * @param Vec4f b
	 * @return float
	 */
	public static float dot(Vec4f a, Vec4f b) {
		// TODO Auto-generated method stub
		return a.getX()*b.getX() + a.getY()*b.getY() + a.getZ()*b.getZ() + a.getW()*b.getW();
	}
	/**
	 * This computes the angle between two 4D vectors
	 * @param Vec4f a
	 * @param Vec4f b
	 * @return float
	 */
	public static float angle(Vec4f a, Vec4f b) {
		// TODO Auto-generated method stub
		float adotb = dot(a, b);
		float la = length(a);
		float lb = length(b);
		return (float) Math.acos(adotb / (la * lb));
	}
	/**
	 * This negates a Vec4f
	 * @param Vec4f a
	 * @return Vec4f
	 */
	public static Vec4f negate(Vec4f a) {
		// TODO Auto-generated method stub
		return new Vec4f(-a.getX(), -a.getY(), -a.getZ(), -a.getW());
	}
	
	/*
	 * These are the random vector methods
	 */
	/**
	 * This generates a random Vec2f
	 * @param int
	 * @return Vec2f
	 */
	public static Vec2f randomVec2f(int i) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return new Vec2f(rand.nextInt(i), rand.nextInt(i));
	}
	/**
	 * This generates a random Vec3f
	 * @param int
	 * @return Vec3f
	 */
	public static Vec3f randomVec3f(int i) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return new Vec3f(rand.nextInt(i), rand.nextInt(i), rand.nextInt(i));
	}
	/**
	 * This generates a random Vec4f
	 * @param int
	 * @return Vec4f
	 */
	public static Vec4f randomVec4f(int i) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return new Vec4f(rand.nextInt(i), rand.nextInt(i), rand.nextInt(i), rand.nextInt(i));
	}
	
	/*
	 * Mat2f Functions 
	 */
	/**
	 * c = a + b
	 * @param Mat2f a
	 * @param Mat2f b
	 * @return Mat2f 
	 */
	public static Mat2f add(Mat2f a, Mat2f b) {
		// TODO Auto-generated method stub
		
		Mat2f temp = Mat2f.zero();
		
		temp.set(0, 0, a.get(0, 0) + b.get(0, 0));
		temp.set(1, 0, a.get(1, 0) + b.get(1, 0));
		temp.set(0, 1, a.get(0, 1) + b.get(0, 1));
		temp.set(1, 1, a.get(1, 1) + b.get(1, 1));
		
		return temp;
	}
	/**
	 * c = a - b
	 * @param Mat2f a
	 * @param Mat2f b
	 * @return Mat2f 
	 */
	public static Mat2f sub(Mat2f a, Mat2f b) {
		// TODO Auto-generated method stub
		
		Mat2f temp = Mat2f.zero();
		
		temp.set(0, 0, a.get(0, 0) - b.get(0, 0));
		temp.set(1, 0, a.get(1, 0) - b.get(1, 0));
		temp.set(0, 1, a.get(0, 1) - b.get(0, 1));
		temp.set(1, 1, a.get(1, 1) - b.get(1, 1));
		
		return temp;
	}
	/**
	 * c = a * f
	 * @param Mat2f a
	 * @param float f
	 * @return Mat2f 
	 */
	public static Mat2f mul(Mat2f a, float f) {
		// TODO Auto-generated method stub
		
		Mat2f temp = Mat2f.zero();
		
		temp.set(0, 0, a.get(0, 0) * f);
		temp.set(1, 0, a.get(1, 0) * f);
		temp.set(0, 1, a.get(0, 1) * f);
		temp.set(1, 1, a.get(1, 1) * f);
		
		return temp;
	}
	/**
	 * c = a * v2
	 * @param Mat2f a
	 * @param Vec2f v2
	 * @return Vec2f
	 */
	public static Vec2f mul(Mat2f a, Vec2f v) {
		Vec2f temp = new Vec2f();
		
		temp.setX(a.get(0, 0) * v.getX() + a.get(1, 0) * v.getY());
		temp.setY(a.get(0, 1) * v.getX() + a.get(1, 1) * v.getY());
		
		return temp;
	}
	/**
	 * c = a * b
	 * @param Mat2f a
	 * @param Mat2f b
	 * @return Mat2f
	 */
	public static Mat2f mul(Mat2f a, Mat2f b) {
		Mat2f temp = Mat2f.zero();
		
		temp.set(0, 0, a.get(0, 0) * b.get(0, 0) + a.get(1, 0) * b.get(0,  1));
		temp.set(1, 0, a.get(0, 0) * b.get(1, 0) + a.get(1, 0) * b.get(1,  1));
		
		temp.set(0, 1, a.get(0, 1) * b.get(0, 0) + a.get(1, 1) * b.get(0,  1));
		temp.set(1, 1, a.get(0, 1) * b.get(1, 0) + a.get(1, 1) * b.get(1,  1));
		
		return temp;
	}
	/**
	 * This computes a transpose matrix
	 * of a Mat2f
	 * @param Mat2f a
	 * @return Mat2f
	 */
	public static Mat2f transpose(Mat2f a) {
		Mat2f temp = Mat2f.zero();
		
		temp.set(0, 0, a.get(0, 0));
		temp.set(1, 0, a.get(0, 1));
		temp.set(0, 1, a.get(1, 0));
		temp.set(1, 1, a.get(1, 1));
		
		return temp;
	}
	/**
	 * This computes the determinant of a 2x2 Matrix
	 * @param Mat2f a
	 * @return float
	 */
	public static float determinant(Mat2f a) {
		// TODO Auto-generated method stub
		return a.get(0, 0) * a.get(1, 1) - a.get(1, 0) * a.get(0, 1);
	}
	/**
	 * This computes a adjoints 2x2 Matrix from another
	 * 2x2 Matrix
	 * @param Mat2f a
	 * @return Mat2f
	 */
	public static Mat2f adjoint(Mat2f a) {
		// TODO Auto-generated method stub
		Mat2f temp = Mat2f.zero();
		
		temp.set(0, 0, a.get(1, 1));
		temp.set(1, 0, -a.get(1, 0));
		temp.set(0, 1, -a.get(0, 1));
		temp.set(1, 1, a.get(0, 0));
		
		return temp;
	}
	/**
	 * This computes the inverse 2x2 Matrix of
	 * another 2x2 Matrix
	 * @param Mat2f a
	 * @return Mat2f
	 */
	public static Mat2f inverse(Mat2f a) {
		// TODO Auto-generated method stub
		float det = determinant(a);
		Mat2f adj = adjoint(a);
		return mul(adj, 1.0f / det);
	}

	/*
	 * Mat3f Functions
	 */
	/**
	 * c = a + b
	 * @param Mat3f a
	 * @param Mat3f b
	 * @return Mat3f 
	 */
	public static Mat3f add(Mat3f a, Mat3f b) {
		// TODO Auto-generated method stub
		Mat3f temp = Mat3f.zero();
		
		temp.set(0, 0, a.get(0, 0) + b.get(0, 0));
		temp.set(1, 0, a.get(1, 0) + b.get(1, 0));
		temp.set(2, 0, a.get(2, 0) + b.get(2, 0));
		
		temp.set(0, 1, a.get(0, 1) + b.get(0, 1));
		temp.set(1, 1, a.get(1, 1) + b.get(1, 1));
		temp.set(2, 1, a.get(2, 1) + b.get(2, 1));
		
		temp.set(0, 2, a.get(0, 2) + b.get(0, 2));
		temp.set(1, 2, a.get(1, 2) + b.get(1, 2));
		temp.set(2, 2, a.get(2, 2) + b.get(2, 2));
		
		
		return temp;
	}
	/**
	 * c = a - b
	 * @param Mat3f a
	 * @param Mat3f b
	 * @return Mat3f 
	 */
	public static Mat3f sub(Mat3f a, Mat3f b) {
		// TODO Auto-generated method stub
		Mat3f temp = Mat3f.zero();
		
		temp.set(0, 0, a.get(0, 0) - b.get(0, 0));
		temp.set(1, 0, a.get(1, 0) - b.get(1, 0));
		temp.set(2, 0, a.get(2, 0) - b.get(2, 0));
		
		temp.set(0, 1, a.get(0, 1) - b.get(0, 1));
		temp.set(1, 1, a.get(1, 1) - b.get(1, 1));
		temp.set(2, 1, a.get(2, 1) - b.get(2, 1));
		
		temp.set(0, 2, a.get(0, 2) - b.get(0, 2));
		temp.set(1, 2, a.get(1, 2) - b.get(1, 2));
		temp.set(2, 2, a.get(2, 2) - b.get(2, 2));
		
		
		return temp;
	}
	/**
	 * c = a * f
	 * @param Mat3f a
	 * @param float f
	 * @return Mat3f 
	 */
	public static Mat3f mul(Mat3f a, float f) {
		// TODO Auto-generated method stub
		Mat3f temp = Mat3f.zero();
		
		temp.set(0, 0, a.get(0, 0) * f);
		temp.set(1, 0, a.get(1, 0) * f);
		temp.set(2, 0, a.get(2, 0) * f);
		
		temp.set(0, 1, a.get(0, 1) * f);
		temp.set(1, 1, a.get(1, 1) * f);
		temp.set(2, 1, a.get(2, 1) * f);
		
		temp.set(0, 2, a.get(0, 2) * f);
		temp.set(1, 2, a.get(1, 2) * f);
		temp.set(2, 2, a.get(2, 2) * f);
		
		
		return temp;
	}
	/**
	 * c = a + v3
	 * @param Mat2f a
	 * @param Vec3f v3
	 * @return Vec3f 
	 */
	public static Vec3f mul(Mat3f a, Vec3f v) {
		// TODO Auto-generated method stub
		Vec3f temp = new Vec3f();
		
		temp.setX(a.get(0, 0) * v.getX() + a.get(1, 0) * v.getY() + a.get(2, 0) * v.getZ());
		temp.setY(a.get(0, 1) * v.getX() + a.get(1, 1) * v.getY() + a.get(2, 1) * v.getZ());
		temp.setZ(a.get(0, 2) * v.getX() + a.get(1, 2) * v.getY() + a.get(2, 2) * v.getZ());
		
		return temp;
	}
	/**
	 * c = a * b
	 * @param Mat3f a
	 * @param Mat3f b
	 * @return Mat3f 
	 */
	public static Mat3f mul(Mat3f a, Mat3f b) {
		// TODO Auto-generated method stub
		Mat3f temp = Mat3f.zero();
		
		temp.set(0, 0, a.get(0, 0) * b.get(0, 0) + a.get(1, 0) * b.get(0, 1) + a.get(2, 0) * b.get(0, 2));
		temp.set(1, 0, a.get(0, 0) * b.get(1, 0) + a.get(1, 0) * b.get(1, 1) + a.get(2, 0) * b.get(1, 2));
		temp.set(2, 0, a.get(0, 0) * b.get(2, 0) + a.get(1, 0) * b.get(2, 1) + a.get(2, 0) * b.get(2, 2));
		
		temp.set(0, 1, a.get(0, 1) * b.get(0, 0) + a.get(1, 1) * b.get(0, 1) + a.get(2, 1) * b.get(0, 2));
		temp.set(1, 1, a.get(0, 1) * b.get(1, 0) + a.get(1, 1) * b.get(1, 1) + a.get(2, 1) * b.get(1, 2));
		temp.set(2, 1, a.get(0, 1) * b.get(2, 0) + a.get(1, 1) * b.get(2, 1) + a.get(2, 1) * b.get(2, 2));
		
		temp.set(0, 2, a.get(0, 2) * b.get(0, 0) + a.get(1, 2) * b.get(0, 1) + a.get(2, 2) * b.get(0, 2));
		temp.set(1, 2, a.get(0, 2) * b.get(1, 0) + a.get(1, 2) * b.get(1, 1) + a.get(2, 2) * b.get(1, 2));
		temp.set(2, 2, a.get(0, 2) * b.get(2, 0) + a.get(1, 2) * b.get(2, 1) + a.get(2, 2) * b.get(2, 2));
		
		
		return temp;
	}
	/**
	 * This computes the determinant of a 3x3 Matrix
	 * @param Mat3f a
	 * @return float
	 */
	public static Mat3f transpose(Mat3f a) {
		// TODO Auto-generated method stub
		Mat3f temp = Mat3f.zero();
		
		temp.set(0, 0, a.get(0, 0));
		temp.set(1, 0, a.get(0, 1));
		temp.set(2, 0, a.get(0, 2));
		
		temp.set(0, 1, a.get(1, 0));
		temp.set(1, 1, a.get(1, 1));
		temp.set(2, 1, a.get(1, 2));
		
		temp.set(0, 2, a.get(2, 0));
		temp.set(1, 2, a.get(2, 1));
		temp.set(2, 2, a.get(2, 2));
		
		
		return temp;
	}
	/**
	 * This computes the determinant of a 3x3 Matrix
	 * @param Mat3f a
	 * @return float
	 */
	public static float determinant(Mat3f a) {
		// TODO Auto-generated method stub
		
		// Positive Values
		float v1 = a.get(0, 0) * a.get(1, 1) * a.get(2, 2);
		float v2 = a.get(1, 0) * a.get(2, 1) * a.get(0, 2);
		float v3 = a.get(2, 0) * a.get(0, 1) * a.get(1, 2);
		// Negative Values
		float nv1 = a.get(0, 0) * a.get(2, 1) * a.get(1, 2);
		float nv2 = a.get(1, 0) * a.get(0, 1) * a.get(2, 2);
		float nv3 = a.get(2, 0) * a.get(1, 1) * a.get(0, 2);
		
		// Calculate det
		float det = v1 + v2 + v3 - nv1 - nv2 - nv3;
		return det;
	}
	/**
	 * This computes a adjoints 3x3 Matrix from another
	 * 3x3 Matrix
	 * @param Mat3f a
	 * @return Mat3f
	 */
	public static Mat3f adjoint(Mat3f a) {
		// TODO Auto-generated method stub
		Mat3f temp = Mat3f.zero();
		
		temp.set(0, 0, determinant(Mat2f.create(a.get(1, 1), a.get(2, 1), a.get(1, 2), a.get(2, 2))));
		temp.set(1, 0, -determinant(Mat2f.create(a.get(0, 1), a.get(2, 1), a.get(0, 2), a.get(2, 2))));
		temp.set(2, 0, determinant(Mat2f.create(a.get(0, 1), a.get(1, 1), a.get(0, 2), a.get(1, 2))));
		
		temp.set(0, 1, -determinant(Mat2f.create(a.get(1, 0), a.get(2, 0), a.get(1, 2), a.get(2, 2))));
		temp.set(1, 1, determinant(Mat2f.create(a.get(0, 0), a.get(2, 0), a.get(0, 2), a.get(2, 2))));
		temp.set(2, 1, -determinant(Mat2f.create(a.get(0, 0), a.get(1, 0), a.get(0, 2), a.get(1, 2))));
		
		temp.set(0, 2, determinant(Mat2f.create(a.get(1, 0), a.get(2, 0), a.get(1, 1), a.get(2, 1))));
		temp.set(1, 2, -determinant(Mat2f.create(a.get(0, 0), a.get(2, 0), a.get(0, 1), a.get(2, 1))));
		temp.set(2, 2, determinant(Mat2f.create(a.get(0, 0), a.get(1, 0), a.get(0, 1), a.get(1, 1))));
		
		return transpose(temp);
	}
	/**
	 * This computes the inverse 3x3 Matrix of
	 * another 3x3 Matrix
	 * @param Mat3f a
	 * @return Mat3f
	 */
	public static Mat3f inverse(Mat3f a) {
		// TODO Auto-generated method stub
		float det = determinant(a);
		Mat3f adj = adjoint(a);
		return mul(adj, 1.0f / det);
	}
	
	/*
	 * Mat4f Functions
	 */
	/**
	 * c = a + b
	 * @param Mat4f a
	 * @param Mat4f b
	 * @return Mat4f 
	 */
	public static Mat4f add(Mat4f a, Mat4f b) {
		Mat4f temp = Mat4f.zero();
		
		temp.set(0, 0, a.get(0, 0) + b.get(0, 0));
		temp.set(1, 0, a.get(1, 0) + b.get(1, 0));
		temp.set(2, 0, a.get(2, 0) + b.get(2, 0));
		temp.set(3, 0, a.get(3, 0) + b.get(3, 0));
		
		temp.set(0, 1, a.get(0, 1) + b.get(0, 1));
		temp.set(1, 1, a.get(1, 1) + b.get(1, 1));
		temp.set(2, 1, a.get(2, 1) + b.get(2, 1));
		temp.set(3, 1, a.get(3, 1) + b.get(3, 1));
		
		temp.set(0, 2, a.get(0, 2) + b.get(0, 2));
		temp.set(1, 2, a.get(1, 2) + b.get(1, 2));
		temp.set(2, 2, a.get(2, 2) + b.get(2, 2));
		temp.set(3, 2, a.get(3, 2) + b.get(3, 2));
		
		temp.set(0, 3, a.get(0, 3) + b.get(0, 3));
		temp.set(1, 3, a.get(1, 3) + b.get(1, 3));
		temp.set(2, 3, a.get(2, 3) + b.get(2, 3));
		temp.set(3, 3, a.get(3, 3) + b.get(3, 3));
		
		return temp;
	}
	/**
	 * c = a - b
	 * @param Mat4f a
	 * @param Mat4f b
	 * @return Mat4f 
	 */
	public static Mat4f sub(Mat4f a, Mat4f b) {
		Mat4f temp = Mat4f.zero();
		
		temp.set(0, 0, a.get(0, 0) - b.get(0, 0));
		temp.set(1, 0, a.get(1, 0) - b.get(1, 0));
		temp.set(2, 0, a.get(2, 0) - b.get(2, 0));
		temp.set(3, 0, a.get(3, 0) - b.get(3, 0));
		
		temp.set(0, 1, a.get(0, 1) - b.get(0, 1));
		temp.set(1, 1, a.get(1, 1) - b.get(1, 1));
		temp.set(2, 1, a.get(2, 1) - b.get(2, 1));
		temp.set(3, 1, a.get(3, 1) - b.get(3, 1));
	
		temp.set(0, 2, a.get(0, 2) - b.get(0, 2));
		temp.set(1, 2, a.get(1, 2) - b.get(1, 2));
		temp.set(2, 2, a.get(2, 2) - b.get(2, 2));
		temp.set(3, 2, a.get(3, 2) - b.get(3, 2));
		
		temp.set(0, 3, a.get(0, 3) - b.get(0, 3));
		temp.set(1, 3, a.get(1, 3) - b.get(1, 3));
		temp.set(2, 3, a.get(2, 3) - b.get(2, 3));
		temp.set(3, 3, a.get(3, 3) - b.get(3, 3));
		
		return temp;
	}
	/**
	 * c = a * f
	 * @param Mat4f a
	 * @param Mat4f b
	 * @return Mat4f 
	 */
	public static Mat4f mul(Mat4f a, float f) {
		Mat4f temp = Mat4f.zero();
		
		temp.set(0, 0, a.get(0, 0) * f);
		temp.set(1, 0, a.get(1, 0) * f);
		temp.set(2, 0, a.get(2, 0) * f);
		temp.set(3, 0, a.get(3, 0) * f);
		
		temp.set(0, 1, a.get(0, 1) * f);
		temp.set(1, 1, a.get(1, 1) * f);
		temp.set(2, 1, a.get(2, 1) * f);
		temp.set(3, 1, a.get(3, 1) * f);
	
		temp.set(0, 2, a.get(0, 2) * f);
		temp.set(1, 2, a.get(1, 2) * f);
		temp.set(2, 2, a.get(2, 2) * f);
		temp.set(3, 2, a.get(3, 2) * f);
		
		temp.set(0, 3, a.get(0, 3) * f);
		temp.set(1, 3, a.get(1, 3) * f);
		temp.set(2, 3, a.get(2, 3) * f);
		temp.set(3, 3, a.get(3, 3) * f);
		
		return temp;
	}
	/**
	 * c = a + v4
	 * @param Mat3f a
	 * @param Vec4f v4
	 * @return Vec4f 
	 */
	public static Vec4f mul(Mat4f a, Vec4f v) {
		// TODO Auto-generated method stub
		Vec4f temp = new Vec4f();
		
		temp.setX(a.get(0, 0) * v.getX() + a.get(1, 0) * v.getY() + a.get(2, 0) * v.getZ() + a.get(3, 0) * v.getW());
		temp.setY(a.get(0, 1) * v.getX() + a.get(1, 1) * v.getY() + a.get(2, 1) * v.getZ() + a.get(3, 1) * v.getW());
		temp.setZ(a.get(0, 2) * v.getX() + a.get(1, 2) * v.getY() + a.get(2, 2) * v.getZ() + a.get(3, 2) * v.getW());
		temp.setW(a.get(0, 3) * v.getX() + a.get(1, 3) * v.getY() + a.get(2, 3) * v.getZ() + a.get(3, 3) * v.getW());
		
		return temp;
	}
	/**
	 * c = a * b
	 * @param Mat4f a
	 * @param Mat4f b
	 * @return Mat4f 
	 */
	public static Mat4f mul(Mat4f a, Mat4f b) {
		// TODO Auto-generated method stub
		Mat4f temp = Mat4f.zero();
		
		temp.set(0, 0, a.get(0, 0) * b.get(0, 0) + a.get(1, 0) * b.get(0, 1) + a.get(2, 0) * b.get(0, 2) + a.get(3, 0) * b.get(0, 3));
		//temp.set(0, 0, dot(new Vec4f(a.get(0, 0), a.get(1, 0), a.get(2, 0), a.get(3, 0)), new Vec4f(b.get(0, 0), b.get(0, 1), b.get(0, 2), b.get(0, 3))));
		temp.set(1, 0, a.get(0, 0) * b.get(1, 0) + a.get(1, 0) * b.get(1, 1) + a.get(2, 0) * b.get(1, 2) + a.get(3, 0) * b.get(1, 3));
		temp.set(2, 0, a.get(0, 0) * b.get(2, 0) + a.get(1, 0) * b.get(2, 1) + a.get(2, 0) * b.get(2, 2) + a.get(3, 0) * b.get(2, 3));
		temp.set(3, 0, a.get(0, 0) * b.get(3, 0) + a.get(1, 0) * b.get(3, 1) + a.get(2, 0) * b.get(3, 2) + a.get(3, 0) * b.get(3, 3));
		
		temp.set(0, 1, a.get(0, 1) * b.get(0, 0) + a.get(1, 1) * b.get(0, 1) + a.get(2, 1) * b.get(0, 2) + a.get(3, 1) * b.get(0, 3));
		temp.set(1, 1, a.get(0, 1) * b.get(1, 0) + a.get(1, 1) * b.get(1, 1) + a.get(2, 1) * b.get(1, 2) + a.get(3, 1) * b.get(1, 3));
		temp.set(2, 1, a.get(0, 1) * b.get(2, 0) + a.get(1, 1) * b.get(2, 1) + a.get(2, 1) * b.get(2, 2) + a.get(3, 1) * b.get(2, 3));
		temp.set(3, 1, a.get(0, 1) * b.get(3, 0) + a.get(1, 1) * b.get(3, 1) + a.get(2, 1) * b.get(3, 2) + a.get(3, 1) * b.get(3, 3));
		
		temp.set(0, 2, a.get(0, 2) * b.get(0, 0) + a.get(1, 2) * b.get(0, 1) + a.get(2, 2) * b.get(0, 2) + a.get(3, 2) * b.get(0, 3));
		temp.set(1, 2, a.get(0, 2) * b.get(1, 0) + a.get(1, 2) * b.get(1, 1) + a.get(2, 2) * b.get(1, 2) + a.get(3, 2) * b.get(1, 3));
		temp.set(2, 2, a.get(0, 2) * b.get(2, 0) + a.get(1, 2) * b.get(2, 1) + a.get(2, 2) * b.get(2, 2) + a.get(3, 2) * b.get(2, 3));
		temp.set(3, 2, a.get(0, 2) * b.get(3, 0) + a.get(1, 2) * b.get(3, 1) + a.get(2, 2) * b.get(3, 2) + a.get(3, 2) * b.get(3, 3));
		
		temp.set(0, 3, a.get(0, 3) * b.get(0, 0) + a.get(1, 3) * b.get(0, 1) + a.get(2, 3) * b.get(0, 2) + a.get(3, 3) * b.get(0, 3));
		temp.set(1, 3, a.get(0, 3) * b.get(1, 0) + a.get(1, 3) * b.get(1, 1) + a.get(2, 3) * b.get(1, 2) + a.get(3, 3) * b.get(1, 3));
		temp.set(2, 3, a.get(0, 3) * b.get(2, 0) + a.get(1, 3) * b.get(2, 1) + a.get(2, 3) * b.get(2, 2) + a.get(3, 3) * b.get(2, 3));
		temp.set(3, 3, a.get(0, 3) * b.get(3, 0) + a.get(1, 3) * b.get(3, 1) + a.get(2, 3) * b.get(3, 2) + a.get(3, 3) * b.get(3, 3));
		
		return temp;
	}
	/**
	 * This computes the determinant of a 4x4 Matrix
	 * @param Mat4f a
	 * @return float
	 */
	public static Mat4f transpose(Mat4f a) {
		Mat4f temp = Mat4f.zero();
		
		temp.set(0, 0, a.get(0, 0));
		temp.set(1, 0, a.get(0, 1));
		temp.set(2, 0, a.get(0, 2));
		temp.set(3, 0, a.get(0, 3));
		
		temp.set(0, 1, a.get(1, 0));
		temp.set(1, 1, a.get(1, 1));
		temp.set(2, 1, a.get(1, 2));
		temp.set(3, 1, a.get(1, 3));
		
		temp.set(0, 2, a.get(2, 0));
		temp.set(1, 2, a.get(2, 1));
		temp.set(2, 2, a.get(2, 2));
		temp.set(3, 2, a.get(2, 3));
		
		temp.set(0, 3, a.get(3, 0));
		temp.set(1, 3, a.get(3, 1));
		temp.set(2, 3, a.get(3, 2));
		temp.set(3, 3, a.get(3, 3));
		
		return temp;
	}
	/**
	 * This computes the determinant of a 4x4 Matrix
	 * @param Mat4f a
	 * @return float
	 */
	public static float determinant(Mat4f a) {
		// Positive Values
		float dx = a.get(0, 0) * a.get(1, 1) * a.get(2, 2) * a.get(3, 3);
		float dy = a.get(1, 0) * a.get(2, 1) * a.get(3, 2) * a.get(0, 3);
		float dz = a.get(2, 0) * a.get(3, 1) * a.get(0, 2) * a.get(1, 3);
		float dw = a.get(3, 0) * a.get(0, 1) * a.get(1, 2) * a.get(2, 3);
		
		// Negative Values
		float ndx = a.get(0, 0) * a.get(3, 1) * a.get(2, 2) * a.get(1, 3);
		float ndy = a.get(1, 0) * a.get(0, 1) * a.get(3, 2) * a.get(2, 3);
		float ndz = a.get(2, 0) * a.get(1, 1) * a.get(0, 2) * a.get(3, 3);
		float ndw = a.get(3, 0) * a.get(2, 1) * a.get(1, 2) * a.get(0, 3);
		
		float d = dx + dy + dz + dw - ndx - ndy - ndz - ndw;
		
		return d;
	}
	/**
	 * This computes a adjoints 4x4 Matrix from another
	 * 4x4 Matrix
	 * @param Mat4f a
	 * @return Mat4f
	 */
	public static Mat4f adjoint(Mat4f a) {
		// TODO Auto-generated method stub
		/*
		Mat3f temp = Mat3f.zero();
		
		temp.set(0, 0, determinant(Mat2f.create(a.get(1, 1), a.get(2, 1), a.get(1, 2), a.get(2, 2))));
		temp.set(1, 0, -determinant(Mat2f.create(a.get(0, 1), a.get(2, 1), a.get(0, 2), a.get(2, 2))));
		temp.set(2, 0, determinant(Mat2f.create(a.get(0, 1), a.get(1, 1), a.get(0, 2), a.get(1, 2))));
		
		temp.set(0, 1, -determinant(Mat2f.create(a.get(1, 0), a.get(2, 0), a.get(1, 2), a.get(2, 2))));
		temp.set(1, 1, determinant(Mat2f.create(a.get(0, 0), a.get(2, 0), a.get(0, 2), a.get(2, 2))));
		temp.set(2, 1, -determinant(Mat2f.create(a.get(0, 0), a.get(1, 0), a.get(0, 2), a.get(1, 2))));
		
		temp.set(0, 2, determinant(Mat2f.create(a.get(1, 0), a.get(2, 0), a.get(1, 1), a.get(2, 1))));
		temp.set(1, 2, -determinant(Mat2f.create(a.get(0, 0), a.get(2, 0), a.get(0, 1), a.get(2, 1))));
		temp.set(2, 2, determinant(Mat2f.create(a.get(0, 0), a.get(1, 0), a.get(0, 1), a.get(1, 1))));
		*/
		
		Mat4f temp = Mat4f.zero();
		
		
		//Mat4f a = transpose(b);
		
		// row 0
		temp.set(0, 0, determinant(Mat3f.create(a.get(1, 1), a.get(2, 1), a.get(3, 1), 
												a.get(1, 2), a.get(2, 2), a.get(3, 2),
												a.get(1, 3), a.get(2, 3), a.get(3, 3))));
		
		temp.set(1, 0, -determinant(Mat3f.create(a.get(0, 1), a.get(2, 1), a.get(3, 1), 
												a.get(0, 2), a.get(2, 2), a.get(3, 2),
												a.get(0, 3), a.get(2, 3), a.get(3, 3))));
		
		temp.set(2, 0, determinant(Mat3f.create(a.get(0, 1), a.get(1, 1), a.get(3, 1), 
												a.get(0, 2), a.get(1, 2), a.get(3, 2),
												a.get(0, 3), a.get(1, 3), a.get(3, 3))));
		
		temp.set(3, 0, -determinant(Mat3f.create(a.get(0, 1), a.get(1, 1), a.get(2, 1), 
												a.get(0, 2), a.get(1, 2), a.get(2, 2),
												a.get(0, 3), a.get(1, 3), a.get(2, 3))));
		
		
		// row 1
		temp.set(0, 1, -determinant(Mat3f.create(a.get(1, 0), a.get(2, 0), a.get(3, 0), 
												a.get(1, 2), a.get(2, 2), a.get(3, 2),
												a.get(1, 3), a.get(2, 3), a.get(3, 3))));
		
		temp.set(1, 1, determinant(Mat3f.create(a.get(0, 0), a.get(2, 0), a.get(3, 0), 
												a.get(0, 2), a.get(2, 2), a.get(3, 2),
												a.get(0, 3), a.get(2, 3), a.get(3, 3))));
		
		temp.set(2, 1, -determinant(Mat3f.create(a.get(0, 0), a.get(1, 0), a.get(3, 0), 
												a.get(0, 2), a.get(1, 2), a.get(3, 2),
												a.get(0, 3), a.get(1, 3), a.get(3, 3))));
		
		temp.set(3, 1, determinant(Mat3f.create(a.get(0, 0), a.get(1, 0), a.get(2, 0), 
												a.get(0, 2), a.get(1, 2), a.get(2, 2),
												a.get(0, 3), a.get(1, 3), a.get(2, 3))));
		
		
		
		// row 2
		temp.set(0, 2, determinant(Mat3f.create(a.get(1, 0), a.get(2, 0), a.get(3, 0), 
												a.get(1, 1), a.get(2, 1), a.get(3, 1),
												a.get(1, 3), a.get(2, 3), a.get(3, 3))));
		
		temp.set(1, 2, -determinant(Mat3f.create(a.get(0, 0), a.get(2, 0), a.get(3, 0), 
												a.get(0, 1), a.get(2, 1), a.get(3, 1),
												a.get(0, 3), a.get(2, 3), a.get(3, 3))));
		
		temp.set(2, 2, determinant(Mat3f.create(a.get(0, 0), a.get(1, 0), a.get(3, 0), 
												a.get(0, 1), a.get(1, 1), a.get(3, 1),
												a.get(0, 3), a.get(1, 3), a.get(3, 3))));
		
		temp.set(3, 2, -determinant(Mat3f.create(a.get(0, 0), a.get(1, 0), a.get(2, 0), 
												a.get(0, 1), a.get(1, 1), a.get(2, 1),
												a.get(0, 3), a.get(1, 3), a.get(2, 3))));
		
		
		
		// row 3
		temp.set(0, 3, -determinant(Mat3f.create(a.get(1, 0), a.get(2, 0), a.get(3, 0), 
												a.get(1, 1), a.get(2, 1), a.get(3, 1),
												a.get(1, 2), a.get(2, 2), a.get(3, 2))));
		
		temp.set(1, 3, determinant(Mat3f.create(a.get(0, 0), a.get(2, 0), a.get(3, 0), 
												a.get(0, 1), a.get(2, 1), a.get(3, 1),
												a.get(0, 2), a.get(2, 2), a.get(3, 2))));
		
		temp.set(2, 3, -determinant(Mat3f.create(a.get(0, 0), a.get(1, 0), a.get(3, 0), 
												a.get(0, 1), a.get(1, 1), a.get(3, 1),
												a.get(0, 2), a.get(1, 2), a.get(3, 2))));
		
		temp.set(3, 3, determinant(Mat3f.create(a.get(0, 0), a.get(1, 0), a.get(2, 0), 
												a.get(0, 1), a.get(1, 1), a.get(2, 1),
												a.get(0, 2), a.get(1, 2), a.get(2, 2))));

		
		return transpose(temp);
		
	}
	/**
	 * This computes the inverse 4x4 Matrix of
	 * another 4x4 Matrix
	 * @param Mat4f a
	 * @return Mat2f
	 */
	public static Mat4f inverse(Mat4f a) {
		// TODO Auto-generated method stub
		float det = determinant(a);
		Mat4f adj = adjoint(a);
		
		float rep = 1.0f / det;
		
		return mul(adj, rep);
	}
}
