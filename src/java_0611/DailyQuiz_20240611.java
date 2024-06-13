package java_0611;

public class DailyQuiz_20240611 {
    public void learn() {
        Me_20240611 me = new Me_20240611("이현준", 26, 100_000_000,
                "청주", "010-0000-1111", "Ormi");

        Car_20240611 car = new Car_20240611("람보르기니", "green", 0);

        System.out.println(me.introduceSelf());
        me.increaseAge();
        me.introduceMyCar(car);
        me.carAccelerator(car, 200);
        me.carBreak(car, 145);
        me.inputCarColor(car, "yellow");
    }
}
