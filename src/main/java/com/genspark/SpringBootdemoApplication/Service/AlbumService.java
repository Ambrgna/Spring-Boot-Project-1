package com.genspark.SpringBootdemoApplication.Service;

import com.genspark.SpringBootdemoApplication.Entity.Album;

import java.util.List;

public interface AlbumService {

    List<Album> getAllAlbums();
    Album getAlbumById(int albumID);
    Album addAlbum(Album album);
    Album updateAlbum(Album album);
    String deleteAlbumById(int albumID);
}
