package edu.mum.prj.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Resource {

	@Id
	@GeneratedValue
	private int res_id;
	
	private String provider;
	@Enumerated
	private Role type;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Resource_Skill", 
				joinColumns = @JoinColumn(name = "res_id"),
				inverseJoinColumns = @JoinColumn(name = "skill_id"))
	private List<Skill> skillRequired;
	
//	@ManyToMany(mappedBy = "res")
//	private List<Task> task;
	
	public Resource() {};
	public Resource(Role type, String provider) {
		super();
		this.type = type;
		this.provider = provider;
	}

	public int getRes_id() {
		return res_id;
	}

	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}

	public Role getType() {
		return type;
	}

	public void setType(Role type) {
		this.type = type;
	}

	public List<Skill> getSkillRequired() {
		return skillRequired;
	}

	public void setSkillRequired(List<Skill> skillRequired) {
		this.skillRequired = skillRequired;
	}
	

}
