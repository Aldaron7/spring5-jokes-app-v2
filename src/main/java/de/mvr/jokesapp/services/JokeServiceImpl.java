package de.mvr.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService
{
  private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

  public JokeServiceImpl() {}

  @Override
  public String getJoke()
  {
    return chuckNorrisQuotes.getRandomQuote();
  }
}
