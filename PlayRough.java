package Action;

import ru.ifmo.se.pokemon.*;

public class PlayRough extends PhysicalMove {
    public PlayRough() {
        super(Type.FAIRY, 90, 90, 10, 1);
    }

    @Override
    protected String describe() {
        return "использует Play Rough! "
                + "Наносит урон, 10% шанс снизить атаку противника на одну ступень";
    }
    protected void applyOppEffect(Pokemon p) {
        Effect s = new Effect().stat(Stat.ATTACK, -1).chance(10);
        p.addEffect(s);
    }
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
}