/*
 *	Module: CM1210 CW1
 *	Question: 2
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */
package q2;

import java.util.Date;

public class Fish extends Pet {

	private float length;
	private String species;

	public Fish(String name, Date birthday, String species) {
		super(name, birthday);
		this.species = species;
	}

	public Fish(String name, Date birthday, String species, float length) {
		super(name, birthday);
		this.species = species;
		this.length = length;
	}

	public float getLength() {
		return length;
	}

	public String getSpecies() {
		return species;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public void eat() {
		System.out.println("Nom nom nom");
	}

	public void sleep() {
		System.out.println("ZzZzZzZz");
	}

}
