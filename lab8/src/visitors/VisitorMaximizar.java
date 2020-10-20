package visitors;

import models.Circulo;
import models.Retangulo;
import models.Trapezio;
import models.Triangulo;

public class VisitorMaximizar implements Visitor {
    private static final double TAXA = 2.0;

    @Override
    public double visitarCirculo(Circulo c) {
        c.setRaio(TAXA * c.getRaio());

        return 0;
    }

    @Override
    public double visitarTriangulo(Triangulo t) {
        t.setA(TAXA * t.getA());
        t.setB(TAXA * t.getB());
        t.setC(TAXA * t.getC());

        return 0;
    }

    @Override
    public double visitarRetangulo(Retangulo r) {
        r.setAltura(TAXA * r.getAltura());
        r.setBase(TAXA * r.getBase());

        return 0;
    }

    @Override
    public double visitarTrapezio(Trapezio t) {
        t.setAltura(TAXA * t.getAltura());
        t.setBaseMenor(TAXA * t.getBaseMenor());
        t.setBaseMaior(TAXA * t.getBaseMaior());

        return 0;
    }
}
