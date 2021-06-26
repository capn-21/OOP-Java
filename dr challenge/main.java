import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Name : Tom");
        System.out.println(("Age  : 26"));

        System.out.println("Choose an Organ:");
        System.out.println("\t1.left Eye");
        System.out.println("\t2.Right Eye");
        System.out.println("\t3.Heart");
        System.out.println("\t4.Stomach");
        System.out.println("\t5.Skin");
        System.out.println("\t6.Exit");
        System.out.println("\n");
        Scanner sc=new Scanner(System.in);

        int choice=0;
    do {
         choice = sc.nextInt();

        switch (choice) {

            case 1:
                eye lefteye = new eye("Left eye", "Short sigheted", "blue");

                System.out.println("\tName :" + lefteye.getName());
                System.out.println("\tMedical Condition :" + lefteye.getCondition());
                System.out.println("\tEye colour:" + lefteye.getColor());
                System.out.println("      1.Close the Eye");
                int eyech= sc.nextInt();
                if(eyech==1){
                    System.out.println("Eye closed");break;
                }else{
                    System.out.println("Eye not closed.. moving forward");
                    break;
                }



            case 2:
                eye righteye=new eye("Right Eye","Normal","blue");
                System.out.println("\tName :" + righteye.getName());
                System.out.println("\tMedical Condition :" + righteye.getCondition());
                System.out.println("\tEye colour:" + righteye.getColor());
                System.out.println("      1.Close the Eye");
                int eyecho= sc.nextInt();
                if(eyecho==1){
                    System.out.println("Eye closed");break;
                }else{
                    System.out.println("Eye not closed.. moving forward");
                    break;
                }

            case 3:
                heart h=new heart("Heart","normal",67);
                System.out.println("\tName :"+h.getName());
                System.out.println("\tMedical Condition :"+h.getCondition());
                System.out.println("\tHeart Rate : "+h.getHeartrate());
                System.out.println("\t\t 1.Change the Heart rate");
                int heartchoice=sc.nextInt();
                if(heartchoice==1){
                    System.out.println("\t\tEnter the Heart rate");
                    int heartrate=sc.nextInt();
                    h.setHeartrate(heartrate);
                    System.out.println("\t\tHeart rate changed to:"+h.getHeartrate());break;

                }else{
                    System.out.println("Heart rate unchanged Moving forward");
                }

            case 4:
                stomach pot=new stomach("Stomach","PUD","Need to be Fed");
                System.out.println("\tName :"+pot.getName());
                System.out.println("\tMedical Condition :"+pot.getCondition());
                System.out.println(("\t"+pot.getFed()));
                System.out.println(("\t\t1.Digest"));

                int digest= sc.nextInt();
                if(digest==1){
                    System.out.println("Food digested");break;
                }else{
                    System.out.println("Food not digested");
                    break;
                }

            case 5:skin skin=new skin("Skin","burned");
                System.out.println("\tName :"+skin.getName());
                System.out.println("\tMedical Condition :"+skin.getCondition());break;

            case 6:    System.out.println("Exiting the program..........");break;
            default:
                System.out.println("Exiting the program..........");break;


        }
        System.out.println("\n");
        System.out.println("Choose an Organ:");
        System.out.println("\t1.left Eye");
        System.out.println("\t2.Right Eye");
        System.out.println("\t3.Heart");
        System.out.println("\t4.Stomach");
        System.out.println("\t5.Skin");
        System.out.println("\t6.Exit");
        System.out.println("\n");


    }while(choice<6);

    }
}
