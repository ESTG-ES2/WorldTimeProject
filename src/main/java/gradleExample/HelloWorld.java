package gradleExample;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        WorldTimes worldTime = new WorldTimes();

        System.out.println(worldTime.getTimeByCountry("Europe/Madrid"));

    }
}
