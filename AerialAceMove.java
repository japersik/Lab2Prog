
import ru.ifmo.se.pokemon.*;

public class AerialAceMove extends PhysicalMove{
    protected AerialAceMove(){
        super(Type.FLYING, 60, 100);
    }
    protected void applyOppDamage(Pokemon def, double damage){
            def.setMod(Stat.HP, (int) damage);
    }

}
