import ru.ifmo.se.pokemon.*;

public class Gogoat extends Pokemon   {
    public Gogoat (String name, int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(123, 100, 62, 97, 81, 68);
        setMove(new WorkUpMove(),new TakeDownMove(),new MilkDrinkMove(),new AerialAceMove());
    }
}
