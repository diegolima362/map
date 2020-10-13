package main;

import factories.SanduicheFactory;
import models.Sanduiche;
import models.SanduicheTipo;

public class Main {

    public static void main(String[] args) {
        SanduicheFactory factory = new SanduicheFactory();

        Sanduiche s1 = factory.getSanduiche(SanduicheTipo.LIGHT);
        System.out.println(s1.toString());

        Sanduiche s2 = factory.getSanduiche(SanduicheTipo.VEGETARIANO);
        System.out.println(s2.toString());

        Sanduiche s3 = factory.getSanduiche(SanduicheTipo.ESPECIAL);
        System.out.println(s3.toString());
    }
}
