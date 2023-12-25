public class HomeWork {
    public static void main(String[] args) {
        BaseHero prince = new Prince(1,1000,0);

        System.out.println(prince.getCurrentExperience());

        prince.CatchElf();

        System.out.println(prince.getCurrentExperience());

        prince.DestroyBuilding();

        System.out.println(prince.getCurrentExperience());

        prince.DestroyBuilding();

        System.out.println(prince.getCurrentExperience());

        System.out.println(prince.currentLevel());
    }
}
