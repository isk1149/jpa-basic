package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/*
@Entity
@SequenceGenerator( 
		 name = "MEMBER_SEQ_GENERATOR", 
		 sequenceName = "MEMBER_SEQ", //매핑할 데이터베이스 시퀀스 이름
		 initialValue = 1, allocationSize = 50)
public class Member {
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, 
	 generator = "MEMBER_SEQ_GENERATOR")
	private Long id;
	
	@Column(name="name")
	private String username;
	
	
	public Member() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
*/
