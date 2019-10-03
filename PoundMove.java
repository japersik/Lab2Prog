import ru.ifmo.se.pokemon.*;

public class PoundMove extends PhysicalMove{
    protected PoundMove(){
        super(Type.NORMAL, 40, 100);
    }
    protected void applyOppDamage(Pokemon def, double damage){
            def.setMod(Stat.HP, (int)damage);
    }

}
