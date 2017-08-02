package edu.mum.prj.model;

import javax.persistence.*;

@Entity
public class Skill {

	@Id
	@GeneratedValue
	private int skill_id;
	
	private String detail_skill;
	
	public Skill() {};
	public int getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}
	public String getDetail_skill() {
		return detail_skill;
	}
	public void setDetail_skill(String detail_skill) {
		this.detail_skill = detail_skill;
	}
	public Skill(String detail_skill) {
		super();
		this.detail_skill = detail_skill;
	}
	
	
}
