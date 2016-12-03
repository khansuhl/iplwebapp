package org.bridgelabz.iplwebapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PlayerList")
public class Player {

	public Player() {

	}

	public Player(Integer id, Integer teamId, String name, String image, String role, String battingStyle,
			String bowlingStyle, String nationality, String DOB) {

		setId(id);
		setTeamId(teamId);
		setName(name);
		setImage(image);
		setRole(role);
		setBattingStyle(battingStyle);
		setBowlingStyle(bowlingStyle);
		setNationality(nationality);
		setDateOfBirth(DOB);
	}

	@Id
	@GenericGenerator(name = "gene", strategy = "increment")
	@GeneratedValue(generator = "gene")
	@Column(name = "ID")
	private int id;

	@Id
	@Column(name = "Team ID")
	private int teamId;

	@Column(name = "Name")
	private String name;

	@Column(name = "Image URL")
	private String image;

	@Column(name = "Role")
	private String role;

	@Column(name = "Batting Style")
	private String battingStyle;

	@Column(name = "Bowling Style")
	private String bowlingStyle;

	@Column(name = "Nationality")
	private String nationality;

	@Column(name = "Date Of Birth")
	private String DOB;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeamId() {
		return id;
	}

	public void setTeamId(int teamId) {
		this.teamId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDateOfBirth() {
		return DOB;
	}

	public void setDateOfBirth(String DOB) {
		this.DOB = DOB;
	}
}