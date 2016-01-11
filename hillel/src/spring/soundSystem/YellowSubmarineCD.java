package spring.soundSystem;

import org.springframework.stereotype.Component;

/**
 * Created by IMulyar on 11.01.2016.
 */

@Component
public class YellowSubmarineCD implements CD {

    @Override
    public void play() {
        System.out.println("We all live in a yellow submarine....");
    }
}
