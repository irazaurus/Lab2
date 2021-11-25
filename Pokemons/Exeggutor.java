package Pokemons;

import Action.PlayRough;
import ru.ifmo.se.pokemon.Type;

public class Exeggutor extends Exeggcute {

    public Exeggutor(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.PSYCHIC);
        setStats(95, 95, 85, 125, 75, 55);
        setMove(new PlayRough());
    }
}
