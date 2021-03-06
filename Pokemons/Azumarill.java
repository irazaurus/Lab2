package Pokemons;

import Action.DoubleTeam;
import ru.ifmo.se.pokemon.Type;

public class Azumarill extends Azurill {

    public Azumarill(String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.FAIRY);
        setStats(50, 20, 40, 20, 40, 20);
        setMove(new DoubleTeam());
    }
}