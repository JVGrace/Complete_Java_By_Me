import java.io.*;
public class readwriteExample {
    public static void main(String[] args) throws IOException{

        try(FileReader fw=new FileReader("D:\\FrontendGit\\CssExamples\\css.txt");){
            int value =fw.read();
            String result="";
            while(value!=-1){
                result=result+(char)value;
                value=fw.read();
            }
            System.out.println(result);
        }
    }


}
