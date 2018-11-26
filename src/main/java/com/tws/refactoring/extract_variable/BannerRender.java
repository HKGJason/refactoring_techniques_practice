package com.tws.refactoring.extract_variable;

public class BannerRender {
    void renderBanner(String platform, String browser) {
        final String mac = "MAC";
        final String ie = "IE";
        if ((platform.toUpperCase().indexOf(mac) > -1) &&
                (browser.toUpperCase().indexOf(ie) > -1)) {
            // do so`mething
        }
    }
}
