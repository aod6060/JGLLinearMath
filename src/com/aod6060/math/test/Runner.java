package com.aod6060.math.test;

import com.aod6060.math.LinearMath;
import com.aod6060.math.Mat2f;
import com.aod6060.math.Mat3f;
import com.aod6060.math.Mat4f;
import com.aod6060.math.Vec2f;
import com.aod6060.math.Vec3f;
import com.aod6060.math.Vec4f;

/**
 * This is a simple test class to see if the project is 
 * working or not. This library is used with conjunction 
 * of LWJGL 3 because it lacks OpenGL GLU library. So I 
 * decided to make a simple library that will take care 
 * of this functionality.
 * @author Fred
 *
 */
public class Runner {

	public static void main(String[] args) {
		/*
		 * Test 2D Vector Functions
		 */
		System.out.println("Testing Vec2f");
		runVec2fTests();
		/*
		 * Test 3D Vector Functions
		 */
		System.out.println("Testing Vec3f");
		runVec3fTests();
		/*
		 * Test 4D Vector Functions
		 */
		System.out.println("Testing Vec4f");
		runVec4fTests();
		/*
		 * Test 2D Matrix Functions
		 */
		System.out.println("Testing Mat2f");
		runMat2fTests();
		/*
		 * Test 3D Matrix Functions
		 */
		System.out.println("Testing Mat3f");
		runMat3fTests();
		/*
		 * Test 4D Matrix Functions
		 */
		System.out.println("Testing Mat4f");
		runMat4fTests();
	}

	
	private static void runMat4fTests() {
		// TODO Auto-generated method stub
		Mat4f a = Mat4f.random(32);
		Mat4f b = Mat4f.random(32);
		Mat4f c = Mat4f.zero();
		float f = 2.0f;
		Vec4f v = new Vec4f(1.0f, 1.0f, 1.0f, 1.0f);
		Vec4f v2 = new Vec4f();
		System.out.println("Value A");
		System.out.print(a);
		System.out.println("Value B");
		System.out.print(b);
		// Add c = a + b
		System.out.println("Testing Addition");
		c = LinearMath.add(a, b);
		System.out.print(c);
		// Sub c = a - b
		System.out.println("Testing Subtraction");
		c = LinearMath.sub(a, b);
		System.out.print(c);
		// Mul c = a * f
		System.out.println("Testing Scalar Multiplication");
		c = LinearMath.mul(a, f);
		System.out.print(c);
		// Mul Vec2f = a * Vec2f
		System.out.println("Testing Vector Multiplication");
		v2 = LinearMath.mul(a, v);
		System.out.println(v2);
		// Mul c = a * b;
		System.out.println("Testing Matrix Multiplication");
		c = LinearMath.mul(a, b);
		System.out.print(c);
		System.out.println("Testing Matrix Multiplication with Identity Matrix");
		c = LinearMath.mul(a, Mat3f.identity());
		System.out.println(c);
		// c = transpose(a)
		System.out.println("Testing Transpose");
		c = LinearMath.transpose(a);
		System.out.print(c);
		// f = determinant(a)
		System.out.println("Testing Determinant");
		f = LinearMath.determinant(a);
		System.out.println(f);
		// c = adjoints(a)
		System.out.println("Testing Adjoints");
		c = LinearMath.adjoint(a);
		System.out.print(c);
		// c = inverse(a)
		System.out.println("Testing Inverse");
		c = LinearMath.inverse(a);
		System.out.print(c);
		// Testing Inverse out
		System.out.println("Inverse Check");
		c = LinearMath.mul(a, c);
		System.out.print(c);
	}


