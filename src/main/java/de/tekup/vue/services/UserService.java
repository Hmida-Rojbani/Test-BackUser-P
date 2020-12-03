package de.tekup.vue.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import de.tekup.vue.data.models.User;
import de.tekup.vue.data.repositories.UserRepository;
import de.tekup.vue.dto.UserRequest;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	private UserRepository reposUser;
	private ModelMapper mapper;
	
	public UserRequest saveUser(UserRequest request) {
		User user = mapper.map(request, User.class);
		user = reposUser.save(user);
		
		return mapper.map(user, UserRequest.class);
	}
}
