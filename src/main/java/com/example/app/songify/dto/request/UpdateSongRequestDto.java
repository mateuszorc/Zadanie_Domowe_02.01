package com.example.app.songify.dto.request;

public record UpdateSongRequestDto(
//        @NotNull(message = "name must not be null")
//        @NotBlank(message = "name must not be empty")
        String name,

//        @NotNull(message = "artist must not be null")
//        @NotBlank(message = "artist must not be empty")
        String artist
) {
}
