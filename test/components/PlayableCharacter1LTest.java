package components;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.playablecharacter.PlayableCharacter;
import components.playablecharacter.PlayableCharacter1L;
import components.playablecharacter.PlayableCharacterKernel.Trait;

public class PlayableCharacter1LTest {

    @Test
    public void testConstructorDefaults() {
        PlayableCharacter character = new PlayableCharacter1L();
        assertEquals(1, character.level());
        assertEquals(0, character.traitValue(Trait.STRENGTH));
        assertEquals(0, character.traitValue(Trait.SPEED));
        assertEquals(0, character.traitValue(Trait.INTELLIGENCE));
    }

    @Test
    public void testSetLevel() {
        PlayableCharacter character = new PlayableCharacter1L();
    }
}
