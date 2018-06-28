package com.thinkxfactor.zomatoplus.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;

public interface UserRepository extends JpaRepository<User,Long> {
	User findByNameAndPassword(String name,String passowrd);



}
