package github.raininfall.react.x5;

import android.util.Log;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.facebook.react.uimanager.ThemedReactContext;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

/**
 * Created by rongqiansong on 2017/10/23.
 */

public class RNX5View extends RelativeLayout {
		private final WebView webView;

		private final WebViewClient client = new WebViewClient() {
				/**
				 * 防止加载网页时调起系统浏览器
				 */
				public boolean shouldOverrideUrlLoading(WebView view, String url) {
						view.loadUrl(url);
						return true;
				}
		};

		public RNX5View(final ThemedReactContext context) {
				super(context);

				LayoutInflater.from(context).inflate(R.layout.web, this);
				/* WebView */
				webView = (WebView)findViewById(R.id.web_view);
				webView.setWebViewClient(client);
		}

		public void load(final String url) {
				Log.i("RNX5View", url);
				webView.loadUrl(url);
		}

		public WebSettings getSettings() {
				return webView.getSettings();
		}
}
