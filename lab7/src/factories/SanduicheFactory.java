package factories;

import models.Sanduiche;
import models.SanduicheTipo;
import models.sanduiches.SanduicheEspecial;
import models.sanduiches.SanduicheLight;
import models.sanduiches.SanduicheVegetariano;

public class SanduicheFactory {
    public Sanduiche getSanduiche(SanduicheTipo tipo) {
        if (tipo == null) {
            return null;
        }

        if (SanduicheTipo.LIGHT == tipo) {
            return new SanduicheLight();
        } else if (SanduicheTipo.ESPECIAL == tipo) {
            return new SanduicheEspecial();
        } else if (SanduicheTipo.VEGETARIANO == tipo) {
            return new SanduicheVegetariano();
        } else {
            return null;
        }
    }
}
