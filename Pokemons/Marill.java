package Pokemons;

import Action.Overheat;
import ru.ifmo.se.pokemon.*;

public class Marill extends Pokemon {

    public Marill (String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.FAIRY);
        setStats(70, 20, 50, 20, 50, 40);
        setMove(new Overheat());
    }

}
