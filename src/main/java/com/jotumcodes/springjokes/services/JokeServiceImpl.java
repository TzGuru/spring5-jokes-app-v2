package com.jotumcodes.springjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by Emmanuel Jonas on 27/05/2021
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes =  new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
