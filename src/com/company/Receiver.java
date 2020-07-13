package com.company;

public class Receiver implements Runnable {
    Postamat postamat;

    public Receiver(Postamat postamat) {
        this.postamat = postamat;
        new Thread(this).start();
    }


    @Override
    public void run() {
        while (true){
            postamat.get();
        }
    }
}
