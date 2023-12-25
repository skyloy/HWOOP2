public abstract class BaseHero extends Handler {
    private int currentLevel;
    private int levelExperience;
    private int currentExperience;

    public BaseHero(int currentLevel, int levelExperience, int currentExperience) {
        this.currentLevel = currentLevel;
        this.levelExperience = levelExperience;
        this.currentExperience = currentExperience;
    }

    @Override
    public int currentExperience() {
        return currentExperience;
    }

    @Override
    public int levelExperience() {
        return levelExperience;
    }

    @Override
    public int currentLevel() {
        return currentLevel;
    }

    @Override
    public int getCurrentLevel() {
        return currentLevel;
    }

    @Override
    public int getLevelExperience() {
        return levelExperience;
    }

    @Override
    public int getCurrentExperience() {
        return currentExperience;
    }

    @Override
    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public void setLevelExperience(int levelExperience) {
        this.levelExperience = levelExperience;
    }

    @Override
    public void setCurrentExperience(int currentExperience) {
        this.currentExperience = currentExperience;
    }
}
