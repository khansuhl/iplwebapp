package org.bridgelabz.iplwebapp.service.impl;

import java.util.List;

import org.bridgelabz.iplwebapp.dao.TeamDao;
import org.bridgelabz.iplwebapp.model.Team;
import org.bridgelabz.iplwebapp.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;

public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamDao teamDao;

	public void addTeam(Team team) {
		teamDao.addTeam(team);
	}

	public List<Team> listAllTeams() {

		List<Team> teamList = teamDao.listAllTeams();
		return teamList;
	}

	public List<Team> listTeamDetails(String teamName) {

		List<Team> teamDetails = teamDao.listTeamDetails(teamName);
		return teamDetails;
	}

}
