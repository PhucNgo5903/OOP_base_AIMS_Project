package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.*;
import java.util.LinkedList;

public class PhucNH_Store {
	private LinkedList<PhucNH_Media> itemsInStore = new LinkedList<PhucNH_Media>();

	public LinkedList<PhucNH_Media> getItemsInStore() {
		return itemsInStore;
	}

	private boolean checkMedia(PhucNH_Media disc) {
		for (PhucNH_Media digitalVideoDisc : itemsInStore) {
			if (digitalVideoDisc.equals(disc)) {
				return true;
			}
		}
		return false;
	}

	public PhucNH_Media findMedia(String title) {
		for (PhucNH_Media item : itemsInStore) {
			if (item.getTitle().equals(title)) {
				return item;
			}
		}
		return null;
	}

	public void removeMedia(PhucNH_Media disc) {
		if (checkMedia(disc)) {
			itemsInStore.remove(disc);
			System.out.println("PhucNH - " + disc.getTitle() + " has been deleted from the store!");
		} else {
			System.out.println("PhucNH - No " + disc.getTitle() + " in the store!");
		}
	}

	public void addMedia(PhucNH_Media disc) {
		if (!checkMedia(disc)) {
			itemsInStore.add(disc);
			System.out.println("PhucNH - " + disc.getTitle() + " has been added to the store!");
		} else {
			System.out.println("PhucNH - " + disc.getTitle() + " 'already exists in the store!");
		}

	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder(
				"****************STORE***************\nPhucNH - Items in the store: \n");
		if (itemsInStore.isEmpty())
			string.append("PhucNH - No DVD in the store!\n");
		else {
			for (PhucNH_Media dvd : itemsInStore) {
				string.append(dvd.getTitle() + " - " + dvd.getCost() + " $\n");
			}
		}
		string.append("***************************************");
		return string.toString();
	}
}