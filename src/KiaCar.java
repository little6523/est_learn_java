public class KiaCar implements Car{

    @Override
    public String showEngine() {
        return "kia 엔진이에용";
    }

    @Override
    public int amountNavi() {
        return 10000;
    }

    @Override
    public String getTire() {
        return "kia 타이어에용";
    }
}
