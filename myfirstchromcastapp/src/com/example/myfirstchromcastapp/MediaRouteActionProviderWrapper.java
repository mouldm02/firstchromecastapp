package com.example.myfirstchromcastapp;

import android.content.Context;
import android.support.v4.view.ActionProvider;
import android.support.v7.app.MediaRouteActionProvider;


public class MediaRouteActionProviderWrapper extends MediaRouteActionProvider {
	public MediaRouteActionProviderWrapper(Context context) {
		super(context);
	}

	@Override
	public boolean isVisible() {
		return true;
	}
}
