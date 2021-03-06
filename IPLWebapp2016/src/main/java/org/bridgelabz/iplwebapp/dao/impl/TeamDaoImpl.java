package org.bridgelabz.iplwebapp.dao.impl;

import java.util.List;

import org.bridgelabz.iplwebapp.dao.TeamDao;
import org.bridgelabz.iplwebapp.model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TeamDaoImpl implements TeamDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addTeam(Team team) {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.save(team);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Team> listAllTeams() {
		Session session = sessionFactory.getCurrentSession();
		Query<Team> query = session.createQuery("from Team");
		List<Team> teamList = query.getResultList();
		return teamList;
	}

	public List<Team> listTeamDetails(String teamName) {

		Session session = sessionFactory.getCurrentSession();
		Query<Team> query = session.createQuery("from Team where name=:teamName");
		query.setParameter("teamName", teamName);
		List<Team> teamDetails = query.getResultList();
		return teamDetails;
	}
}
