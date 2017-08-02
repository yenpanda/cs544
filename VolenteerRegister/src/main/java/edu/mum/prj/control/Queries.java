package edu.mum.prj.control;

import java.util.List;

import org.hibernate.*;

import edu.mum.prj.model.*;

public class Queries {
	public static List<Project> searchByKeywordAndLocation(Session session, String keyword, String location) {
		Query q = session.createQuery("select p from Project p where p.location = :loc" );
		q.setParameter("loc", location);
		@SuppressWarnings("unchecked")
		List<Project> ls = q.list();
		return ls;
	}
	
	public static List<Task> listTaskByProject(Session session, String project){
		Query q = session.createQuery("select p.task from Project p where p.description = :prj_Name");
		q.setParameter("prj_Name", project);
		List<Task> lt = q.list();
		
		return lt;
	}

	public static List<Project> listProjectByStatus(Session session, String status){
		Query q = session.createQuery("select p from Project p where p.status = :status");
		q.setParameter("status", status);
		List<Project> lp = q.list();
		
		return lp;
	}
	
	public static List<Project> searchProjectByParticularResource(Session session, String parResource){
		Query q = session.createQuery("select p from Project p join p.task tl join tl.res rl where rl.type = :type");
	
		q.setParameter("type", parResource);
		List<Project> pl = q.list();
		
		return pl;
	}
}
