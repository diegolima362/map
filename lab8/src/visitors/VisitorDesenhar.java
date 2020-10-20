package visitors;

import models.Circulo;
import models.Retangulo;
import models.Trapezio;
import models.Triangulo;

public class VisitorDesenhar implements Visitor {
    @Override
    public double visitarCirculo(Circulo c) {
        System.out.println(c.toString());
        return 0;
    }

    @Override
    public double visitarTriangulo(Triangulo t) {
        System.out.println(t.toString());
        return 0;
    }

    @Override
    public double visitarRetangulo(Retangulo r) {
        System.out.println(r.toString());
        return 0;
    }

    @Override
    public double visitarTrapezio(Trapezio t) {
        System.out.println(t.toString());
        return 0;
    }
}
