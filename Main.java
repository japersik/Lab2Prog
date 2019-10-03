import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Alomomolka("Программирование", 3);
        Pokemon p2 = new Skiddo("ВПД", 3);
        Pokemon p3 = new Gogoat("Физика", 2);
        Pokemon p4 = new Budew("R3135", 3);
        Pokemon p5 = new Roserade("R3136 ", 2 );
        Pokemon p6 = new Roselia("R3137 ", 4);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
