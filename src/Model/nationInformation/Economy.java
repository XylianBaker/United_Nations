package Model.nationInformation;

/**
 * This class manages the menu with the economic commands for the nation.
 * @version 0.1
 * @author Jan Kammellander
 */
public class Economy implements EconomyInterface{
    private int land;
    private int farm;
    private int buildingSupplies;
    private int factories;

    public Economy() {
        land = 1000;
        farm = 0;
        buildingSupplies = 0;
        factories = 0;
    }

    public int getLand() {
        return land;
    }

    public void setLand(int land) {
        this.land = land;
    }

    public int getFarm() {
        return farm;
    }

    public void setFarm(int farm) {
        this.farm = farm;
    }

    public int getBuildingSupplies() {
        return buildingSupplies;
    }

    public void setBuildingSupplies(int buildingSupplies) {
        this.buildingSupplies = buildingSupplies;
    }

    public int getFactories() {
        return factories;
    }

    public void setFactories(int factories) {
        this.factories = factories;
    }

    /**
     * Command to buy land.
     *
     * @return How much land someone bought.
     */
    @Override
    public String buyLand() {
        return null;
    }

    /**
     * Command to buy farms.
     *
     * @return How much farms someone bought.
     */
    @Override
    public String buyFarm() {
        return null;
    }

    /**
     * Command to buy building supplies.
     *
     * @return How much building supplies someone bought.
     */
    @Override
    public String buyBrick() {
        return null;
    }

    /**
     * Command to buy factories.
     *
     * @return How much factories someone bought.
     */
    @Override
    public String buyFactory() {
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
     * @return How much you paid to someone else.
     */
    @Override
    public String pay() {
        return null;
    }

    /**
     * Command to demolish buildings.
     *
     * @return Which building you destroyed.
     */
    @Override
    public String demolish() {
        return null;
    }
}
