package Action;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    public Confide() {
        super(Type.NORMAL, 0, 0, 20, 1);
    }

    @Override
    protected String describe() {
        return "использует Confide! "
                + "Снижает атаку противника на одну ступень";
    }
    protected void applyOppEffects(Pokemon p) {
        Effect att = new Effect().stat(Stat.ATTACK, -1);
        p.addEffect(att);
    }

}