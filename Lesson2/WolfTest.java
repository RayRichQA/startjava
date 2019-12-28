public class WolfTest {
	
	public static void main(String[] args) {

		Wolf wolf = new Wolf();
		wolf.setSex("unisex");
		wolf.setName("Crazy Frog");
		wolf.setWeight(25.9f);
		wolf.setAge(7);
		wolf.setColor("grey");

		System.out.println(wolf.getSex());
		System.out.println(wolf.getName());
		System.out.println(wolf.getWeight());
		System.out.println(wolf.getAge());
		System.out.println(wolf.getColor());

		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.howl();
	}
}