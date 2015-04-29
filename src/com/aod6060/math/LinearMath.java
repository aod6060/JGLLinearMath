package com.aod6060.math;

import java.util.Random;

/**
 * This class contains all of the methods to do operation
 * on linear components such as vectors, matrices, and 
 * quaternions. For now its going to have just operation
 * for vectors. 
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

	public static float length(Vec2f a) {
		// TODO Auto-generated method stub
		return (float) Math.sqrt(a.getX()*a.getX() + a.getY()*a.getY());
	}

	public static float length2(Vec2f a) {
		// TODO Auto-generated method stub
		return a.getX()*a.getX() + a.getY()*a.getY();
	}

	public static Vec2f unit(Vec2f a) {
		// TODO Auto-generated method stub
		float len = length(a);
		return div(a, len);
	}

	public static float dot(Vec2f a, Vec2f b) {
		// TODO Auto-generated method stub
		return a.getX() * b.getX() + a.getY() * a.getY();
	}

	public static float angle(Vec2f a, Vec2f b) {
		// TODO Auto-generated method stub
		float adotb = dot(a, b);
		float la = length(a);
		float lb = length(b);
		return (float) Math.acos(adotb / (la * lb));
	}
	
	public static Vec2f negate(Vec2f a) {
		// TODO Auto-generated method stub
		return new Vec2f(-a.getX(), -a.getY());
	}
	
	/*
	 * Vec3f
	 */
	
	public static Vec3f add(Vec3f a, Vec3f b) {
		// TODO Auto-generated method stub
		return new Vec3f(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
	}

	public static Vec3f sub(Vec3f a, Vec3f b) {
		// TODO Auto-generated method stub
		return new Vec3f(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
	}

	public static Vec3f mul(Vec3f a, float f) {
		// TODO Auto-generated method stub
		return new Vec3f(a.getX() * f, a.getY() * f, a.getZ() * f);
	}

	public static Vec3f div(Vec3f a, float f) {
		// TODO Auto-generated method stub
		return new Vec3f(a.getX() / f, a.getY() / f, a.getZ() / f);
	}

	public static float length(Vec3f a) {
		// TODO Auto-generated method stub
		return (float) Math.sqrt(a.getX()*a.getX() + a.getY()*a.getY() + a.getZ()*a.getZ());
	}

	public static float length2(Vec3f a) {
		// TODO Auto-generated method stub
		return a.getX()*a.getX() + a.getY()*a.getY() + a.getZ()*a.getZ();
	}

	public static Vec3f unit(Vec3f a) {
		// TODO Auto-generated method stub
		float len = length(a);
		return div(a, len);
	}

	public static float dot(Vec3f a, Vec3f b) {
		// TODO Auto-generated method stub
		return a.getX()*b.getX() + a.getY()*b.getY() + a.getZ()*b.getZ();
	}

	public static float angle(Vec3f a, Vec3f b) {
		// TODO Auto-generated method stub
		float adotb = dot(a, b);
		float la = length(a);
		float lb = length(b);
		return (float) Math.acos(adotb / (la * lb));
	}

	public static Vec3f cross(Vec3f a, Vec3f b) {
		// TODO Auto-generated method stub
		return new Vec3f(
				a.getY() * b.getZ() - a.getZ() * b.getY(),
				a.getZ() * b.getX() - a.getX() * b.getZ(),
				a.getX() * b.getY() - a.getY() * b.getX());
	}
	
	public static Vec3f negate(Vec3f a) {
		// TODO Auto-generated method stub
		return new Vec3f(-a.getX(), -a.getY(), -a.getZ());
	}
	/*
	 * Vec4f
	 */
	public static Vec4f add(Vec4f a, Vec4f b) {
		// TODO Auto-generated method stub
		return new Vec4f(
				a.getX() + b.getX(),
				a.getY() + b.getY(),
				a.getZ() + b.getZ(),
				a.getW() + b.getW());
	}

	public static Vec4f sub(Vec4f a, Vec4f b) {
		// TODO Auto-generated method stub
		return new Vec4f(
				a.getX() - b.getX(),
				a.getY() - b.getY(),
				a.getZ() - b.getZ(),
				a.getW() - b.getW());
	}

	public static Vec4f mul(Vec4f a, float f) {
		// TODO Auto-generated method stub
		return new Vec4f(
				a.getX() * f,
				a.getY() * f,
				a.getZ() * f,
				a.getW() * f);
	}

	public static Vec4f div(Vec4f a, float f) {
		// TODO Auto-generated method stub
		return new Vec4f(
				a.getX() / f,
				a.getY() / f,
				a.getZ() / f,
				a.getW() / f);
	}

	public static float length(Vec4f a) {
		// TODO Auto-generated method stub
		return (float) Math.sqrt(a.getX()*a.getX() + a.getY()*a.getY() + a.getZ()*a.getZ() + a.getW()*a.getW());
	}

	public static float length2(Vec4f a) {
		// TODO Auto-generated method stub
		return a.getX()*a.getX() + a.getY()*a.getY() + a.getZ()*a.getZ() + a.getW()*a.getW();
	}

	public static Vec4f unit(Vec4f a) {
		// TODO Auto-generated method stub
		float len = length(a);
		return div(a, len);
	}

	public static float dot(Vec4f a, Vec4f b) {
		// TODO Auto-generated method stub
		return a.getX()*b.getX() + a.getY()*b.getY() + a.getZ()*b.getZ() + a.getW()*b.getW();
	}

	public static float angle(Vec4f a, Vec4f b) {
		// TODO Auto-generated method stub
		float adotb = dot(a, b);
		float la = length(a);
		float lb = length(b);
		return (float) Math.acos(adotb / (la * lb));
	}

	public static Vec4f negate(Vec4f a) {
		// TODO Auto-generated method stub
		return new Vec4f(-a.getX(), -a.getY(), -a.getZ(), -a.getW());
	}
	
	/*
	 * These are the random vector methods
	 */
	public static Vec2f randomVec2f(int i) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return new Vec2f(rand.nextInt(i), rand.nextInt(i));
	}

	public static Vec3f randomVec3f(int i) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return new Vec3f(rand.nextInt(i), rand.nextInt(i), rand.nextInt(i));
	}

	public static Vec4f randomVec4f(int i) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return new Vec4f(rand.nextInt(i), rand.nextInt(i), rand.nextInt(i), rand.nextInt(i));
	}
	
	/*
	 * Mat2f Functions 
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

	public static Mat2f sub(Mat2f a, Mat2f b) {
		// TODO Auto-generated method stub
		
		Mat2f temp = Mat2f.zero();
		
		temp.set(0, 0, a.get(0, 0) - b.get(0, 0));
		temp.set(1, 0, a.get(1, 0) - b.get(1, 0));
		temp.set(0, 1, a.get(0, 1) - b.get(0, 1));
		temp.set(1, 1, a.get(1, 1) - b.get(1, 1));
		
		return temp;
	}

	public static Mat2f mul(Mat2f a, float f) {
		// TODO Auto-generated method stub
		
		Mat2f temp = Mat2f.zero();
		
		temp.set(0, 0, a.get(0, 0) * f);
		temp.set(1, 0, a.get(1, 0) * f);
		temp.set(0, 1, a.get(0, 1) * f);
		temp.set(1, 1, a.get(1, 1) * f);
		
		return temp;
	}

	public static Vec2f mul(Mat2f a, Vec2f v) {
		Vec2f temp = new Vec2f();
		
		temp.setX(a.get(0, 0) * v.getX() + a.get(1, 0) * v.getY());
		temp.setY(a.get(0, 1) * v.getX() + a.get(1, 1) * v.getY());
		
		return temp;
	}

	public static Mat2f mul(Mat2f a, Mat2f b) {
		Mat2f temp = Mat2f.zero();
		
		temp.set(0, 0, a.get(0, 0) * b.get(0, 0) + a.get(1, 0) * b.get(0,  1));
		temp.set(1, 0, a.get(0, 0) * b.get(1, 0) + a.get(1, 0) * b.get(1,  1));
		
		temp.set(0, 1, a.get(0, 1) * b.get(0, 0) + a.get(1, 1) * b.get(0,  1));
		temp.set(1, 1, a.get(0, 1) * b.get(1, 0) + a.get(1, 1) * b.get(1,  1));
		
		return temp;
	}

	public static Mat2f transpose(Mat2f a) {
		Mat2f temp = Mat2f.zero();
		
		temp.set(0, 0, a.get(0, 0));
		temp.set(1, 0, a.get(0, 1));
		temp.set(0, 1, a.get(1, 0));
		temp.set(1, 1, a.get(1, 1));
		
		return temp;
	}

	public static float determinant(Mat2f a) {
		// TODO Auto-generated method stub
		return a.get(0, 0) * a.get(1, 1) - a.get(1, 0) * a.get(0, 1);
	}

	public static Mat2f adjoint(Mat2f a) {
		// TODO Auto-generated method stub
		Mat2f temp = Mat2f.zero();
		
		temp.set(0, 0, a.get(1, 1));
		temp.set(1, 0, -a.get(1, 0));
		temp.set(0, 1, -a.get(0, 1));
		temp.set(1, 1, a.get(0, 0));
		
		return temp;
	}

	public static Mat2f inverse(Mat2f a) {
		// TODO Auto-generated method stub
		float det = determinant(a);
		Mat2f adj = adjoint(a);
		return mul(adj, 1.0f / det);
	}

	/*
	 * Mat3f Functions
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

	public static Vec3f mul(Mat3f a, Vec3f v) {
		// TODO Auto-generated method stub
		Vec3f temp = new Vec3f();
		
		temp.setX(a.get(0, 0) * v.getX() + a.get(1, 0) * v.getY() + a.get(2, 0) * v.getZ());
		temp.setY(a.get(0, 1) * v.getX() + a.get(1, 1) * v.getY() + a.get(2, 1) * v.getZ());
		temp.setZ(a.get(0, 2) * v.getX() + a.get(1, 2) * v.getY() + a.get(2, 2) * v.getZ());
		
		return temp;
	}

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

	public static Mat3f inverse(Mat3f a) {
		// TODO Auto-generated method stub
		float det = determinant(a);
		Mat3f adj = adjoint(a);
		return mul(adj, 1.0f / det);
	}
	
	/*
	 * Mat4f Functions
	 */
	public static Mat4f add(Mat4f a, Mat4f b) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Mat4f sub(Mat4f a, Mat4f b) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Mat4f mul(Mat4f a, float f) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vec4f mul(Mat4f a, Vec4f v) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Mat4f mul(Mat4f a, Mat4f b) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Mat4f mul(Mat4f a, Mat3f identity) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Mat4f transpose(Mat4f a) {
		// TODO Auto-generated method stub
		return null;
	}

	public static float determinant(Mat4f a) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static Mat4f adjoint(Mat4f a) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Mat4f inverse(Mat4f a) {
		// TODO Auto-generated method stub
		return null;
	}
}
