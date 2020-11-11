package com.miniproj.a4.crimems.repository;
import org.springframework.data.repository.CrudRepository;

import com.miniproj.a4.crimems.entity.Criminal;

public interface CriminalRepository extends CrudRepository<Criminal, Integer> {

}