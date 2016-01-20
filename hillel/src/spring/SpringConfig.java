package spring;

import org.springframework.context.annotation.*;
import spring.mediaval.DamselRescuingKnight;
import spring.mediaval.DamselRescuingQuest;
import spring.mediaval.DragonSlayQuest;
import spring.soundSystem.CdPlayer;
import spring.soundSystem.YellowSubmarineCD;

/**
 * Created by IMulyar on 28.12.2015.
 */

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    @Scope("prototype") // this shit makes bean NOT singleton BUT prototype
    public DamselRescuingKnight knight (){
        DamselRescuingKnight knight = new DamselRescuingKnight();
        return knight;
    }

    @Bean
    public DamselRescuingQuest quest (){
        return new DamselRescuingQuest();
    }


    @Bean
    @Primary
    public DragonSlayQuest dragonSlayQuest(){
        return new DragonSlayQuest();
    }

    /*@Bean
    YellowSubmarineCD yellowSubmarineCD(){
        return  new YellowSubmarineCD;
    }

    @Bean
    CdPlayer cdPlayer(){
        return new CdPlayer(yellowSubmarineCD());
    }*/


}
