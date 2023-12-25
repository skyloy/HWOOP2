public interface ExperienceFromEvent extends ExperienceAction {
    //кол-во очков опыта для зачисления, которое дает данное событие
    int getExperience(int exp);
    // победить врага
    default int DefeatEnemy(){
        return getExperience(100);
    }
    // разрушить здание
    default int DestroyBuilding(){
        return getExperience(500);
    }
    // поймать эльфа
    default int CatchElf(){
        return getExperience(50);
    }

}
