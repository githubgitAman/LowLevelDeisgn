package dev.aman.Singleton;

public class Client {
    public static void main(String[] args) {

        SharedResource shared = SharedResource.getSharedResource();
        SharedResource shared2 = SharedResource.getSharedResource();
        System.out.println(shared);
        System.out.println(shared2);

    }
}
