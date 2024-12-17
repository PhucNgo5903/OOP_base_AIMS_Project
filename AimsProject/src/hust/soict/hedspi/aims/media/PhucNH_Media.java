package hust.soict.hedspi.aims.media;
import java.util.Comparator;
abstract public class PhucNH_Media implements Comparable<PhucNH_Media> {
	private int id;
	private String title;
	private String category;
	private float cost;
    public static final Comparator<PhucNH_Media> COMPARE_BY_TITLE_COST = new PhucNH_MediaComparatorByTitleCost();
    public static final Comparator<PhucNH_Media> COMPARE_BY_COST_TITLE = new PhucNH_MediaComparatorByCostTitle();

	public PhucNH_Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	boolean equals(PhucNH_Media o2) {
		return title.equals(o2.getTitle());
	}
	@Override
    public String toString() {
        return this.getClass().getSimpleName() + " [id= " + id + ", title='" + title + '\'' + ", category='" + category + '\'' +
        		", cost= " + cost + " $]";
    }
	@Override
	public int compareTo(PhucNH_Media other) {
	 if (!this.getTitle().equals(other.getTitle())) {
		 return this.getTitle().compareTo(other.getTitle());
	 } 
	 else {
		 return Double.compare(this.getCost(), other.getCost());
	 	}
	}
}