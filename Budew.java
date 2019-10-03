import ru.ifmo.se.pokemon.*;

public class Budew extends Pokemon {
    public Budew(String name, int level) {
        super(name, level);
        setType( Type.POISON, Type.WATER);
        setStats(40, 30, 35, 50, 70, 55);
        setMove(new MegaDrainMove(),new RestMove());
    }
}
