function AdmoohPlugin() { };


AdmoohPlugin.prototype.showTv = function () {
	cordova.exec(null, null, 'AdmoohPlugin', 'showTv', []);
}

AdmoohPlugin.prototype.hideTv = function () {
	cordova.exec(null, null, 'AdmoohPlugin', 'hideTv', []);
}


AdmoohPlugin.install = function () {
	if (!window.plugins) {
		window.plugins = {};
	}
	window.plugins.admoohPlugin = new AdmoohPlugin();
	return window.plugins.admoohPlugin;
};

cordova.addConstructor(AdmoohPlugin.install);