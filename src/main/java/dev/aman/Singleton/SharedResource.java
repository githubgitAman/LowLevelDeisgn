package dev.aman.Singleton;

import java.util.Objects;

import static java.lang.constant.ConstantDescs.NULL;

public class SharedResource {

    private static SharedResource sharedResource = null;
    private String name;
    private int age;

    private SharedResource() {
    }

    public static SharedResource getSharedResource() {
        if(sharedResource == null) {
            sharedResource =  new SharedResource();
        }
        return sharedResource;
    }
}
