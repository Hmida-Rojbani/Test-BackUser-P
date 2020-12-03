package de.tekup.vue.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekup.vue.data.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
