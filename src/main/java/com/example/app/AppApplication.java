package com.example.app;

import com.example.app.songify.SongifyProxy;
import com.example.app.songify.dto.request.PartiallyUpdateSongRequestDto;
import feign.FeignException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableFeignClients
@Log4j2
public class AppApplication {

//    @Autowired
//    ItunesProxy itunesClient;
//
//    @Autowired
//    SampleShawnMendesServerProxy sampleShawnMendesServerProxy;

    private final SongifyProxy songifyProxy;

    @Autowired
    public AppApplication(SongifyProxy songifyProxy) {
        this.songifyProxy = songifyProxy;
    }

//    Logger log = getLogger(AppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

    @EventListener(ApplicationStartedEvent.class)
    public void run() {
        try {
//            ItunesResponse response = itunesClient.search("shawnmendes", 5);
//            log.info(sampleShawnMendesServerProxy.fetchAllSongs("id1"));
//            log.info(sampleShawnMendesServerProxy.addSong(new SampleShawnMendesRequest("In My Blood")));
//            log.info(sampleShawnMendesServerProxy.addSong(new SampleShawnMendesRequest("Stitches")));
//            sampleShawnMendesServerProxy.deleteSongByPathVariableId("0");
//            log.info(sampleShawnMendesServerProxy.fetchAllSongs("id2"));
//            response.results().forEach(shawnMendesResult -> System.out.println(shawnMendesResult.trackName()));
            ///////////
//            log.info(songifyProxy.getAllSongs());
//            log.info(songifyProxy.getSongById(1));
//            CreateSongRequestDto dto = new CreateSongRequestDto("New Song1", "New Artist 1");
//            log.info(songifyProxy.postSong(dto));

//            log.info(songifyProxy.updateSong(5, new UpdateSongRequestDto("updated song 1", "updated artist 1")));
//            log.info(songifyProxy.partiallyUpdateSong(4, new PartiallyUpdateSongRequestDto(null, "updated artist 2")));
            log.info(songifyProxy.deleteSongById(4));
            log.info(songifyProxy.getAllSongs());
        } catch (FeignException.FeignClientException feignException) {
            System.out.println("Client exception: " + feignException.status());
            log.warn("Client exception: " + feignException.status());
        } catch (FeignException.FeignServerException feignException) {
            System.out.println("Server exception: " + feignException.status());
        }

    }
}
