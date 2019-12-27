import java.io.*;

public class ft2 {
    static int counter = 0;
    static int num_words = 0;

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("C:\\Users\\bgweb\\IdeaProjects\\files\\out\\production\\files\\ft2.txt")) {
            int c;
            while((c=reader.read())!=-1){
                if(!Character.isWhitespace((char)c)) {
                    if((char)c == 'r' || (char)c == '\r' || (char)c == '\n') {
                        counter++;
                    }
                } else {
                    if(counter >= 3) num_words++;
                    counter = 0;
                }
                //System.out.print((char)c);
            }
            if(counter >= 3) num_words++;
            System.out.println(num_words);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
