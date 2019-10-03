import ru.ifmo.se.pokemon.*;

public class CalmMindMove extends StatusMove {
    protected CalmMindMove() {
        super(Type.PSYCHIC, 0, 0);
    }
    protected void applySelfEffects(Pokemon p) {
            p.setMod(Stat.SPECIAL_DEFENSE, 1);
            p.setMod(Stat.SPECIAL_ATTACK, 1);
    }
}
