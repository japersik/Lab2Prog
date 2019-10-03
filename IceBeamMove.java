import ru.ifmo.se.pokemon.*;

public class IceBeamMove extends SpecialMove{
    protected IceBeamMove(){
        super(Type.ICE, 90, 100);
    }
    protected void applyOppEffects(Pokemon p){
            if ((Math.random() <= 0.1) && !p.hasType(Type.ICE)) {
                Effect.freeze(p);
            }
        }
    }
