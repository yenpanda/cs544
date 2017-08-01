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

}
