package spring.mediaval;

/**
 * Created by IMulyar on 28.12.2015.
 */
public class DamselRescuingQuest implements Quest {

    @Override
    public void embark(){
        System.out.println("Damsel rescuing quest embarked!");
    }

    @Override
    public String toString() {
        return "DamselRescuingQuest{}";
    }
}
