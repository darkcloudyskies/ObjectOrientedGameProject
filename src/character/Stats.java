package character;


public class Stats
{
    private int level;
    private float experience;

    private float health;
    private float mana;

    private float maxHealth;
    private float maxMana;

    private int luck;
    private int charisma;

    private int agility;
    private int intelligence;
    private int strength;

    private float physicalDefence;
    private float physicalAttack;
    private float magicDefence;
    private float magicAttack;

    public static void add(Stats first, Stats second)
    {
        first.setMaxHealth(first.getMaxHealth()+second.getMaxHealth());
        first.setMaxMana(first.getMaxMana()+second.getMaxMana());

        first.setLuck(first.getLuck()+second.getLuck());
        first.setCharisma(first.getCharisma()+second.getCharisma());

        first.setAgility(first.getAgility()+second.getAgility());
        first.setIntelligence(first.getIntelligence()+second.getIntelligence());
        first.setStrength(first.getStrength()+second.getStrength());

        first.setMagicAttack(first.getMagicAttack()+second.getMagicAttack());
        first.setMagicDefence(first.getMagicDefence()+second.getMagicDefence());
        first.setPhysicalAttack(first.getPhysicalAttack()+second.getPhysicalAttack());
        first.setPhysicalDefence(first.getPhysicalDefence()+second.getPhysicalDefence());
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public float getExperience()
    {
        return experience;
    }

    public void setExperience(float experience)
    {
        this.experience = experience;
    }

    public float getMaxHealth()
    {
        return maxHealth;
    }

    public void setMaxHealth(float maxHealth)
    {
        this.maxHealth = maxHealth;
    }

    public float getMaxMana()
    {
        return maxMana;
    }

    public void setMaxMana(float maxMana)
    {
        this.maxMana = maxMana;
    }

    public int getLuck()
    {
        return luck;
    }

    public void setLuck(int luck)
    {
        this.luck = luck;
    }

    public int getAgility()
    {
        return agility;
    }

    public void setAgility(int agility)
    {
        this.agility = agility;
    }

    public int getCharisma()
    {
        return charisma;
    }

    public void setCharisma(int charisma)
    {
        this.charisma = charisma;
    }

    public int getIntelligence()
    {
        return intelligence;
    }

    public void setIntelligence(int intelligence)
    {
        this.intelligence = intelligence;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public float getPhysicalDefence()
    {
        return physicalDefence;
    }

    public void setPhysicalDefence(float physicalDefence)
    {
        this.physicalDefence = physicalDefence;
    }

    public float getPhysicalAttack()
    {
        return physicalAttack;
    }

    public void setPhysicalAttack(float physicalAttack)
    {
        this.physicalAttack = physicalAttack;
    }

    public float getMagicDefence()
    {
        return magicDefence;
    }

    public void setMagicDefence(float magicDefence)
    {
        this.magicDefence = magicDefence;
    }

    public float getMagicAttack()
    {
        return magicAttack;
    }

    public void setMagicAttack(float magicAttack)
    {
        this.magicAttack = magicAttack;
    }

    public float getHealth()
    {
        return health;
    }

    public void setHealth(float health)
    {
        this.health = health;
    }

    public float getMana()
    {
        return mana;
    }

    public void setMana(float mana)
    {
        this.mana = mana;
    }
}
