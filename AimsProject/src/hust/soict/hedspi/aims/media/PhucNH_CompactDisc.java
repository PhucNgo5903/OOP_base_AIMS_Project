package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

import hust.soict.hedspi.aims.exception.PhucNH_PlayerException;

public class PhucNH_CompactDisc extends PhucNH_Disc implements PhucNH_Playable {
	private String artist;
	private ArrayList<PhucNH_Track> tracks;

	public PhucNH_CompactDisc(int id, String title, String category, float cost, String artist,
			ArrayList<PhucNH_Track> tracks) {
		super(id, title, category, cost);
		this.tracks = tracks;
		this.artist = artist;
		this.setLength(getLength());
	}

	public PhucNH_CompactDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public String getArtist() {
		return artist;
	}

	public void addTrack(PhucNH_Track song) {
		if (tracks.contains(song)) {
			System.out.println("PhucNH - " + song.getTitle() + "is already in the CD");
		} else {
			tracks.add(song);
		}
	}

	public void removeTrack(PhucNH_Track song) {
		if (tracks.contains(song)) {
			tracks.remove(song);
		} else {
			System.out.println("PhucNH - " + song.getTitle() + "is not in the CD");
		}
	}

	public ArrayList<PhucNH_Track> getTracks() {
		return tracks;
	}

	@Override
	public float getLength() {
		float sum = 0;
		for (PhucNH_Track song : tracks) {
			sum += song.getLength();
		}
		return sum;
	}

	public void play() throws PhucNH_PlayerException {
		if (this.getLength() < 0) {
			throw new PhucNH_PlayerException("ERROR: DVD-length is non-positive!");
		} else {
			System.out.println("\nPhucNH - Title: " + getTitle() + '\n' + "Artist: " + getArtist() + "\n");
			for (PhucNH_Track song : tracks) {
				song.play();
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder print = new StringBuilder(
				"PhucNH - CD: " + " [id = " + getId() + ", artist: " + artist + ", title = '" + getTitle() + '\''
						+ ", category = '" + getCategory() + '\'' + ", length : " + getLength() + " min" + ", cost= "
						+ getCost() + "$]" + '\n' + "Tracks: \n" + "===================" + '\n');
		for (PhucNH_Track track : tracks) {
			print.append(track.getTitle());
			print.append('\t');
			print.append(track.getLength());
			print.append(" min");
			print.append('\n');
		}
		return print.toString();
	}
}