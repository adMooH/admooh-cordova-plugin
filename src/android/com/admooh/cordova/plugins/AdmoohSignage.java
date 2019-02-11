package com.admooh.cordova.plugins.admooh;

// The native Toast API
import android.widget.Toast;

// Cordova-required packages
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdmoohSignage extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) {

		final String callAction = action.toUpperCase();
		final String message;
		switch (callAction) {
		case "SHOWTV": {
			message = "SHOWTV";
			break;
		}
		case "HIDETV": {
			message = "HIDETV";
			break;
		}
		default: {
			callbackContext.error("\"" + action + "\" is not a recognized action.");
			return false;
		}
		}

		Toast toast = Toast.makeText(cordova.getActivity(), message, Toast.LENGTH_LONG);
		toast.show();
		PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
		callbackContext.sendPluginResult(pluginResult);
		return true;
	}

}