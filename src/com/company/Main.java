package com.company;

public class Main {

    public static void main(String[] args) {

        Postamat postamat = new Postamat();

        new Sender(postamat);
        new Receiver(postamat);

    }
}
