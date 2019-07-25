public class JenkinsConfigure{

    public static void main(String [] args){
        String [] arrOfVar = new String[3];
        arrOfVar [0] = "Hello ";
        arrOfVar [1] = "World";
        arrOfVar [2] = "!\n";

        for (String var : arrOfVar){
            System.out.print(var);
        }
        System.out.println("Bye! and bye!");
    }
}
