package GameClasses;

import character.Stats;

public class MageClass extends GameClass
{
    public MageClass()
    {
        stats = new Stats();

        stats.setMaxHealth(175);
        stats.setMaxMana(125);

        stats.setHealth(stats.getMaxHealth());
        stats.setMana(stats.getMaxMana());

        stats.setLuck(3);
        stats.setCharisma(3);

        stats.setAgility(2);
        stats.setIntelligence(6);
        stats.setStrength(2);

        stats.setMagicAttack(10);
        stats.setMagicDefence(10);
        stats.setPhysicalAttack(2);
        stats.setPhysicalDefence(2);

        statMultiplier = new Stats();

        statMultiplier.setMaxHealth(5);
        statMultiplier.setMaxMana(20);

        statMultiplier.setLuck(1);
        statMultiplier.setCharisma(1);

        statMultiplier.setAgility(1);
        statMultiplier.setIntelligence(3);
        statMultiplier.setStrength(1);

        statMultiplier.setMagicAttack(4);
        statMultiplier.setMagicDefence(4);
        statMultiplier.setPhysicalAttack(1);
        statMultiplier.setPhysicalDefence(1);
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
