package test;

import Model.nationInformation.Economy;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class EconomyTest {
    Economy economy = new Economy();

    @Test
    public void buyLand() {
        assertEquals("You have just bought 100 of land 🏔\n\nYou now own 1100 of land 🏞",
                economy.buyLand(100));
    }

    @Test
    public void buyFarm() {
        assertEquals("You have just bought 100 of farms 🚜.\n\nYou now own 100 of farmland 🌽.",
                economy.buyFarm(100));
    }

    @Test
    public void buyBrick() {
        assertEquals("You have just bought 100 of building supplies 🧱.\n\nYou know own 100 of building" +
                " supplies 🏗.", economy.buyBrick(100));
    }

    @Test
    public void buyFactory() {
        assertEquals("You have just bought 100 of factories 👷‍♂.\n\nYou now own 100 of factories 🏭.",
                economy.buyFactory(100));
    }
}