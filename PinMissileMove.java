import ru.ifmo.se.pokemon.*;

import java.text.Normalizer;

public class PinMissileMove extends PhysicalMove{
    public PinMissileMove(){
        super(Type.BUG, 25, 95);
    }
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) damage);
    }
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
    }
}
