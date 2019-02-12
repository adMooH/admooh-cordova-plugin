package com.admooh.cordova.plugins.signage;

import android.app.Activity;
import android.view.View;
import android.widget.RelativeLayout;

// Cordova-required packages
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

public class AdmoohSignage extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) {

		final String callAction = action.toUpperCase();

		Activity activity = cordova.getActivity();
		final RelativeLayout dtvLayout = activity.findViewById(com.admooh.tv.R.id.RelativeLayout_admooh_tv);
		activity.runOnUiThread(() -> {
			switch (callAction) {
			case "SHOWTV": {
				dtvLayout.setVisibility(View.VISIBLE);
				break;
			}
			case "HIDETV": {
				dtvLayout.setVisibility(View.INVISIBLE);
				break;
			}
			default: {
				callbackContext.error("\"" + action + "\" is not a recognized action.");
			}
			}
		});

		PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
		callbackContext.sendPluginResult(pluginResult);
		return true;
	}

}