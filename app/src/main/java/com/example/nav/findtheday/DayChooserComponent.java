package com.example.nav.findtheday;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Navjot
 */
@Singleton
@Component (modules = DayChooserModule.class)
public interface DayChooserComponent {
    void inject(DayFragment dayFragment);
}
