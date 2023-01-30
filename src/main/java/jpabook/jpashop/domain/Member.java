package jpabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Member {

	@Id @GeneratedValue
	@Column(name="MEMBER_ID")
	private Long id;
	private String name;
	private String city;
	private String street;
	private String zipcode;
	
	/* 강의하시는 분 생까으로는 멤버를 통해서 주문을 찾기 보다는 바로 주문으로 가서 멤버 아이디에 맞는 주문을 찾는 게 맞다고 함
	 * 즉, 기초 테이블부터 시작해서 연관 테이블을 찾아갈 필요가 없다는 것.
	@OneToMany(mappedBy="member")
	private List<Order> list = new ArrayList<>();
	*/
	
	/*
	// N:1 
	@ManyToOne
	@JoinColumn(name="TEAM_ID")
	private Team team;
	*/
	
	public Member() {}
	
	public Member(String name, String city, String street, String zipcode) {
		super();
		this.name = name;
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/*
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	*/
}
