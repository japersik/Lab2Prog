import ru.ifmo.se.pokemon.*;

public class Skiddo extends Pokemon   {
    public Skiddo(String name, int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(66, 65, 48, 62, 57, 52);
        setMove(new WorkUpMove(),new TakeDownMove(), new MilkDrinkMove());
    }
}
