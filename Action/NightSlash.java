package Action;

import ru.ifmo.se.pokemon.*;

public class NightSlash extends PhysicalMove {
    public NightSlash() {
        super(Type.PSYCHIC, 70, 100, 15, 1);
    }

    @Override
    protected String describe() {
        return "использует Night Slash! "
                + "Наносит урон, шанс крита удваивается";
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        double chance = att.getStat(Stat.SPEED)/512;
        double random = (double) (Math.random());
        if (2*chance > random) {
            return 2;
        }
        else {
            return 1;
        }
    }

    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
}
