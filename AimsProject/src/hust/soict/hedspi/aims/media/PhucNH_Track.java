package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PhucNH_PlayerException;

public class PhucNH_Track implements PhucNH_Playable {
	private String title;
	private int length;

	public int getLength() {
		return length;
	}

	public String getTitle() {
		return title;
	}

	public PhucNH_Track(String title, int length) {
		this.title = title;
		this.length = length;
	}

	public void play() throws PhucNH_PlayerException {
		if (this.getLength() < 0) {
			throw new PhucNH_PlayerException("ERROR: DVD-length is non-positive!");
		} else {
			System.out.println("PhucNH - Playing DVD: " + this.getTitle());
			System.out.println("PhucNH - DVD length: " + this.getLength());
		}
	}

	public boolean equals(PhucNH_Track tmp) {
		return (title == tmp.getTitle()) && (length == tmp.getLength());
	}
}