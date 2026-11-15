package components.playablecharacter;

public class PlayableCharacter1L extends PlayableCharacterSecondary {

    private int level;
    private int strength;
    private int intelligence;
    private int speed;

    private void createNewRep() {
        this.level = 1;
        this.strength = 0;
        this.intelligence = 0;
        this.speed = 0;
    }

    public PlayableCharacter1L() {
        this.createNewRep();
    }

    @Override
    public void clear() {
        this.createNewRep();
    }

    @Override
    public PlayableCharacter newInstance() {
        return new PlayableCharacter1L();
    }

    @Override
    public void transferFrom(PlayableCharacter old) {
        assert old != null : "Violation of: old != null";
        assert old != this : "Violation of: old != this";
        this.level = old.level();
        this.strength = old.traitValue(Trait.STRENGTH);
        this.intelligence = old.traitValue(Trait.INTELLIGENCE);
        this.speed = old.traitValue(Trait.SPEED);
        old.clear();
    }

    @Override
    public int level() {
        return this.level;
    }

    @Override
    public void setLevel(int value) {
        assert value >= 1 : "Violation of: value >= 1";
        this.level = value;
    }

    @Override
    public int traitValue(Trait trait) {
        assert trait != null : "Violation of: trait != null";
        int value;
        if (trait.equals(Trait.INTELLIGENCE)) {
            value = this.intelligence;
        } else if (trait.equals(Trait.SPEED)) {
            value = this.speed;
        } else {
            value = this.strength;
        }
        return value;
    }

    @Override
    public void setTrait(Trait trait, int value) {
        assert trait != null : "Violation of: trait != null";
        assert value >= 0 : "Violation of: value >= 0";
        if (trait.equals(Trait.INTELLIGENCE)) {
            this.intelligence = value;
        } else if (trait.equals(Trait.SPEED)) {
            this.speed = value;
        } else {
            this.strength = value;
        }
    }
}
