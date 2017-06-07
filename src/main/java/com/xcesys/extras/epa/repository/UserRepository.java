package com.xcesys.extras.epa.repository;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.xcesys.extras.epa.entity.User;
import com.xcesys.extras.framework.core.repository.IBaseRepository;

@CacheConfig(cacheNames = "querycache")
public interface UserRepository extends IBaseRepository<User, Long> {

	@Cacheable
	User findByIdNotAndUsername(Long id, String username);

	@Cacheable
	User findByUsername(String username);

	long countByUsername(String username);

	@Modifying
	@Query("update #{#entityName} set password = :password where id in :ids")
	int resetpwd(@Param("ids") Long[] ids, @Param("password") String password);
}
