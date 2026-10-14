
/*
Name: Blake Lacroix
Description: This program calculates the cost to create a user inputed amount of potion desired
*/

public class PotionCalculator {

    // This method calculates the number of bags of mushroom powder needed
    public static int bagsOfMushroomPowder(int healthPotions, int manaPotions) {
        double healthMushroomPowder = (2.0 / 12.0) * healthPotions; // Cups per health potion
        double manaMushroomPowder = ((2 + 1/3.0) / 8.0) * manaPotions;     // Cups per mana potion
        double totalCups = healthMushroomPowder + manaMushroomPowder;
        double totalPounds = totalCups / 1.5; // Convert cups to pounds
        return (int) Math.ceil(totalPounds / 4.0); // Convert pounds to bags
    }

    // method calculates the number of cartons of radishes needed
    public static int cartonsOfRadishes(int healthPotions, int manaPotions) {
        double healthRadishes = (3.0 / 12.0) * healthPotions; // Radishes per health potion
        return (int) Math.ceil(healthRadishes / 12.0); // 1 carton = 12 radishes
    }

    // method calculates the number of pouches of acorns needed
    public static int pouchesOfAcorns(int healthPotions, int manaPotions) {
        double manaAcorns = (0.5 / 8.0) * manaPotions; // Teaspoons per mana potion
        return (int) Math.ceil(manaAcorns / 4.0); // 1 pouch = 4 acorns
    }

    // method calculates the number of containers of ruby dust needed
    public static int containersOfRubyDust(int healthPotions, int manaPotions) {
        double healthRubyDust = (2.0 / 12.0) * healthPotions; // Teaspoons per health potion
        double totalOunces = healthRubyDust / 3.0; // 1 oz = 3 tsp
        return (int) Math.ceil(totalOunces / 2.0); // 1 container = 2 oz
    }

    // method calculates the number of containers of sapphire dust needed
    public static int containersOfSapphireDust(int healthPotions, int manaPotions) {
        double manaSapphireDust = (4.0 / 8.0) * manaPotions; // Teaspoons per mana potion
        double totalOunces = manaSapphireDust / 3.0; // 1 oz = 3 tsp
        return (int) Math.ceil(totalOunces / 2.0); // 1 container = 2 oz
    }

    // method calculates the number of bags of mint needed
    public static int bagsOfMint(int healthPotions, int manaPotions) {
        double healthMint = (1.5 / 12.0) * healthPotions; // Cups per health potion
        double manaMint = (2.0 / 8.0) * manaPotions;      // Cups per mana potion
        double totalCups = healthMint + manaMint;
        return (int) Math.ceil(totalCups / 2.0); // 1 bag = 2 cups
    }

    // method calculates the number of bottles of solvent needed
    public static int bottlesOfSolvent(int healthPotions, int manaPotions) {
        double healthSolvent = (5.25 / 12.0) * healthPotions; // Cups per health potion
        double manaSolvent = (4.0 / 8.0) * manaPotions;       // Cups per mana potion
        double totalLiters = (healthSolvent + manaSolvent) / 4.22675; // Convert cups to liters
        return (int) Math.ceil(totalLiters / 5.0); // 1 bottle = 5 liters
    }

    // method calculates the total cost of purchasing all ingredients
    public static double totalCost(int healthPotions, int manaPotions) {
        double costOfMushroomPowder = 5.85; // 4 lb bag
        double costOfRadishes = 1.49;       // 12 radishes carton
        double costOfAcorns = 0.49;         // 4 acorns pouch
        double costOfRubyDust = 12.99;      // 2 oz container
        double costOfSapphireDust = 14.99;  // 2 oz container
        double costOfMint = 4.79;           // 2 cup bag
        double costOfSolvent = 8.99;        // 5 liter bottle

        // Total cost calculation using the above ingredient methods
        double total = (bagsOfMushroomPowder(healthPotions, manaPotions) * costOfMushroomPowder) +
                       (cartonsOfRadishes(healthPotions, manaPotions) * costOfRadishes) +
                       (pouchesOfAcorns(healthPotions, manaPotions) * costOfAcorns) +
                       (containersOfRubyDust(healthPotions, manaPotions) * costOfRubyDust) +
                       (containersOfSapphireDust(healthPotions, manaPotions) * costOfSapphireDust) +
                       (bagsOfMint(healthPotions, manaPotions) * costOfMint) +
                       (bottlesOfSolvent(healthPotions, manaPotions) * costOfSolvent);

        return total; // Return the total cost
    }

   
}



