package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PhucNH_PlayerException;

public class PhucNH_DigitalVideoDisc extends PhucNH_Disc implements PhucNH_Playable {

	public PhucNH_DigitalVideoDisc(int id, String title, String category, float cost, String director, float length) {
		super(id, title, category, cost, director, length);
	}

	public PhucNH_DigitalVideoDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public void play() throws PhucNH_PlayerException {
		if (this.getLength() < 0) {
			throw new PhucNH_PlayerException("ERROR: DVD-length is non-positive!");
		} else {
			System.out.println("PhucNH - Playing DVD: " + this.getTitle());
			System.out.println("PhucNH - DVD length: " + this.getLength());
		}
	}
}