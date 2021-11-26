package Pokemons;

import Action.DoubleTeam;
import Action.Facade;
import Action.HyperBeam;
import Action.Rest;
import ru.ifmo.se.pokemon.*;

public class Xerneas extends Pokemon {

    public Xerneas(String name, int level) {
        super(name, level);
        setType(Type.FAIRY);
        setStats(126, 131, 95, 131, 98, 99);
        setMove(new Facade(), new DoubleTeam(), new Rest(), new HyperBeam());
    }
}
