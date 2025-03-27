class Army 
{
    String country;
    int soldiers;
    String branch;
    String general;
    int tanks;
    int aircrafts;
    boolean hasNuclearWeapons;
    String specialForces;
    int budget;
    int ageRequirement;
    boolean isActive;

    Army() {
        System.out.println("No argument Constructor");
    }

    Army(String country) {
        this.country = country;
    }

    Army(String country, int soldiers) {
        this(country);
        this.soldiers = soldiers;
    }

    Army(String country, int soldiers, String branch) {
        this(country, soldiers);
        this.branch = branch;
    }

    Army(String country, int soldiers, String branch, String general) {
        this(country, soldiers, branch);
        this.general = general;
    }

    Army(String country, int soldiers, String branch, String general, int tanks) {
        this(country, soldiers, branch, general);
        this.tanks = tanks;
    }

    Army(String country, int soldiers, String branch, String general, int tanks, int aircrafts) {
        this(country, soldiers, branch, general, tanks);
        this.aircrafts = aircrafts;
    }

    Army(String country, int soldiers, String branch, String general, int tanks, int aircrafts, 
        boolean hasNuclearWeapons) 
    {
        this(country, soldiers, branch, general, tanks, aircrafts);
        this.hasNuclearWeapons = hasNuclearWeapons;
    }

    Army(String country, int soldiers, String branch, String general, int tanks, int aircrafts, 
        boolean hasNuclearWeapons, String specialForces) 
    {
        this(country, soldiers, branch, general, tanks, aircrafts, hasNuclearWeapons);
        this.specialForces = specialForces;
    }

    Army(String country, int soldiers, String branch, String general, int tanks, int aircrafts, 
        boolean hasNuclearWeapons, String specialForces, int budget) 
    {
        this(country, soldiers, branch, general, tanks, aircrafts, hasNuclearWeapons, specialForces);
        this.budget = budget;
    }

    Army(String country, int soldiers, String branch, String general, int tanks, int aircrafts,
     boolean hasNuclearWeapons, String specialForces, int budget, int ageRequirement, boolean isActive) 
    {
        this(country, soldiers, branch, general, tanks, aircrafts, hasNuclearWeapons, specialForces, budget);
        this.ageRequirement = ageRequirement;
        this.isActive = isActive;
    }

    void info() 
    {
        System.out.println("\nInstance variable information");

        System.out.println("Army country: " + this.country);
        System.out.println("Army soldiers: " + this.soldiers);
        System.out.println("Army branch: " + this.branch);
        System.out.println("Army general: " + this.general);
        System.out.println("Army tanks: " + this.tanks);
        System.out.println("Army aircrafts: " + this.aircrafts);
        System.out.println("Army hasNuclearWeapons: " + this.hasNuclearWeapons);
        System.out.println("Army specialForces: " + this.specialForces);
        System.out.println("Army budget: " + this.budget);
        System.out.println("Army ageRequirement: " + this.ageRequirement);
        System.out.println("Army isActive: " + this.isActive);
    }
}
