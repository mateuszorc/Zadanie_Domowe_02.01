package com.example.app.songify.dto.response;

import com.example.app.songify.dto.Song;

import java.util.Map;

public record GetAllSongsResponseDto(Map<Integer, Song> songs) {
}
