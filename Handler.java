public abstract class Handler implements ExperienceAction,ExperienceFromEvent {
    @Override
    public int getExperience(int exp) {
        if (currentExperience() + exp > levelExperience()){
            // получаем количество уровней, на которое увеличим текущий level
            int level = (currentExperience() + exp) / levelExperience();
            setCurrentLevel(getCurrentLevel() + level);
            setCurrentExperience(currentExperience() + exp - levelExperience());
            return currentExperience();
        }
        setCurrentExperience(currentExperience() + exp);
        return currentExperience();
    }

    @Override
    public int DefeatEnemy() {
        return ExperienceFromEvent.super.DefeatEnemy();
    }

    @Override
    public int DestroyBuilding() {
        return ExperienceFromEvent.super.DestroyBuilding();
    }

    @Override
    public int CatchElf() {
        return ExperienceFromEvent.super.CatchElf();
    }
}
