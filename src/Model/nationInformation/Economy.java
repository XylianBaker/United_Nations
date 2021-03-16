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

    /**
     * Command to buy land.
     *
     * @param amount The amount of land.
     * @return How much land someone bought.
     */
    @Override
    public String buyLand(int amount) {
        return null;
    }

    /**
     * Command to buy farms.
     *
     * @param amount The amount of farms.
     * @return How much farms someone bought.
     */
    @Override
    public String buyFarm(int amount) {
        return null;
    }

    /**
     * Command to buy building supplies.
     *
     * @param amount The amount of building supplies.
     * @return How much building supplies someone bought.
     */
    @Override
    public String buyBrick(int amount) {
        return null;
    }

    /**
     * Command to buy factories.
     *
     * @param amount The amount of factories.
     * @return How much factories someone bought.
     */
    @Override
    public String buyFactory(int amount) {
        return null;
    }

    /**
     * Command to view the prices of the nation.
     *
     * @return Prices of the nation.
     */
    @Override
    public String prices() {
        return null;
    }

    /**
     * Command to display the black market of the nation.
     *
     * @return Display the black-market of the nation.
     */
    @Override
    public String blackMarket() {
        return null;
    }

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

    /**
     * Command to demolish buildings.
     *
     * @param building The building to demolish.
     * @return Which building you destroyed.
     */
    @Override
    public String demolish(String building) {
        return null;
    }
}
