import ru.ifmo.se.pokemon.*;

public class Roselia extends Pokemon   {
    public Roselia(String name, int level){
        super(name,level);
        setType(Type.GRASS, Type.POISON);
        setStats(50, 60, 45, 100, 80, 65);
        setMove(new MegaDrainMove(),new RestMove(),new PinMissileMove());
    }
}
