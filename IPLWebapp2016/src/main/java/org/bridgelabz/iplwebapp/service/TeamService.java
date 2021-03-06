package org.bridgelabz.iplwebapp.service;

import java.util.List;

import org.bridgelabz.iplwebapp.model.Team;

public interface TeamService {

	public void addTeam(Team team);

	public List<Team> listAllTeams();

	public List<Team> listTeamDetails(String teamName);

}
