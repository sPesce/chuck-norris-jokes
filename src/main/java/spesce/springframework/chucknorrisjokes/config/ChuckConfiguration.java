package spesce.springframework.chucknorrisjokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created By Steve P. on 12/22/2020
 * original package: spesce.springframework.chucknorrisjokes.config
 * ------------------------------------------------------------------------------------------
 */

//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
