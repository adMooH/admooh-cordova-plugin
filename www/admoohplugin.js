function AdmoohPlugin() { };


AdmoohPlugin.prototype.showTv = function (successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, 'AdmoohPlugin', 'showTv', []);
}

AdmoohPlugin.prototype.hideTv = function (successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, 'AdmoohPlugin', 'hideTv', []);
}


AdmoohPlugin.install = function () {
	if (!window.plugins) {
		window.plugins = {};
	}
	window.plugins.admoohPlugin = new AdmoohPlugin();
	return window.plugins.admoohPlugin;
};

cordova.addConstructor(AdmoohPlugin.install);