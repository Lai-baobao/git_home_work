import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class Texttwo {
   static FileReader in;
   static FileOutputStream out;
   static  FileInputStream In;
   static FileChannel file;
   static FileChannel file1;
   static MappedByteBuffer by;
 // static BufferedReader reader;
  static File f;
  static  File f1;
   public static void main(String[] args) {
      f=new File("F:\\java 项目\\src\\article.txt");
      try {
         out =new FileOutputStream(f);
     f1=new File("F:\\java 项目\\src\\people.java");

      } catch (Exception e) {
         e.printStackTrace();
      }
       try {
           file =new FileInputStream(f1).getChannel();
           file1=out.getChannel();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }

      try {
         by= file.map(FileChannel.MapMode.READ_ONLY,0,f1.length());
      } catch (IOException e) {
        System.out.println(e.toString());
      }
      try {
         file1.write(by);
         System.out.println("输入文本成功");

      } catch (IOException e) {
         System.out.println(e.toString());
      }


   }


   }


