package com.example.nav.findtheday;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Navjot
 */
@Module
public class DayChooserModule
{

  @Singleton
  @Provides
  DayChooser dayChooser() {
    return new DayChooser();
}

}
