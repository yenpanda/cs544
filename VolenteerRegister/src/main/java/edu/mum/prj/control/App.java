package edu.mum.prj.control;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.mum.prj.model.*;

public class App {

	 private static final SessionFactory SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
	 
	    public static SessionFactory getSessionFactory() {
	        return SESSION_FACTORY;
	    }
	    
	 public static void main(String arg[]) {
		 
		 try{
			 Session session = App.getSessionFactory().openSession();
			 session.beginTransaction();
			
			 fillDatabase(session);
			
			 //Find by location
			 
		 System.out.println("ujmujmujmujmumjumj"+Queries.searchByKeywordAndLocation(session, "registerSys", "MUM"));
			 
			 
		 } catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
	 
	 }
	 
	public static void fillDatabase(Session session) {
		 Project prj1 = new Project("Hibernate RegisterSys","MUM","Opened","31/07/2017","01/08/2017");
		 Project prj2 = new Project("Hibernate RegisterSys","MUM","Closed","31/07/2017","31/07/2017");
		 
		 Task t1 = new Task("Finished","Hibernate","31/07/2017","31/07/2017");
		 Task t2 = new Task("Processing","Spring","01/08/2017","02/08/2017");
		 Task t3 = new Task("Finished","CSS","31/07/2017","31/07/2017");
		 Task t4 = new Task("Processing","HTML","01/08/2017","02/08/2017");
		 
		 List<Task> tl1 = new ArrayList<Task>();
		 List<Task> tl2 = new ArrayList<Task>();
		 tl1.add(t1);
		 tl1.add(t2);
		 tl2.add(t3);
		 tl2.add(t4);
		 
		 prj1.setTask(tl1);
		 prj2.setTask(tl2);
		 
		 session.save(prj1);
		 session.save(prj2);
		 
		 
		 Resource res1 = new Resource(Role.Administrator, "Hibernate");
		 Resource res2 = new Resource(Role.Volunteer, "Spring");
		 List<Resource> rl1 = new ArrayList<Resource>();
		 
		 rl1.add(res1);
		 rl1.add(res2);
		 
		 t2.setRes(rl1);
		 t3.setRes(rl1);
		 t1.setRes(rl1);
		 
		 
		 Skill sk1 = new Skill("Hibernate");
		 Skill sk3 = new Skill("HTML");
		 Skill sk2 = new Skill("Spring");
		 
		 List<Skill> sl1 = new ArrayList<Skill>();
		 List<Skill> sl2 = new ArrayList<Skill>();
		 
		 sl1.add(sk1);
		 sl1.add(sk2);
		 sl2.add(sk1);
		 sl2.add(sk3);
		 
		 res1.setSkillRequired(sl1);
		 res2.setSkillRequired(sl2);
		 
		 session.save(res1);
		 session.save(res2);
		 
		 session.getTransaction().commit();
	}
}
