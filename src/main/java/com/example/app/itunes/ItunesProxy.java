package com.example.app.itunes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "itunes-client")
public interface ItunesProxy {

    // GET https://itunes.apple.com/search?term=shawnmendes&limit=1
    @GetMapping("/search")
    ItunesResponse search(
            @RequestParam("term") String term,
            @RequestParam("limit") Integer limit
    );
}
