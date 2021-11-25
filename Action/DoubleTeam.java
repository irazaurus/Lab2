package Action;

import ru.ifmo.se.pokemon.*;
import static ru.ifmo.se.pokemon.Stat.EVASION;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 100, 100, 15, 1);
    }

    @Override
    protected String describe() {
        return "использует DoubleTeam! "
                + "Повышает уклонение покемона на одну ступень";
    }
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(EVASION, +1);
        p.addEffect(e);
    }
}
