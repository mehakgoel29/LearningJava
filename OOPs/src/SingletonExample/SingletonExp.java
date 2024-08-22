package SingletonExample;

public class SingletonExp {
    private SingletonExp() {}
    private static SingletonExp instance;
    public static SingletonExp getInstance() {
        if(instance==null){
            instance=new SingletonExp();
            System.out.println("instance created");
        }
        return instance;
    }

}
