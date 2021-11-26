package Pokemons;

import Action.Confide;
import Action.Swagger;
import ru.ifmo.se.pokemon.*;

public class Azurill extends Marill {

    public Azurill(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.setStats(50, 20, 40, 20, 40, 20);
        this.setMove(new Swagger(), new Confide());
    }

}