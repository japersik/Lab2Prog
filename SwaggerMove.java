import ru.ifmo.se.pokemon.*;

public class SwaggerMove extends StatusMove{
    protected SwaggerMove(){
        super(Type.NORMAL, 0, 85);
    }
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
        System.out.println("На противника наложен эффект растерянности");
    }
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, 2);
    }
}
