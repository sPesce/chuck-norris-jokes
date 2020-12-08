package spesce.springframework.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created By Steve P. on 12/8/2020
 * original package: spesce.springframework.chucknorrisjokes.services
 * ------------------------------------------------------------------------------------------
 */
public class QuoteService {
    public String getQuote(){
        ChuckNorrisQuotes quote = new ChuckNorrisQuotes();
        return quote.getRandomQuote();
    }
}
