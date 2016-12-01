package home.task.lits;

import home.task.lits.Name;

public class User {

	private String sex;
	private Name name;
	private Integer age;
	private String car;
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public Name getName() {
		return name;
	}
	public String getCar() {
		return car;
	}
	public Integer getAge() {
		return age;
	}
}