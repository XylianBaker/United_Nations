package Model.nationInformation;

/**
 * This class manages the menu with the economic commands for the nation.
 * @version 0.1
 * @author Jan Kammellander
 */
public interface EconomyInterface {
    /**
     * Command to buy land.
     * @return How much land someone bought.
     */
    public String buyLand();

    /**
     * Command to buy farms.
     * @return How much farms someone bought.
     */
    public String buyFarm();

    /**
     * Command to buy building supplies.
     * @return How much building supplies someone bought.
     */
    public String buyBrick();

    /**
     * Command to buy factories.
     * @return How much factories someone bought.
     */
    public String buyFactory();

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
     * @return How much you paid to someone else.
     */
    public String pay();

    /**
     * Command to demolish buildings.
     * @return Which building you destroyed.
     */
    public String demolish();
}
