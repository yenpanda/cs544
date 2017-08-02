package edu.mum.prj.model;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.*;

@Entity
public class Project {
    public Project(){}
	@Id
	@GeneratedValue
	
	private int prj_Id;
	
	private String description;
	private String location;
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Task> task;

	@Lob
	@Transient
	private Object[] benenfical;
	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	private Date endDate;

	private static DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,
			Locale.US);
	
	public Project(String description, String location, String status, String startDate, String endDate) {
		super();
		this.description = description;
		this.location = location;
		this.status = status;
		setStartDate(startDate);
		setEndDate(endDate);
	}

	public int getPrj_Id() {
		return prj_Id;
	}

	public void setPrj_Id(int prj_Id) {
		this.prj_Id = prj_Id;
	}

	
	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object[] getBenenfical() {
		return benenfical;
	}

	public void setBenenfical(Object[] benenfical) {
		this.benenfical = benenfical;
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

	@Override
	public String toString() {
		return "Project [prj_Id=" + prj_Id + ", description=" + description + ", location=" + location + ", status="
				+ status + ", task=" + task + ", benenfical=" + Arrays.toString(benenfical) + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
	
}
