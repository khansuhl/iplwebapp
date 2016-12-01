package org.bridgelabz.iplwebapp.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public class Team {

	public Team() {
	}

	public Team(Integer id, String name, String coachName, String ownerName, String captainName, String logo,
			String homeVenue) {
		setId(id);
		setName(name);
		setCoachName(coachName);
		setOwnerName(ownerName);
		setCaptainName(captainName);
		setLogo(logo);
		setHomeVenue(homeVenue);
	}

	@Id
	@GenericGenerator(name = "gene", strategy = "increment")
	@GeneratedValue(generator = "gene")
	@Column(name = "ID")
	private int id;

	@Column(name = "Team Name")
	private String name;

	@Column(name = "Coach Name")
	private String coachName;

	@Column(name = "Owner Name")
	private String ownerName;

	@Column(name = "Captain Name")
	private String captainName;

	@Column(name = "Logo")
	private String logo;

	@Column(name = "Home Venue")
	private String homeVenue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getHomeVenue() {
		return homeVenue;
	}

	public void setHomeVenue(String homeVenue) {
		this.homeVenue = homeVenue;
	}

}
