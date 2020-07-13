package com.company;

public class Sender implements Runnable {
    Postamat postamat;

    public Sender(Postamat postamat) {
        this.postamat = postamat;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 1; ; i++) {
            postamat.put(new Parcel("Посылка " + i));
        }
    }
}
