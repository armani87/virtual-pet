public class VirtualPet {

    private int actualDay;
    private int hungerBalance;
    private int happinessBalance;
    private int thirstBalance;
    private int boredomBalance;
    private final String petName;

    public int getDay() {
        return actualDay;
    }
    public int getHunger() {
        return hungerBalance;
    }
    public int getHappiness() {
        return happinessBalance;
    }
    public int getThirst() {
        return thirstBalance;
    }
    public int getBoredom() {
        return boredomBalance;
    }
    public String getPetName() {
        return petName;
    }

    //Constructor
    public VirtualPet(int actualDay ,int hungerBalance ,int happinessBalance ,int thirstBalance ,int boredomBalance ,String petName){
        this.actualDay = actualDay;
        this.hungerBalance = hungerBalance;
        this.happinessBalance = happinessBalance;
        this.thirstBalance = thirstBalance;
        this.boredomBalance = boredomBalance;
        this.petName = petName;
    }



    public int feed(int feedVirtualPet) {
        if (feedVirtualPet > hungerBalance){
            hungerBalance -= 0;
        } else {
            hungerBalance += feedVirtualPet;
        }

        return hungerBalance;
    }

    public void walk(int walkVirtualPet) {
        if (walkVirtualPet > happinessBalance){
            happinessBalance -= 0;
        } else {
            happinessBalance += walkVirtualPet;
        }


    }

    public void water(int waterVirtualPet) {
        if (waterVirtualPet > thirstBalance) {
            thirstBalance -= 0;
        } else {
            thirstBalance -= waterVirtualPet;
        }


    }

    public void play(int playVirtualPet) {
        if (playVirtualPet > this.boredomBalance) {
            playVirtualPet -= 0;
        } else {
            playVirtualPet -= boredomBalance;
        }


    }

}
