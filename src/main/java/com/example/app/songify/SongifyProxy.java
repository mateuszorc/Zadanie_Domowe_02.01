package com.example.app.songify;

import com.example.app.songify.dto.request.CreateSongRequestDto;
import com.example.app.songify.dto.request.PartiallyUpdateSongRequestDto;
import com.example.app.songify.dto.request.UpdateSongRequestDto;
import com.example.app.songify.dto.response.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(value = "songify-client")
public interface SongifyProxy {

    @GetMapping
    public GetAllSongsResponseDto getAllSongs(
    );

    @GetMapping
    public GetAllSongsResponseDto getAllSongs(
            @RequestParam(required = false) Integer limit
    );

    @GetMapping("/{id}")
    public GetSongByIdResponseDto getSongById(
            @PathVariable("id") Integer id
    );

    @PostMapping
    public CreateSongResponseDto postSong(
            @RequestBody CreateSongRequestDto requestDto
    );

    @PutMapping("/{id}")
    public UpdateSongResponseDto updateSong(
        @PathVariable("id") Integer id,
        @RequestBody UpdateSongRequestDto requestDto
    );

    @PatchMapping("/{id}")
    public PartiallyUpdateSongResponseDto partiallyUpdateSong(
            @PathVariable("id") Integer id,
            @RequestBody PartiallyUpdateSongRequestDto requestDto
    );

    @DeleteMapping("/{id}")
    public DeleteSongResponseDto deleteSongById(
            @PathVariable("id") Integer id
    );
}
