package Model;

/**
 * This class contains all information about someones nation and it's statistics.
 * @version 0.1
 * @author Jan Kammellander
 */
public interface NationInterface {
    /**
     * Displays all statistics of the nation or country.
     * @return Statistics of the nation or country.
     */
    public String stats();

    /**
     * Displays all commands available for the nation.
     * @return All available commands of the nation.
     */
    public String help();

    /**
     * Updates the statistics of the nation.
     */
    public void update();

    /**
     * This Method displays all cities within the nation and options for all of them.
     * @return All cities in the nation and the commands for them.
     */
    public String cities();

    /**
     * Displays the resource options of the nation.
     * @return The resource option of the nation.
     */
    public String resource();

    /**
     * Displays the military and all choices for them.
     * @return The military and the commands for them.
     */
    public String military();

    /**
     * Displays the menu to customize the government.
     * @return Menu to customize the government.
     */
    public String government();

    /**
     * Displays the diplomatic menu.
     * @return Menu for diplomacy.
     */
    public String diplomacy();

    /**
     * Displays personalised options for the nation.
     * @return Personalised options for the nation.
     */
    public String personalisation();

    /**
     * Displays the settings option for the nation.
     * @return The settings option for the nation.
     */
    public String settings();
}
