package GameClasses;

import character.Stats;

public class RogueClass extends GameClass
{
    private Stats stats;
    private Stats statMultiplier;

    public RogueClass()
    {
        stats = new Stats();

        stats.setMaxHealth(125);
        stats.setMaxMana(75);

        stats.setHealth(stats.getMaxHealth());
        stats.setMana(stats.getMaxMana());

        stats.setLuck(3);
        stats.setCharisma(3);

        stats.setAgility(6);
        stats.setIntelligence(2);
        stats.setStrength(2);

        stats.setMagicAttack(4);
        stats.setMagicDefence(4);
        stats.setPhysicalAttack(6);
        stats.setPhysicalDefence(6);

        statMultiplier = new Stats();

        statMultiplier.setMaxHealth(10);
        statMultiplier.setMaxMana(10);

        statMultiplier.setLuck(1);
        statMultiplier.setCharisma(1);

        statMultiplier.setAgility(3);
        statMultiplier.setIntelligence(1);
        statMultiplier.setStrength(1);

        statMultiplier.setMagicAttack(2);
        statMultiplier.setMagicDefence(2);
        statMultiplier.setPhysicalAttack(3);
        statMultiplier.setPhysicalDefence(3);
    }

    @Override
    public Stats getStats()
    {
        return stats;
    }

    @Override
    public void specialMove()
    {

    }
}