	private static void runMat3fTests() {
		// TODO Auto-generated method stub
		Mat3f a = Mat3f.random(32);
		Mat3f b = Mat3f.random(32);
		Mat3f c = Mat3f.zero();
		float f = 2.0f;
		Vec3f v = new Vec3f(1.0f, 1.0f, 1.0f);
		Vec3f v2 = new Vec3f();
		System.out.println("Value A");
		System.out.print(a);
		System.out.println("Value B");
		System.out.print(b);
		// Add c = a + b
		System.out.println("Testing Addition");
		c = LinearMath.add(a, b);
		System.out.print(c);
		// Sub c = a - b
		System.out.println("Testing Subtraction");
		c = LinearMath.sub(a, b);
		System.out.print(c);
		// Mul c = a * f
		System.out.println("Testing Scalar Multiplication");
		c = LinearMath.mul(a, f);
		System.out.print(c);
		// Mul Vec2f = a * Vec2f
		System.out.println("Testing Vector Multiplication");
		v2 = LinearMath.mul(a, v);
		System.out.println(v2);
		// Mul c = a * b;
		System.out.println("Testing Matrix Multiplication");
		c = LinearMath.mul(a, b);
		System.out.print(c);
		System.out.println("Testing Matrix Multiplication with Identity Matrix");
		c = LinearMath.mul(a, Mat3f.identity());
		System.out.println(c);
		// c = transpose(a)
		System.out.println("Testing Transpose");
		c = LinearMath.transpose(a);
		System.out.print(c);
		// f = determinant(a)
		System.out.println("Testing Determinant");
		f = LinearMath.determinant(a);
		System.out.println(f);
		// c = adjoints(a)
		System.out.println("Testing Adjoints");
		c = LinearMath.adjoint(a);
		System.out.print(c);
		// c = inverse(a)
		System.out.println("Testing Inverse");
		c = LinearMath.inverse(a);
		System.out.print(c);
		// Testing Inverse out
		System.out.println("Inverse Check");
		c = LinearMath.mul(a, c);
		System.out.print(c);
	}

	private static void runMat2fTests() {
		Mat2f a = Mat2f.random(32);
		Mat2f b = Mat2f.random(32);
		Mat2f c = Mat2f.zero();
		float f = 2.0f;
		Vec2f v = new Vec2f(1.0f, 1.0f);
		Vec2f v2 = new Vec2f();
		System.out.println("Value A");
		System.out.print(a);
		System.out.println("Value B");
		System.out.print(b);
		// Add c = a + b
		System.out.println("Testing Addition");
		c = LinearMath.add(a, b);
		System.out.print(c);
		// Sub c = a - b
		System.out.println("Testing Subtraction");
		c = LinearMath.sub(a, b);
		System.out.print(c);
		// Mul c = a * f
		System.out.println("Testing Scalar Multiplication");
		c = LinearMath.mul(a, f);
		System.out.print(c);
		// Mul Vec2f = a * Vec2f
		System.out.println("Testing Vector Multiplication");
		v2 = LinearMath.mul(a, v);
		System.out.println(v2);
		// Mul c = a * b;
		System.out.println("Testing Matrix Multiplication");
		c = LinearMath.mul(a, b);
		System.out.print(c);
		// c = transpose(a)
		System.out.println("Testing Transpose");
		c = LinearMath.transpose(a);
		System.out.print(c);
		// f = determinant(a)
		System.out.println("Testing Determinant");
		f = LinearMath.determinant(a);
		System.out.println(f);
		// c = adjoints(a)
		System.out.println("Testing Adjoints");
		c = LinearMath.adjoint(a);
		System.out.print(c);
		// c = inverse(a)
		System.out.println("Testing Inverse");
		c = LinearMath.inverse(a);
		System.out.print(c);
		// Testing Inverse out
		System.out.println("Inverse Check");
		c = LinearMath.mul(a, c);
		System.out.print(c);
	}

	private static void runVec4fTests() {
		// TODO Auto-generated method stub
		// Some silly values that I'm going to test
		Vec4f a = new Vec4f(2.0f, 3.0f, 4.0f, 5.0f);
		Vec4f b = new Vec4f(3.0f, 6.0f, 9.0f, 12.0f);
		Vec4f c = new Vec4f();
		float temp = 0;
		// Test Addition
		// The values should be <5, 9> = <2, 3> + <3, 6>
		c = LinearMath.add(a, b);
		System.out.println(c);
		// Test Subtraction
		c = LinearMath.sub(a, b); // <-1, -3>
		System.out.println(c);
		// Test Multiplication <a, b> * f = <a*f, b*f>
		c = LinearMath.mul(a, 2.0f); // <4, 6>
		System.out.println(c);
		// Test Division <a, b> * 1/f = <a/f, b/f>
		c = LinearMath.div(a, 2.0f); // <1, 1.5>
		System.out.println(c);
		// Return Length
		temp = LinearMath.length(a); // This returns the length 3.60555
		System.out.println(temp);
		temp = LinearMath.length2(a); // Returns the length^2 13
		System.out.println(temp);
		c = LinearMath.unit(a); // Returns the unit vector of a <2/3.60555, 3/3.60555>
		System.out.println(c);
		temp = LinearMath.length(c); // Test to see if the length is 1.0
		System.out.println(temp);
		temp = LinearMath.dot(a, b); // Returns the dot product of a and b
		System.out.println(temp);
		temp = LinearMath.angle(a, b); // Returns the angle between the two vectors
		System.out.println(Math.toDegrees(temp));
		c = LinearMath.negate(a);
		System.out.println(c);
		c = LinearMath.randomVec4f(23);
		System.out.println(c);
	}

