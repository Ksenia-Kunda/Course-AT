package com.company;

import musician.Guitarist;
import musician.Musician;
import musician.Pianist;

public class Main {

    public static void main(String[] args) {

        Musician pianist = new Pianist();
        pianist.pushAKey();

        Guitarist guitarist = new Guitarist();
        guitarist.pushAKey();
    }
}
