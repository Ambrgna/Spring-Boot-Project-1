package com.genspark.SpringBootdemoApplication.Controller;

import com.genspark.SpringBootdemoApplication.Entity.Album;
import com.genspark.SpringBootdemoApplication.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/album")
class AlbumController {

        @Autowired
        private AlbumService albumService;

        @GetMapping("/")
        public String home ()
        {
            return "<HTML><H1>Welcome to Album Application</H1><HTML>";
        }
        @GetMapping("/albums")
        public List<Album> getAlbum () {
            return this.albumService.getAllAlbums();
        }
        @GetMapping("/albums/{albumID}")
        public Album getAlbum (@PathVariable String albumID){
            return this.albumService.getAlbumById(Integer.parseInt(albumID));
        }
        @PostMapping("/albums")
        public Album addAlbum (@RequestBody Album album){
            return this.albumService.addAlbum(album);
        }
        @PutMapping("/albums")
        public Album updateAlbum (@RequestBody Album album){
            return this.albumService.updateAlbum(album);
        }
        @DeleteMapping("/albums/{albumID}")
        public String deleteAlbum (@PathVariable String albumID){
            return this.albumService.deleteAlbumById(Integer.parseInt(albumID));
        }
}
