package com.example.MoreCrud.dao;

import com.example.MoreCrud.entity.ChocolateBar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "sweets")
public interface ChocolateBarRepository extends JpaRepository<ChocolateBar, Integer> {

}