	private static void runVec3fTests() {
		// TODO Auto-generated method stub
		// Some silly values that I'm going to test
		Vec3f a = new Vec3f(2.0f, 3.0f, 4.0f);
		Vec3f b = new Vec3f(3.0f, 6.0f, 9.0f);
		Vec3f c = new Vec3f();
		float temp = 0;
		// Test Addition
		// The values should be <5, 9> = <2, 3> + <3, 6>
		c = LinearMath.add(a, b);
		System.out.println(c);
		// Test Subtraction
		c = LinearMath.sub(a, b); // <-1, -3>
		System.out.println(c);
		// Test Multiplication <a, b> * f = <a*f, b*f>
		c = LinearMath.mul(a, 2.0f); // <4, 6>
		System.out.println(c);
		// Test Division <a, b> * 1/f = <a/f, b/f>
		c = LinearMath.div(a, 2.0f); // <1, 1.5>
		System.out.println(c);
		// Return Length
		temp = LinearMath.length(a); // This returns the length 3.60555
		System.out.println(temp);
		temp = LinearMath.length2(a); // Returns the length^2 13
		System.out.println(temp);
		c = LinearMath.unit(a); // Returns the unit vector of a <2/3.60555, 3/3.60555>
		System.out.println(c);
		temp = LinearMath.length(c); // Test to see if the length is 1.0
		System.out.println(temp);
		temp = LinearMath.dot(a, b); // Returns the dot product of a and b
		System.out.println(temp);
		temp = LinearMath.angle(a, b); // Returns the angle between the two vectors
		System.out.println(Math.toDegrees(temp));
		c = LinearMath.cross(a, b);
		System.out.println(c);
		c = LinearMath.negate(a);
		System.out.println(c);
		c = LinearMath.randomVec3f(23);
		System.out.println(c);
	}

	private static void runVec2fTests() {
		// TODO Auto-generated method stub
		// Some silly values that I'm going to test
		Vec2f a = new Vec2f(2.0f, 3.0f);
		Vec2f b = new Vec2f(3.0f, 6.0f);
		Vec2f c = new Vec2f();
		float temp = 0;
		// Test Addition
		// The values should be <5, 9> = <2, 3> + <3, 6>
		c = LinearMath.add(a, b);
		System.out.println(c);
		// Test Subtraction
		c = LinearMath.sub(a, b); // <-1, -3>
		System.out.println(c);
		// Test Multiplication <a, b> * f = <a*f, b*f>
		c = LinearMath.mul(a, 2.0f); // <4, 6>
		System.out.println(c);
		// Test Division <a, b> * 1/f = <a/f, b/f>
		c = LinearMath.div(a, 2.0f); // <1, 1.5>
		System.out.println(c);
		// Return Length
		temp = LinearMath.length(a); // This returns the length 3.60555
		System.out.println(temp);
		temp = LinearMath.length2(a); // Returns the length^2 13
		System.out.println(temp);
		c = LinearMath.unit(a); // Returns the unit vector of a <2/3.60555, 3/3.60555>
		System.out.println(c);
		temp = LinearMath.length(c); // Test to see if the length is 1.0
		System.out.println(temp);
		temp = LinearMath.dot(a, b); // Returns the dot product of a and b
		System.out.println(temp);
		temp = LinearMath.angle(a, b); // Returns the angle between the two vectors
		System.out.println(Math.toDegrees(temp));
		c = LinearMath.negate(a);
		System.out.println(c);
		c = LinearMath.randomVec2f(23);
		System.out.println(c);
	}

}
