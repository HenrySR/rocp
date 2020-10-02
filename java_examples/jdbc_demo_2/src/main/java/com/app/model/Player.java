package com.app.model;

public class Player {

	private int id;
	private String name;
	private int age;
	private String teamname;
	private String gender;
	private String  city;
	
	public Player() {
		
	}
	
	public Player(int id, String name, int age, String teamname, String gender, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.teamname = teamname;
		this.gender = gender;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", teamname=" + teamname + ", gender=" + gender
				+ ", city=" + city + "]";
	}
	
	
}
