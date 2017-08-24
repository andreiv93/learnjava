public class Engine {
    private EngineType engineType;
    private int valve;

    public Engine(String engineType, int valve) {
        this.engineType = EngineType.parseString(engineType);
        this.valve = valve;
    }


}
