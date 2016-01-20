package spring.soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by IMulyar on 11.01.2016.
 */

@Component("sony")
@Scope("prototype") // this shit makes bean NOT singleton
public class CdPlayer {

    @Autowired(required = true)// not recommended. it should be better to use constructor and setters
    private CD disc;

    /*@Autowired
    public CdPlayer(CD disc) {
        this.disc = disc;
    }*/

    public void play(){
        disc.play();
    }
}
