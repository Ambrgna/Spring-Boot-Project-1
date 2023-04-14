package com.genspark.SpringBootdemoApplication.Service;

import com.genspark.SpringBootdemoApplication.Dao.AlbumDeo;
import com.genspark.SpringBootdemoApplication.Entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private AlbumDeo albumDeo;

    @Override
    public List<Album> getAllAlbums() {
        return this.albumDeo.findAll();
    }

    @Override
    public Album getAlbumById(int albumID) {
        Optional <Album> a = this.albumDeo.findById(albumID);
        Album album = null;
        if (a.isPresent()){
            album = a.get();
        } else {
            throw new RuntimeException(" Album not found for id :: " + albumID);
        }
        return album;
    }

    @Override
    public Album addAlbum(Album album) {
        return this.albumDeo.save(album);
    }

    @Override
    public Album updateAlbum(Album album) {
        return this.albumDeo.save(album);
    }

    @Override
    public String deleteAlbumById(int albumID) {
        this.albumDeo.deleteById(albumID);
        return "Deleted Successfully";
    }
}
