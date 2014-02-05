package org.compendiumng.cngx;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {
    public void dosomething(ActionEvent actionEvent) {
        System.out.println("did something");

    }

    public void tabchanged(Event event) {
        System.out.println("tab changed");
    }

    public void firsttabchanged(Event event) {
    }

    public void onBtnCompendiumPress(ActionEvent actionEvent) {
        String location = "http://www.compendiumng.org";
        WebView browser = new WebView();
        WebEngine engine = browser.getEngine();
        engine.load(location);
    }

    public void onBtnHtml5test(ActionEvent actionEvent) {
        String location = "http://www.html5test.com";
        WebView browser = new WebView();
        WebEngine engine = browser.getEngine();
        engine.load(location);

    }

    public void onBtnGooglePress(ActionEvent actionEvent) {
        String location = "http://www.google.com";
        WebView browser = new WebView();
        WebEngine engine = browser.getEngine();
        engine.load(location);
    }
}
