package visitors;

import models.Circulo;
import models.Retangulo;
import models.Trapezio;
import models.Triangulo;

public interface Visitor {

    double visitarCirculo(Circulo c);

    double visitarTriangulo(Triangulo t);

    double visitarRetangulo(Retangulo r);

    double visitarTrapezio(Trapezio t);
}
