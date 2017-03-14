package com.xcesys.extras.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xcesys.extras.entity.RememberMeToken;

public interface RememberMeTookenRepository extends JpaRepository<RememberMeToken, Long> {

	RememberMeToken findBySeries(String series);

	List<RememberMeToken> findByUsername(String username);

}
