/*
 *	Module: CM1210 CW1
 *	Question: 2
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */
package q2;

import java.util.Date;

public class SpringerSpaniel extends Dog {

	private String nationality;

	public SpringerSpaniel(String name, Date birthday, String gender, String breed) {
		super(name, birthday, gender, breed);
	}

	public SpringerSpaniel(String name, Date birthday, String gender, String breed, float height) {
		super(name, birthday, gender, breed, height);
	}

	public SpringerSpaniel(String name, Date birthday, String gender, String breed, float height, String nationality) {
		super(name, birthday, gender, breed, height);
		this.nationality = nationality;
	}

	public SpringerSpaniel(String name, Date birthday, String gender, String breed, String nationality) {
		super(name, birthday, gender, breed);
		this.nationality = nationality;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}