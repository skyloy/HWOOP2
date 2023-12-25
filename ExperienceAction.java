import com.sun.source.tree.UsesTree;

public interface ExperienceAction {
    int currentLevel();
    int currentExperience();
    int levelExperience();

    // текущий уровень
    default int getCurrentLevel(){
        return currentLevel();
    }
    // кол-во опыта, необходимое для достижения следующего уровня
    default int getLevelExperience(){
        return levelExperience();
    }
    // кол-во опыта на текущем уровне
    default int getCurrentExperience(){
        return currentExperience();
    }
    // обновляет текущий уровень
    void setCurrentLevel(int level);
    // обновляет текущее количество очков опыта на текущем уровне
    void setCurrentExperience(int exp);
}
