package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IMulyar on 28.12.2015.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DamselRescuingKnight knight = context.getBean(DamselRescuingKnight.class);
        Quest quest = (DamselRescuingQuest) context.getBean("quest");

        quest = context.getBean(Quest.class);
        quest = context.getBean(DamselRescuingQuest.class);

        knight.embarkQuest();
    }
}
