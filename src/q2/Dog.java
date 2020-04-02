/*
 *	Module: CM1210 CW1
 *	Question: 2
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */
package q2;

import java.util.Date;

public class Dog extends Pet {

	private float height;
	private String breed;
	private String gender;

	public Dog(String name, Date birthday, String gender, String breed) {
		super(name, birthday);
		this.gender = gender;
		this.breed = breed;
	}

	public Dog(String name, Date birthday, String gender, String breed, float height) {
		super(name, birthday);
		this.gender = gender;
		this.breed = breed;
		this.height = height;
	}

	public String getBreed() {
		return breed;
	}

	public String getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void eat() {
		System.out.println("Nom nom nom");
	}

	public void sleep() {
		System.out.println("ZzZzZzZz");
	}
}
