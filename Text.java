import java.io.*;

public class Text   {
   static FileOutputStream out;
     static  FileInputStream in;
     static  ObjectInputStream read;
     static  ObjectOutputStream write;
    public static void main(String[] args) {
      people LVT=new people("Lvt",172,72);
      Text root=new Text();
        try {
             out=new FileOutputStream("F:/java 项目/src/people.txt");
            in=new FileInputStream("F:/java 项目/src/people.txt");
            try {
                write=new ObjectOutputStream(out);
                 read=new ObjectInputStream(in);
            } catch (IOException e) {
                e.printStackTrace();
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            write.writeObject(LVT);
            try {
                people N= (people) read.readObject();
                System.out.println("序列化的类是"+N.name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
