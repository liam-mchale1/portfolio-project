package components.playablecharacter;

import components.standard.Standard;

/**
 *
 * Kernel methods for PlayableCharacter component. PlayableCharacter has four
 * values associated with it: Level, strength, intelligence, and speed. Level
 * can be any int from 1 to Integer.MAX_VALUE with a default value of 1, and
 * strength, intelligence, and speed can be any int from 0 to Integer.MAX_VALUE,
 * with a default value of 0.
 *
 * @author Liam McHale
 */
public interface PlayableCharacterKernel extends Standard<PlayableCharacter> {

    /**
     *
     * Traits are the skills that the PlayableCharacter component possesses.
     */
    enum Trait {
        STRENGTH, INTELLIGENCE, SPEED
    }

    /**
     * Changes the value assigned to a certain trait of the character.
     *
     * @param trait
     *            The trait which will have its value changed. Must be one of
     *            three traits (STRENGTH, INTELLIGENCE, SPEED)
     * @param value
     *            The numerical value the trait will be set at
     * @updates this
     *
     * @requires trait != null and value >= 0
     *
     * @ensures this.traitValue(trait) = value and [all other traits and
     *          character level are unchanged]
     */
    void setTrait(Trait trait, int value);

    /**
     * Returns the numerical value associated with the given Trait.
     *
     * @param trait
     *            The trait that the value will be read from
     *
     * @return The value assigned to the trait
     *
     * @requires trait != null
     *
     * @ensures traitValue = [the value of the selected trait]
     *
     */
    int traitValue(Trait trait);

    /**
     * Sets the level of the character to the given level.
     *
     * @param level
     *            The level that the character will be set to
     * @updates this
     *
     * @requires level >= 1
     *
     * @ensures this.level = level and [all traits will be left unchanged]
     */
    void setLevel(int level);

    /**
     * Returns the level of the character.
     *
     * @return The level of this
     *
     * @ensures level = [the current level of the character]
     */
    int level();
}
