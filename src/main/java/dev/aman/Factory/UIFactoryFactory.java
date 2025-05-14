package dev.aman.Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(PlatformENUM platform) {
        if(platform.equals(PlatformENUM.IOS))
            return new IOSUIFactory();
        else if(platform.equals(PlatformENUM.MAC))
            return new MACUIFactory();
        return null;
    }
}
