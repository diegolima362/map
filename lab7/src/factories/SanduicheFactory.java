package factories;

import models.sanduiches.Sanduiche;
import models.sanduiches.SanduicheTipo;
import models.sanduiches.SanduicheCaipira;
import models.sanduiches.SanduicheIntegral;
import models.sanduiches.SanduicheCheddarNatural;

public class SanduicheFactory {
    public Sanduiche getSanduiche(SanduicheTipo tipo) {
        if (tipo == null) {
            return null;
        }

        if (SanduicheTipo.INTEGRAL == tipo) {
            return new SanduicheIntegral();
        }

        if (SanduicheTipo.CAIPIRA == tipo) {
            return new SanduicheCaipira();
        } 

        if (SanduicheTipo.CHEDDAR_NATURAL == tipo) {
            return new SanduicheCheddarNatural();
        }

        return null;
    }
}
