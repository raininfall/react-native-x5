package github.raininfall.react.x5;

import android.util.Log;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import java.util.Map;

import javax.annotation.Nullable;

/**
 * Created by rongqiansong on 2017/10/23.
 */

public class RNX5ViewManager extends SimpleViewManager<RNX5View>{
		private static final String NAME = "RCTX5View";

		private static final int COMMAND_LOAD_ID = 1;
		private static final String COMMAND_LOAD_NAME = "load";

		private static final Map<String, Integer> COMMAND_MAP = MapBuilder.of(
						COMMAND_LOAD_NAME, COMMAND_LOAD_ID
		);

		@Override
		public String getName() {
				return NAME;
		}

		@Override
		protected RNX5View createViewInstance(ThemedReactContext reactContext) {
				return new RNX5View(reactContext);
		}

		@Nullable
		@Override
		public Map<String, Integer> getCommandsMap() {
				return COMMAND_MAP;
		}

		@Override
		public void receiveCommand(RNX5View root, int commandId, @Nullable ReadableArray args) {
				switch (commandId) {
						case COMMAND_LOAD_ID:
								root.load(args.getString(0));
								break;
						default:
								Log.e(NAME, "Unknown command " + commandId);
				}
		}


		@ReactProp(name = "enableJavaScript")
		public void enableJavaScript(RNX5View root, boolean enable) {
				root.getSettings().setJavaScriptEnabled(enable);
		}

		@ReactProp(name = "enableJavaScriptCanOpenWindowsAutomatically")
		public void enableJavaScriptCanOpenWindowsAutomatically(RNX5View root, boolean enable) {
				root.getSettings().setJavaScriptCanOpenWindowsAutomatically(enable);
		}

		@ReactProp(name = "enableWideViewPort")
		public void enableWideViewPort(RNX5View root, boolean enable) {
				root.getSettings().setUseWideViewPort(enable);
		}
}

