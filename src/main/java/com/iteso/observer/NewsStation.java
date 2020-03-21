package com.iteso.observer;

import com.iteso.observer.impl.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/14/13
 * Time: 3:26 PM
 * To change this template use File | Settings | File Templates.
 */
class NewsStation {
    public static void main( String[] args ){
        JamaiconScoresSubject jamaiconScoresSubject;
        jamaiconScoresSubject = new JamaiconScoresSubject();

        Observer storeDisplayObserverGalerias = new StoreDisplayObserver("Tienda Galerias");
        Observer storeDisplayObserverAndares = new JamaiconAppObserver("App");
        Observer storeBannerObserverAndares = new StoreBannerObserver("Banner Andares");
        Observer webPage = new JamaiconWebObserver("WebPage");

        jamaiconScoresSubject.registerObserver(storeDisplayObserverGalerias);
        jamaiconScoresSubject.registerObserver(storeDisplayObserverAndares);
        jamaiconScoresSubject.registerObserver(storeBannerObserverAndares);
        jamaiconScoresSubject.registerObserver(webPage);

        jamaiconScoresSubject.setScore("Atletico Lagos", "Tennis Tonatiuh", 8, 1);
        jamaiconScoresSubject.setScore("Deportivo Arnoldos", "Aclas", 0, 0);
        jamaiconScoresSubject.removeObserver(storeDisplayObserverAndares);
        jamaiconScoresSubject.setScore("El Gallo mueblerias", "Surtidora Departamental", 2, 5);
        jamaiconScoresSubject.registerObserver(storeDisplayObserverAndares);
        jamaiconScoresSubject.setScore("ITESO", "UVM", 5, 0);

    }
}
