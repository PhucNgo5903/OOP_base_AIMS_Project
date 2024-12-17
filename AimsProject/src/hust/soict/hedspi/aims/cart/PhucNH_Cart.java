package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.PhucNH_Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.*;

public class PhucNH_Cart {
	private ObservableList<PhucNH_Media> itemsOrdered = FXCollections.observableArrayList();
	
	public ObservableList<PhucNH_Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void addMedia(PhucNH_Media item) {
		if (itemsOrdered.contains(item)) {
			System.out.println("PhucNH - " + item.getTitle() + "is already in the cart!");
		} else {
			itemsOrdered.add(item);
			System.out.println("PhucNH - " + item.getTitle() + " is now in your cart!");
		}
	}

	public void removeMedia(PhucNH_Media item) {
		if (itemsOrdered.contains(item)) {
			itemsOrdered.remove(item);
		} else {
			System.out.println(
					"PhucNH - " + item.getClass().getSimpleName() + ' ' + item.getTitle() + " is not in the cart!");
		}
	}

	public float totalCost() {
		float sum = 0;
		for (PhucNH_Media item : itemsOrdered) {
			sum += item.getCost();
		}
		return sum;
	}

	public void print() {
		StringBuilder output = new StringBuilder(
				"*************CART************************** \nPhucNH - Ordered items: \n");
		if (itemsOrdered.isEmpty()) {
			output.append("PhucNH - No time\n");
		} else {
			int i = 1;
			for (PhucNH_Media item : itemsOrdered) {
				output.append("PhucNH - " + i + ".[" + item.getTitle() + "] - [" + item.getCategory() + "] - "
						+ item.getCost() + " $\n");
				i++;
			}
		}
		output.append("PhucNH - Total: ").append(totalCost()).append(" $\n");
		output.append("================================================\n");
		System.out.println(output);
	}

	public void searchById(int i) {
		if (i > itemsOrdered.size()) {
			System.out.println("PhucNH - No match found!");
		} else {
			System.out.println("PhucNH - Result: " + "[" + itemsOrdered.get(i - 1).getTitle() + "] - ["
					+ itemsOrdered.get(i - 1).getCategory() + "] -" + +itemsOrdered.get(i - 1).getCost() + " $\n");
		}
	}

	public void searchByTitle(String title) {
		for (PhucNH_Media item : itemsOrdered) {
			if (item.getTitle().equals(title)) {
				System.out.println("PhucNH - Result: " + "[" + item.getTitle() + "] - [" + item.getCategory() + "] -"
						+ item.getCost() + " $\n");
				return;
			}
		}
		System.out.println("PhucNH - No match found");
	}

	public PhucNH_Media findMedia(String title) {
		for (PhucNH_Media item : itemsOrdered) {
			if (item.getTitle().equals(title)) {
				return item;
			}
		}
		return null;
	}

	public void emptyCart() {
		itemsOrdered.removeAll(itemsOrdered);
	}
	 public void sortByTitleCost() { Collections.sort(itemsOrdered, PhucNH_Media.COMPARE_BY_TITLE_COST); }
	 public void sortByCostTitle() { Collections.sort(itemsOrdered, PhucNH_Media.COMPARE_BY_COST_TITLE); }
}