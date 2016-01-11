package spring.mediaval;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IMulyar on 28.12.2015.
 */
public class DamselRescuingKnight {
    private Quest quest;

    @Autowired
    //@Qualifier("quest")
    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void embarkQuest(){
        quest.embark();
    }

    @Deprecated
    public void deprecatedMethod(){
        System.out.println("Deprecated method called");
    }
}
