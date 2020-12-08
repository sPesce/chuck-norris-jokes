package spesce.springframework.chucknorrisjokes.controllers;

import spesce.springframework.chucknorrisjokes.services.QuoteService;

/**
 * Created By Steve P. on 12/8/2020
 * original package: spesce.springframework.chucknorrisjokes.controllers
 * ------------------------------------------------------------------------------------------
 */
public class QuotesController {

    private final QuoteService quoteService;

    public QuotesController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    //TODO: context root, map joke to model, return chuknorris view, thymeleaf view
}
