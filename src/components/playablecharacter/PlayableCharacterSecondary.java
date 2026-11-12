package components.playablecharacter;

/**
 *
 * PlayableCharacterSecondary implements operations using kernel methods.
 */
public abstract class PlayableCharacterSecondary implements PlayableCharacter {

    @Override
    public void levelUp() {
        int level = this.level();
        assert level < Integer.MAX_VALUE : "Violation of: level < Integer.MAX_VALUE";
        this.setLevel(level + 1);
    }

    @Override
    public void increaseTrait(Trait trait, int amount) {
        assert trait != null : "Violation of: trait != null";
        assert amount > 0 : "Violation of: amount > 0";
        int traitValue = this.traitValue(trait);
        assert amount <= Integer.MAX_VALUE
                - traitValue : "Violation of: amount <= Integer.MAX_VALUE - traitValue";
        this.setTrait(trait, traitValue + amount);
    }

    @Override
    public long totalTraitPoints() {
        int strengthPoints = this.traitValue(Trait.STRENGTH);
        int speedPoints = this.traitValue(Trait.SPEED);
        int intelligencePoints = this.traitValue(Trait.INTELLIGENCE);
        return (long) strengthPoints + speedPoints + intelligencePoints;
    }

    @Override
    public String toString() {
        return "Level: " + this.level() + ", Strength: "
                + this.traitValue(Trait.STRENGTH) + ", Speed: "
                + this.traitValue(Trait.SPEED) + ", Intelligence: "
                + this.traitValue(Trait.INTELLIGENCE);
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if (obj instanceof PlayableCharacter) {
            PlayableCharacter other = (PlayableCharacter) obj;
            isEqual = this.level() == other.level()
                    && this.traitValue(Trait.STRENGTH) == other
                            .traitValue(Trait.STRENGTH)
                    && this.traitValue(Trait.SPEED) == other
                            .traitValue(Trait.SPEED)
                    && this.traitValue(Trait.INTELLIGENCE) == other
                            .traitValue(Trait.INTELLIGENCE);
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return this.level() + this.traitValue(Trait.STRENGTH)
                + this.traitValue(Trait.SPEED)
                + this.traitValue(Trait.INTELLIGENCE);
    }
}
