/*
 *	Module: CM1210 CW1
 *	Question: 2
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */
package q2;

import java.util.Date;

public class Dog extends Pet {

	private String breed;
	private String gender;

	public Dog(String name, Date birthday, String gender, String breed) {
		super(name, birthday);
		this.gender = gender;
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public String getGender() {
		return gender;
	}

}
