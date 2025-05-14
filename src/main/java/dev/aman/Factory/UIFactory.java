package dev.aman.Factory;

import dev.aman.Factory.Button.Button;
import dev.aman.Factory.Menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
}
