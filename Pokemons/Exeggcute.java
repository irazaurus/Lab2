package Pokemons;

import Action.NightSlash;
import Action.Facade;
import Action.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Exeggcute extends Pokemon {

    public Exeggcute(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.PSYCHIC);
        setStats(60, 40, 80, 60, 45, 40);
        setMove(new Facade(), new NightSlash(), new Swagger());
    }
}
