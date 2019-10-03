import ru.ifmo.se.pokemon.*;

public class RestMove extends StatusMove{
    protected RestMove(){
        super(Type.PSYCHIC, 0, 0);
    }
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, -10);
        Effect.sleep(p);
    }
}
