/*
 *	Module: CM1210 CW1
 *	Question: 2
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */
package q2;

import java.util.Date;

public abstract class Pet {

	private String name;
	private Date birthday;
	private float weight;

	public Pet(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public Pet(String name, Date birthday, float weight) {
		this.name = name;
		this.birthday = birthday;
		this.weight = weight;
	}

	public String toString() {
		return "Pet:" + name;
	}

	public String getName() {
		return name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public float getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public abstract void sleep();

	public abstract void eat();

}
