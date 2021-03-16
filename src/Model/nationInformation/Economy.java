package Model.nationInformation;

/**
 * This class manages the menu with the economic commands for the nation.
 * @version 0.1
 * @author Jan Kammellander
 */
public class Economy implements EconomyInterface {
    private int land;
    private int farm;
    private int buildingSupplies;
    private int factories;

    /**
     * Constructor
     */
    public Economy() {
        land = 1000;
        farm = 0;
        buildingSupplies = 0;
        factories = 0;
    }

    public int getLand() {
        return land;
    }

    public int getFarm() {
        return farm;
    }

    public int getBuildingSupplies() {
        return buildingSupplies;
    }

    public int getFactories() {
        return factories;
    }

    /**
     * Command to buy land.
     *
     * @param amount The amount of land.
     * @return How much land someone bought.
     */
    @Override
    public String buyLand(int amount) {
        land += amount;
        return "You have just bought " + amount + " of land 🏔\n\nYou now own " + land + " of land 🏞";
    }

    /**
     * Command to buy farms.
     *
     * @param amount The amount of farms.
     * @return How much farms someone bought.
     */
    @Override
    public String buyFarm(int amount) {
        farm += amount;
        return "You have just bought " + amount + " of farms 🚜.\n\nYou now own " + farm + " of farmland 🌽.";
    }

    /**
     * Command to buy building supplies.
     *
     * @param amount The amount of building supplies.
     * @return How much building supplies someone bought.
     */
    @Override
    public String buyBrick(int amount) {
        buildingSupplies = amount;
        return "You have just bought " + amount + " of building supplies 🧱.\n\nYou know own " +
                buildingSupplies + " of building supplies 🏗.";
    }

    /**
     * Command to buy factories.
     *
     * @param amount The amount of factories.
     * @return How much factories someone bought.
     */
    @Override
    public String buyFactory(int amount) {
        factories = amount;
        return "You have just bought " + amount + " of factories 👷‍♂.\n\nYou now own " + factories + " of factories 🏭.";
    }

    // TODO: Make a class for the prices.
    /**
     * Command to view the prices of the nation.
     *
     * @return Prices of the nation.
     */
    @Override
    public String prices() {
        return null;
    }

    // TODO: Make a class for the blackmarket.
    /**
     * Command to display the black market of the nation.
     *
     * @return Display the black-market of the nation.
     */
    @Override
    public String blackMarket() {
        return null;
    }

    // TODO: Make the game a multiplayer.
    /**
     * Command to pay someone else.
     *
     * @param amount The amount of money.
     * @return How much you paid to someone else.
     */
    @Override
    public String pay(int amount) {
        return null;
    }

    // TODO: find out what you want do demolish, maybe add a second parameter.
    /**
     * Command to demolish buildings.
     *
     * @param building The building to demolish.
     * @return Which building you destroyed.
     */
    @Override
    public String demolish(String building, int amount) {
        switch (building) {
            case "land" -> {
                land -= amount;
                return "You just deleted " + amount + " of land🏞.";
            }
            case "farm" -> {
                farm -= amount;
                return "You just deleted " + amount + " of farms🌽.";
            }
            default -> {
                return "The building doesn't exist!😒";
            }
        }
    }
}
