package model.listener;

import java.util.EventListener;
import model.source.CadeiraEvent;

public interface CadeiraListener extends EventListener {
    public void mudancaNasCadeiras(CadeiraEvent event);
}
