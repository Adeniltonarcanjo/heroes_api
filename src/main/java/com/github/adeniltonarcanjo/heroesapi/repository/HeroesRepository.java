package com.github.adeniltonarcanjo.heroesapi.repository;


import com.github.adeniltonarcanjo.heroesapi.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String>{
}
