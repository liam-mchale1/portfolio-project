package components.playablecharacter;

/**
 * Provides more operations for leveling up, increasing traits, and finding the
 * total number of trait points beyond the kernel methods.
 *
 * @author Liam McHale
 */
public interface PlayableCharacter extends PlayableCharacterKernel {

    /**
     * Increases the charcter's level by one.
     *
     * @updates this
     *
     * @requires this.level < Integer.MAX_VALUE
     *
     * @ensures this.level = #this.level + 1 and [all traits remain unchanged]
     *
     */
    void levelUp();

    /**
     * Increases a trait value by amount.
     *
     * @param trait
     *            The trait which needs to be increased
     * @param amount
     *            The amount the trait needs to be increased by
     * @updates this
     *
     * @requires amount > 0 and trait != null and this.traitValue + amount <=
     *           Integer.MAX_VALUE
     * @ensures this.traitValue(trait) = #this.traitValue(trait) + amount and
     *          [all other trait values and the level are unchanged]
     */
    void increaseTrait(Trait trait, int amount);

    /**
     * Finds the total number of trait points in all traits.
     *
     * @return The sum of the trait values of all traits
     *
     * @ensures totalTraitPoints = [the sum of the trait values of all Traits]
     */
    long totalTraitPoints();
}
