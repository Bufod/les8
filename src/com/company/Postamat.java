package com.company;

public class Postamat {
    Parcel parcel;

    synchronized boolean get() {
        System.out.println("Получили: " + parcel);
//        parcel = null;
        return true;
    }

    synchronized void put(Parcel parcel){
        this.parcel = parcel;
        System.out.println("Положили: " + parcel);
    }
}
