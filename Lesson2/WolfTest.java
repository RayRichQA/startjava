public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.sex = "unisex";
		wolf.name = "Crazy Frog";
		wolf.weight = 25.9f;
		wolf.age = 7;
		wolf.color = "grey";

		System.out.println(wolf.sex);
		System.out.println(wolf.name);
		System.out.println(wolf.weight);
		System.out.println(wolf.age);
		System.out.println(wolf.color);

		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.howl();
	}
}