package Action;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {

    public Overheat() {
        super(Type.FIRE, 130, 90);
    }

    @Override
    protected String describe() {
        return "использует Overheat! "
                + "Наносит урон и снижает атаку данного покемона на 2 ступени";
    }

    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    protected void applySelfEffects(Pokemon p) {
        Effect atk = new Effect().stat(Stat.ATTACK, -2);
        p.addEffect(atk);
    }
}
