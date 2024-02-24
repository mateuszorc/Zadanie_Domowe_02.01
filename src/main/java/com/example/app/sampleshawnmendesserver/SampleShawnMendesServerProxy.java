package com.example.app.sampleshawnmendesserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "sample-shawn-mendes-server-client")
public interface SampleShawnMendesServerProxy {

    @GetMapping("/shawn/songs")
    SampleShawnMendesServerResponse fetchAllSongs(@RequestHeader String requestId);

    @PostMapping("/shawn/songs")
    SampleShawnMendesServerResponse addSong(@RequestBody SampleShawnMendesRequest request);

    @DeleteMapping("/shawn/songs/{songId}")
    void deleteSongByPathVariableId(@PathVariable String songId);

    @DeleteMapping("/shawn/songs")
    void deleteSongByQueryParamId(@RequestParam(name = "id") String songId);
}
