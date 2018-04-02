package GameClasses;

import character.Stats;

public class WarriorClass extends GameClass
{
    private Stats stats;
    private Stats statMultiplier;

    public WarriorClass()
    {
        stats = new Stats();



        stats.setMaxHealth(175);
        stats.setMaxMana(25);

        stats.setHealth(stats.getMaxHealth());
        stats.setMana(stats.getMaxMana());

        stats.setLuck(3);
        stats.setCharisma(3);

        stats.setAgility(2);
        stats.setIntelligence(2);
        stats.setStrength(6);

        stats.setMagicAttack(2);
        stats.setMagicDefence(2);
        stats.setPhysicalAttack(10);
        stats.setPhysicalDefence(10);

        statMultiplier = new Stats();

        statMultiplier.setMaxHealth(20);
        statMultiplier.setMaxMana(5);

        statMultiplier.setLuck(1);
        statMultiplier.setCharisma(1);

        statMultiplier.setAgility(1);
        statMultiplier.setIntelligence(1);
        statMultiplier.setStrength(3);

        statMultiplier.setMagicAttack(1);
        statMultiplier.setMagicDefence(1);
        statMultiplier.setPhysicalAttack(4);
        statMultiplier.setPhysicalDefence(4);
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
