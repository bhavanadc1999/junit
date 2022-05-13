package com.doctor_record.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor_details")
public class doctor {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public void setRoll_no(long roll_no) {
		this.roll_no = roll_no;
	}
	@Id
	private long roll_no;
	private String name;
	private String mail_id;
	private int mobile_no;
	public long getRoll_no() {
		return roll_no;
	}

}
