package Action;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected String describe() {
        return "использует Swagger! "
                + "Повышает атаку противника на две ступени и сбивает его с толку";
    }
    protected void applyOppEffects(Pokemon p) {
        p.confuse();
        Effect c = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(c);
    }
}