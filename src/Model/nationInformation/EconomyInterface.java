package Model.nationInformation;

/**
 * This class manages the menu with the economic commands for the nation.
 * @version 0.1
 * @author Jan Kammellander
 */
public interface EconomyInterface {
    /**
     * Command to buy land.
     * @param amount The amount of land.
     * @return How much land someone bought.
     */
    public String buyLand(int amount);

    /**
     * Command to buy farms.
     * @param amount The amount of farms.
     * @return How much farms someone bought.
     */
    public String buyFarm(int amount);

    /**
     * Command to buy building supplies.
     * @param amount The amount of building supplies.
     * @return How much building supplies someone bought.
     */
    public String buyBrick(int amount);

    /**
     * Command to buy factories.
     * @param amount The amount of factories.
     * @return How much factories someone bought.
     */
    public String buyFactory(int amount);

    /**
     * Command to view the prices of the nation.
     * @return Prices of the nation.
     */
    public String prices();

    /**
     * Command to display the black market of the nation.
     * @return Display the black-market of the nation.
     */
    public String blackMarket();

    /**
     * Command to pay someone else.
     * @param amount The amount of money.
     * @return How much you paid to someone else.
     */
    public String pay(int amount);

    /**
     * Command to demolish buildings.
     * @param building The building to demolish.
     * @return Which building you destroyed.
     */
    public String demolish(String building);
}
