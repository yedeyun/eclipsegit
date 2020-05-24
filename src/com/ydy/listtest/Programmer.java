package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

public class Programmer extends Employee {

	private int memberid;
	private Status status = Status.FREE;
	private Equipment equipment;

	public Programmer() {
		super();
	}

	public Programmer(int id, String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
		// TODO Auto-generated constructor stub
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	@Override
	public String toString() {
		return getDetails() + "\t程序员" + "\t" + status + "\t\t\t" + equipment.getDescription();
	}

	public String getTeamBaseDetails() {
		return memberid 
				+ "/" + getId() + "\t"
				+ getName() + "\t" 
				+ getAge() + "\t" 
				+ getSalary();
	}

	public String getDetailsForTeam() {
		return getTeamBaseDetails() + "\t程序员";
	}

}
