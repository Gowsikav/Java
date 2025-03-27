public class ArmyRunner 
{
    public static void main(String[] args) 
    {
        String country = "India";
        int soldiers = 1500000;
        String branch = "Infantry";
        String general = "Vinoth";
        int tanks = 3000;
        int aircrafts = 5000;
        boolean hasNuclearWeapons = true;
        String specialForces = "Navy SEAL";
        int budget = 700000000;
        int ageRequirement = 18;
        boolean isActive = true;

        Army army = new Army();
        army.info();

        Army army1 = new Army(country);
        army1.info();

        Army army2 = new Army(country, soldiers);
        army2.info();

        Army army3 = new Army(country, soldiers, branch);
        army3.info();

        Army army4 = new Army(country, soldiers, branch, general);
        army4.info();

        Army army5 = new Army(country, soldiers, branch, general, tanks);
        army5.info();

        Army army6 = new Army(country, soldiers, branch, general, tanks, aircrafts);
        army6.info();

        Army army7 = new Army(country, soldiers, branch, general, tanks, aircrafts, hasNuclearWeapons);
        army7.info();

        Army army8 = new Army(country, soldiers, branch, general, tanks, aircrafts, hasNuclearWeapons, specialForces);
        army8.info();

        Army army9 = new Army(country, soldiers, branch, general, tanks, aircrafts, hasNuclearWeapons, specialForces, budget);
        army9.info();

        Army army10 = new Army(country, soldiers, branch, general, tanks, aircrafts, hasNuclearWeapons, specialForces, budget, ageRequirement, isActive);
        army10.info();
    }
}
