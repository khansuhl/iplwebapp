package org.bridgelabz.iplwebapp.service.impl;

import java.util.List;

import org.bridgelabz.iplwebapp.dao.PlayerDao;
import org.bridgelabz.iplwebapp.model.Player;
import org.bridgelabz.iplwebapp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;

public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerDao playerDao;

	public void addPlayer(Player player) {
		playerDao.addPlayer(player);
	}

	public List<Player> listAllPlayers(Integer teamId) {

		List<Player> playerList = playerDao.listAllPlayers(teamId);
		return playerList;
	}

	public List<Player> listPlayerDetails(Integer id) {

		List<Player> playerDetails = playerDao.listPlayerDetails(id);
		return playerDetails;
	}

}
