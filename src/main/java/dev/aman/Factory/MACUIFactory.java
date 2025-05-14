package dev.aman.Factory;

import dev.aman.Factory.Button.Button;
import dev.aman.Factory.Button.MACButton;
import dev.aman.Factory.Menu.MACMenu;
import dev.aman.Factory.Menu.Menu;

public class MACUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MACButton();
    }

    @Override
    public Menu createMenu() {
        return new MACMenu();
    }
}
