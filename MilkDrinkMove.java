import ru.ifmo.se.pokemon.*;

public class MilkDrinkMove extends StatusMove {
    protected MilkDrinkMove() {
        super(Type.NORMAL, 0, 0);
    }
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, -5);
    }
}