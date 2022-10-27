package com.vinod.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord, Integer>
{

}
