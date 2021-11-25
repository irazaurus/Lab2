package Action;

import ru.ifmo.se.pokemon.*;

public class HyperBeam extends SpecialMove {
    public HyperBeam() {
        super(Type.NORMAL, 150, 90, 5, 1);
    }

    @Override
    protected String describe() {
        return "использует Hyper Beam! "
                + "Наносит огромный урон, но покемон отдыхает в следующий ход";
    }

    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
}