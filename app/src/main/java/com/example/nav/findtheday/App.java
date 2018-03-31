package com.example.nav.findtheday;

import android.app.Application;

public class App extends Application {
    private DayChooserComponent dayChooserComponent;
    private static  App app;
    public DayChooserComponent getDayChooserComponent() {
        return dayChooserComponent;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
        dayChooserComponent = DaggerDayChooserComponent.builder()
                               .dayChooserModule(new DayChooserModule())
                               .build();
    }

    public static App getApp() {
        return app;
    }
}
