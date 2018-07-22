package com.ridwanexp;




import com.airbnb.android.react.maps.MapsPackage;
import com.arttitude360.reactnative.rngoogleplaces.RNGooglePlacesPackage;

import com.facebook.react.ReactPackage;


import com.oblador.vectoricons.VectorIconsPackage;
import com.reactnativenavigation.NavigationApplication;

import com.imagepicker.ImagePickerPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends NavigationApplication {

  @Override
  public boolean isDebug() {
      // Make sure you are using BuildConfig from your own application
      return BuildConfig.DEBUG;
  }

  protected List<ReactPackage> getPackages() {
      // Add additional packages you require here
      // No need to add RnnPackage and MainReactPackage
      return Arrays.<ReactPackage>asList(
          // eg. new VectorIconsPackage()
          new VectorIconsPackage(),
          new MapsPackage(),
          new RNGooglePlacesPackage(),
          new ImagePickerPackage()
      );
  }

  @Override
  public List<ReactPackage> createAdditionalReactPackages() {
      return getPackages();
  }
  @Override
  public String getJSMainModuleName() {
    return "index";
}
}
  
