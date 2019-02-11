/**
 *
 * */
export interface Window {
	cordova: {
		plugins: {
			admoohPlugin: AdmoohPluginInterface
		}
	}
}
/**
 *
 * */
export interface AdmoohPluginInterface {
	showTv(): never;
	hideTv(): never;
}

/**
 *
 * */
export declare var cordova: {
	plugins: {
		admoohPlugin: AdmoohPluginInterface
	}
};