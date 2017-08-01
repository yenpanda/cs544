package edu.mum.prj.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.*;

@Entity
public class Task {
	@Id
	@GeneratedValue
	private int task_id;
	/*
	@ManyToOne
	@Column(name="Project_Id")
	private Project prj_Id;
	*/
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Task_Resource",
				joinColumns = @JoinColumn(name = "task_id"),
				inverseJoinColumns = @JoinColumn(name ="res_id"))
	private List<Resource> res;
	
	private String status;
	private String skill;
	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	private Date endDate;

	private static DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,
			Locale.US);
	

	public Task(String status, String skill, String startDate, String endDate) {
		super();
		this.status = status;
		this.skill = skill;
		setStartDate(startDate);
		setEndDate(endDate);
	}

	
	public List<Resource> getRes() {
		return res;
	}


	public void setRes(List<Resource> res) {
		this.res = res;
	}


	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getStartDate() {
		return df.format(startDate);
	}

	public void setStartDate(String startDate) {
		try {
			this.startDate = df.parse(startDate);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public String getEndDate() {
		return df.format(endDate);
	}

	public void setEndDate(String endDate) {
		try {
			this.endDate = df.parse(endDate);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
