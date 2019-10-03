import ru.ifmo.se.pokemon.*;

public class Alomomolka extends Pokemon   {
    public Alomomolka(String name, int level){
        super(name,level);
        setType(Type.WATER);
        setStats(165, 75, 80, 40, 45,65);
        setMove(new CalmMindMove(),new IceBeamMove(),new PoundMove(), new SwaggerMove());
    }
}
