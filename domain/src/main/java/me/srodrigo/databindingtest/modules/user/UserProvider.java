/*
 * Copyright (c) 2015 Sergio Rodrigo Royo
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */
package me.srodrigo.databindingtest.modules.user;

public final class UserProvider {

	public interface Callback {
		void onUserRetrieved(me.srodrigo.databindingtest.model.User user);
	}

	private Callback callback;

	public void provideUser() {
		simulateDelay();
		callback.onUserRetrieved(new me.srodrigo.databindingtest.model.User("User", 20));
	}

	private void simulateDelay() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void setCallback(Callback callback) {
		this.callback = callback;
	}

}
