import org.example.model.Campaing;
import org.example.model.Character;
import org.example.model.Monster;
import org.example.model.Object;
import org.example.model.PNJ;
import org.example.model.Spell;

/**
 * Prueba manual básica de las clases del modelo. Ejecuta este main desde el IDE
 * o con Maven para comprobar constructores, getters y colecciones de campaña.
 */
public class Main {

    public static void main(String[] args) {
        int checks = 0;

        Spell spell = new Spell("Bola de fuego", 3, "Una explosión de fuego.");
        check("Bola de fuego".equals(spell.getName()), "Spell.getName");
        check(spell.getLevel() == 3, "Spell.getLevel");
        check("Una explosión de fuego.".equals(spell.getDescription()), "Spell.getDescription");
        checks += 3;

        PNJ pnj = new PNJ("Elara", "Una mercader amable.", "Mercader");
        check("Elara".equals(pnj.getName()), "PNJ.getName");
        check("Una mercader amable.".equals(pnj.getDescription()), "PNJ.getDescription");
        check("Mercader".equals(pnj.getOcupation()), "PNJ.getOcupation");
        checks += 3;

        Object object = new Object("Poción", "Restaura salud.");
        check("Poción".equals(object.getName()), "Object.getName");
        check("Restaura salud.".equals(object.getDescription()), "Object.getDescription");
        checks += 2;

        Monster monster = new Monster("Goblin", "Humanoide", 7, 15, 1);
        check("Goblin".equals(monster.getName()), "Monster.getName");
        check("Humanoide".equals(monster.getType()), "Monster.getType");
        check(monster.getHealth() == 7, "Monster.getHealth");
        check(monster.getArmorClass() == 15, "Monster.getArmorClass");
        check(monster.getDificulty() == 1, "Monster.getDificulty");
        checks += 5;

        Character character = new Character();
        character.setName("Aria");
        character.setRace("Elfa");
        character.setCharacterClass("Maga");
        character.setLevel(5);
        character.setMaxHealth(32);
        character.setActualHealth(27);
        character.setStrength(8);
        character.setDexterity(14);
        character.setConstitution(12);
        character.setIntelligence(18);
        character.setWisdom(13);
        character.setCharisma(10);
        check("Aria".equals(character.getName()), "Character name setter/getter");
        check("Elfa".equals(character.getRace()), "Character race setter/getter");
        check("Maga".equals(character.getCharacterClass()), "Character class setter/getter");
        check(character.getLevel() == 5, "Character level setter/getter");
        check(character.getMaxHealth() == 32, "Character max health setter/getter");
        check(character.getActualHealth() == 27, "Character actual health setter/getter");
        check(character.getStrength() == 8, "Character strength setter/getter");
        check(character.getDexterity() == 14, "Character dexterity setter/getter");
        check(character.getConstitution() == 12, "Character constitution setter/getter");
        check(character.getIntelligence() == 18, "Character intelligence setter/getter");
        check(character.getWisdom() == 13, "Character wisdom setter/getter");
        check(character.getCharisma() == 10, "Character charisma setter/getter");
        checks += 12;

        Campaing campaign = new Campaing("La cripta", "Aventura de prueba.");
        check("La cripta".equals(campaign.getName()), "Campaing.getName");
        check("Aventura de prueba.".equals(campaign.getDescription()), "Campaing.getDescription");
        check(campaign.getCharacters().isEmpty(), "Campaing.getCharacters inicial");
        campaign.getCharacters().add(character);
        campaign.getPnjs().add(pnj);
        campaign.getMonsters().add(monster);
        check(campaign.getPnjs().size() == 1 && campaign.getPnjs().get(0) == pnj,
                "Campaing.getPnjs permite agregar y recuperar PNJ");
        check(campaign.getMonsters().size() == 1 && campaign.getMonsters().get(0) == monster,
                "Campaing.getMonsters permite agregar y recuperar monstruos");
        checks += 5;

        check(campaign.getCharacters().size() == 1 && campaign.getCharacters().get(0) == character,
                "Campaing.getCharacters permite agregar y recuperar personajes");
        checks++;

        System.out.println("OK: " + checks + " comprobaciones completadas.");
    }

    private static void check(boolean condition, String description) {
        if (!condition) {
            throw new IllegalStateException("Falló la comprobación: " + description);
        }
    }
}
