package de.tekup.vue.data.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 50, unique = true)
	private String name;
	@Column(length = 50)
	private String email;
	@Column(length = 20)
	private String password;
	@Column(length = 8)
	private String gender;
	
	private LocalDate birthDate;
	
	private boolean married;
	@Column(length = 20)
	private String profession;
	@Column(length = 500)
	private String note;

}
