import ru.ifmo.se.pokemon.*;

public class WorkUpMove extends StatusMove{
    protected WorkUpMove(){
        super(Type.NORMAL, 0, 0);
    }
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }
}
