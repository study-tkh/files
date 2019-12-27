import java.io.*;

public class ft1 {
    static int counter = 0;

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("C:\\Users\\bgweb\\IdeaProjects\\files\\out\\production\\files\\ft1.txt")) {
            int c;
            while((c=reader.read())!=-1){
                if((char)c == 'r') {
                    counter++;
                }
                //System.out.print((char)c);
            }
            System.out.println(counter);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
