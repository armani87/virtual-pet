import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VirtualPetTest {

    @Test
    public void tickMethodTrackingDays(){
        //Arrange
        VirtualPet underTest = new VirtualPet(1, 5,5,5,5,"");
        //Act
        int actualDay = underTest.getDay();
        //Assert
        Assert.assertEquals(actualDay, is(1));
    }
    @Test
    public void shouldShowPetName(){
        VirtualPet underTest = new VirtualPet(1, 5,5,5,5,"");
        String petName = underTest.getPetName();
        assertThat(petName, is(""));
    }
    @Test
    public void shouldShowHungerBalanceOf5(){
        VirtualPet underTest = new VirtualPet(1, 5,5,5,5,"");
        int hungerBalance = underTest.getHunger();
        assertThat(hungerBalance, is(5));
    }

    @Test
    public void shouldShowHappinessBalanceOf5(){
        VirtualPet underTest = new VirtualPet(1, 5,5,5,5,"");
        int happinessBalance = underTest.getHappiness();
        assertThat(happinessBalance, is(5));
    }

    @Test
    public void shouldShowThirstBalanceOf5(){
        VirtualPet underTest = new VirtualPet(1, 5,5,5,5,"");
        int thirstBalance = underTest.getThirst();
        assertThat(thirstBalance, is(5));
    }

    @Test
    public void shouldShowBoredomBalanceOf5(){
        VirtualPet underTest = new VirtualPet(1, 5,5,5,5,"");
        int BoredomBalance = underTest.getBoredom();
        assertThat(BoredomBalance, is(5));
    }


}
