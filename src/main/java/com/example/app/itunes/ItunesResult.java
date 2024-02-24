package com.example.app.itunes;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public record ItunesResult(String wrapperType,
                           String trackName,
                           String artistName) {
}
