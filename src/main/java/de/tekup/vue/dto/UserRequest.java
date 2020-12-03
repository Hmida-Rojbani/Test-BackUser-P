package de.tekup.vue.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

	@NotBlank
	@Size(max = 50, min = 5)
	private String name;
	@Email
	private String email;
	@NotBlank
	private String password;

	private String gender;
	@Past
	private LocalDate birthDate;
	
	private boolean married;
	@NotBlank
	private String profession;
	
	private String note;
}
