package Action;

import ru.ifmo.se.pokemon.*;
import static ru.ifmo.se.pokemon.Stat.HP;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 100, 100, 10, 3);
    }

    @Override
    protected String describe() {
        return "использует Rest! "
                + "Покемон спит 3 хода и полностью исцеляется";
    }
    protected void applySelfEffects(Pokemon p) {
        Effect r = new Effect().condition(Status.SLEEP).turns(3);
            int hp = (int) p.getStat(HP);
        Effect h = new Effect().stat(HP, hp);
        p.addEffect(r);
        p.addEffect(h);
    }
}
