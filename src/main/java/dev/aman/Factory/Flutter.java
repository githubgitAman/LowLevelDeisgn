package dev.aman.Factory;

public class Flutter {
    //Non factory methods
    public void theme(){
        System.out.println("Flutter Theme");
    }
    //Factory Method
    public UIFactory getUIFactory(PlatformENUM platform){
       return UIFactoryFactory.getUIFactory(platform);
    }
}
