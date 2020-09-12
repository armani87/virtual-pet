import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet myVirtualPet = new VirtualPet(5,5 , 5, 5,5, "BJ");

        System.out.println("Welcome to V-PET LIVE!!!");
        System.out.println("ENTER YOUR PET NAME!!!");
        String PetName = input.nextLine();
        PetName = input.nextLine();

        System.out.println("Please choose an option ");
        System.out.println("Press 0 Check your V-Pet Levels");
        System.out.println("Press 1 Feed your V-Pet");
        System.out.println("Press 2 Walk your V-Pet");
        System.out.println("Press 3 Give your V-Pet water");
        System.out.println("Press 3 Play with your V-Pet");
        System.out.println("Press 4 to exit");
        String userChoice = input.nextLine();

        while(!userChoice.equals("5")){
            if(userChoice.equals("0"))
                System.out.println("Your V-Pet name is" +myVirtualPet.getPetName() + "Your V-Pet Hunger is" + myVirtualPet.getHunger() + "Your V-Pet Happiness is" + myVirtualPet.getHappiness() + "Your V-Pet Thirst is" + myVirtualPet.getThirst() + "Your V-Pet Boredom is" + myVirtualPet.getBoredom());
            else if(userChoice.equals("1")){
                System.out.println("Feed your V-Pet");
                int feedVirtualPet = input.nextInt();
                myVirtualPet.feed(feedVirtualPet);
                input.nextLine();

            }else if(userChoice.equals("2")){
                System.out.println("Walk your V-Pet");
                int walkVirtualPet = input.nextInt();
                myVirtualPet.feed(walkVirtualPet);
                input.nextLine();


            }else if(userChoice.equals("3")){
                System.out.println("Give Water to your V-Pet");
                int waterVirtualPet = input.nextInt();
                myVirtualPet.feed(waterVirtualPet);
                input.nextLine();

            }else if(userChoice.equals("4")) {
                System.out.println("Play your V-Pet");
                int playVirtualPet = input.nextInt();
                myVirtualPet.feed(playVirtualPet);
                input.nextLine();

            }else {
                System.out.println("Please choose an option");
            }

            System.out.println("Press 0 Check your V-Pet Levels");
            System.out.println("Press 1 Feed your V-Pet");
            System.out.println("Press 2 Walk your V-Pet");
            System.out.println("Press 3 Give your V-Pet water");
            System.out.println("Press 3 Play with your V-Pet");
            System.out.println("Press 4 Exit");
            userChoice = input.nextLine();

        }

            System.out.println("See you later REMEMBER CHECK ON YOUR V-Pet");

    }
}
