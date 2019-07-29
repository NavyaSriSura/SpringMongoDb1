package com.stackroute.SpringBootTask.repository;

import com.stackroute.SpringBootTask.domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;
import java.util.List;

public interface MusicRepository extends MongoRepository<Music, Integer> {
    /*@Query(
            value = "SELECT * FROM MUSIC",
            nativeQuery = true)
    Collection<Music> findAllActiveUsers();*/

    @Query("{name:'?0'")
    List<Music> findTitleByName(String name);
}
