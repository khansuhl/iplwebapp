package org.bridgelabz.iplwebapp.dao;

import java.util.List;

import org.bridgelabz.iplwebapp.model.Team;

public interface TeamDao {

	public void addTeam(Team team);

	public List<Team> listAllTeams();

	public List<Team> listTeamDetails(String teamName);

}
