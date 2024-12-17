package hust.soict.hedspi.aims.media;

public class PhucNH_Disc extends PhucNH_Media {
	private String director;
	private float length;

	public PhucNH_Disc(int id, String title, String category, float cost, String director, float length) {
		super(id, title, category, cost);
		this.director = director;
		this.length = length;
	}

	public PhucNH_Disc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public String getDirector() {
		return director;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public String toString() {
		return "PhucNH - DVD: " + " [id = " + getId() + ", title = '" + getTitle() + '\'' + ", category = '"
				+ getCategory() + '\'' + ", director: " + getDirector() + ", length = " + getLength() + ", cost= "
				+ getCost() + "$]";
	}

	@Override
	public int compareTo(PhucNH_Media other) {
		if (other instanceof PhucNH_Disc) {
			PhucNH_Disc otherDVD = (PhucNH_Disc) other;
			int titleComparison = this.getTitle().compareTo(otherDVD.getTitle());
			if (titleComparison != 0) {
				return titleComparison;
			} else {
				int lengthComparison = Float.compare(otherDVD.getLength(), this.getLength());
				if (lengthComparison != 0) {
					return lengthComparison;
				} else {
					return Double.compare(this.getCost(), otherDVD.getCost());
				}
			}
		} else {
			return super.compareTo(other);
		}
	}

}
