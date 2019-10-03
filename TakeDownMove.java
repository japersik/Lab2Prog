import ru.ifmo.se.pokemon.*;

public class TakeDownMove extends PhysicalMove{
    protected TakeDownMove(){
        super(Type.NORMAL, 90, 85);
    }
    protected void applyOppDamage(Pokemon def, double damage){
            def.setMod(Stat.HP, (int) damage);
    }
    protected void applySelfDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) damage/4);
    }
}
