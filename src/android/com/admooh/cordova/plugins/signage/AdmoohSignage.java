package com.admooh.cordova.plugins.signage;

import android.view.View;
import android.widget.RelativeLayout;

// Cordova-required packages
import com.amlogic.DTVPlayer.DTVActivity;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

public class AdmoohSignage extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) {

		final String callAction = action.toUpperCase();

		final DTVActivity player = (DTVActivity) cordova.getActivity();
		final RelativeLayout dtvLayout = player.findViewById(com.admooh.tv.R.id.RelativeLayout_admooh_tv);

		player.runOnUiThread(() -> {
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