import ru.ifmo.se.pokemon.*;

public class MegaDrainMove extends SpecialMove {
    public MegaDrainMove() {
        super(Type.ICE, 40, 100);
    }
    protected void applyOppDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) damage);
    }
    protected void applySelfDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, -(int) Math.round(damage) / 2);
    }
}
