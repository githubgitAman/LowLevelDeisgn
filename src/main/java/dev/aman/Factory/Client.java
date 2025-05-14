package dev.aman.Factory;

import dev.aman.Factory.Button.Button;
import dev.aman.Factory.Menu.Menu;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(PlatformENUM.MAC);

        Button button = uiFactory.createButton();
        button.showButton();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}
