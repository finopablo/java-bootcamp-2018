package builder;

public class Director {
	private Builder connectionBuilder = null;

	public Director(Builder mealBuilder) {
		this.connectionBuilder = mealBuilder;
	}

	public void constructConnection() {
		connectionBuilder.getConnection();
	}

}
