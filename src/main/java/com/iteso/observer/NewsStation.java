package com.iteso.observer;

import com.iteso.observer.impl.StoreBannerObserver;
import com.iteso.observer.impl.StoreDisplayObserver;
import com.iteso.observer.impl.JamaiconScoresSubject;

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

        StoreDisplayObserver storeDisplayObserverGalerias = new StoreDisplayObserver(jamaiconScoresSubject, "Tienda Galerias");
        StoreDisplayObserver storeDisplayObserverAndares = new StoreDisplayObserver(jamaiconScoresSubject, " Tienda Andares");

        StoreBannerObserver storeBannerObserverAndares = new StoreBannerObserver(jamaiconScoresSubject, "Banner Andares");

        jamaiconScoresSubject.setScore("Atletico Lagos", "Tennis Tonatiuh", 8, 1);
        jamaiconScoresSubject.setScore("Deportivo Arnoldos", "Aclas", 0, 0);
        jamaiconScoresSubject.removeObserver(storeDisplayObserverAndares);
        jamaiconScoresSubject.setScore("El Gallo mueblerias", "Surtidora Departamental", 2, 5);
        jamaiconScoresSubject.registerObserver(storeDisplayObserverAndares);
        jamaiconScoresSubject.setScore("ITESO", "UVM", 5, 0);

    }
}
