import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        FileTest fileTest = new FileTest();
        //String rootPath = fileTest.getClass().getClassLoader().getResource("").toString();
        //String rootPath = fileTest.getClass().getClassLoader().getResource("").toString();
        String fileName = fileTest.getClass().getResource("1.txt").getPath();
        //System.out.println(rootPath);
        //System.exit(0);
        //String fileName = rootPath + "1.txt";
        //String fileName = "./1.txt";
        String str = fileTest.readStringFromFile(fileName);
        System.out.println(str);
    }

    private String readStringFromFile(String fileName){
        StringBuffer str = new StringBuffer();
        try {
            File file = new File(fileName); ///Users/bear/IdeaProjects/javanewtest2/target/classes/java_private.pem
            FileReader fr = new FileReader(file);
            char[] temp = new char[1024];
            while (fr.read(temp) != -1) {
                str.append(temp);
            }
            fr.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        return str.toString();
    }

}