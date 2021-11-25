package Fight;

import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Lab2 {
    public static void main(String[] args) {

        Battle b = new Battle();
        Pokemon p1 = new Xerneas("Зернис", 15);
        Pokemon p2 = new Exeggcute("Эксегкьют ", 15);
        Pokemon p3 = new Exeggutor("Экзегкутор", 15);
        Pokemon p4 = new Azurill("Азурилл", 15);
        Pokemon p5 = new Marill("Марилл", 15);
        Pokemon p6 = new Azumarill("Азумарилл", 15);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();

    }
}