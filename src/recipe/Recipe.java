package recipe;

public class Recipe {
	private Integer id;
	private String name;
	private String description;
	private String ingredients;
	private String directions;
	
	public Recipe() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Recipe (%s) [id=%d, name=%s]", super.toString(),id,name);
	}
	
}
