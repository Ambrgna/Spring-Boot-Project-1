package com.genspark.SpringBootdemoApplication.Dao;


import com.genspark.SpringBootdemoApplication.Entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumDeo extends JpaRepository<Album, Integer> {
}
