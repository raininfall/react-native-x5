
package github.raininfall.react.x5;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNX5Module extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNX5Module(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNX5";
  }
}