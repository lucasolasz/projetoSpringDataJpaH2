package br.com.embratel.springApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.embratel.springApp.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
