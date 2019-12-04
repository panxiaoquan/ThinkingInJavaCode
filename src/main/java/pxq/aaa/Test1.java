package pxq.aaa;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;


/**
 * @describe:
 * @user: pxq
 * @date: 2019/12/3 9:27
 */
public class Test1 {
    private static final Logger logger = LoggerFactory.getLogger(Test1.class);
   @Test
    public void test1(){
       FileReader fr = null;
       FileWriter fw = null;
       try{
           fr = new FileReader("C:\\Users\\pxq\\Desktop\\plan.bak2");
           fw = new FileWriter("C:\\Users\\pxq\\Desktop\\plan.bak1");
           char[] buf = new char[10];
           int length;
           while((length=fr.read(buf))!=-1){//将文件内容读到buf中，返回值为读取的大小B，返回-1表示读取最后一个字符
               fw.write(buf,0,length);//将buf的内容写入文件，写入数组中0开始长度为length的值
           }
       }catch (IOException e){
           logger.error("IO流有误差"+e);
       }finally {
           if (fr!=null){
               try{
                   fr.close();
               }catch (IOException e){
                   e.printStackTrace();
               }
           }
           if (fw!=null){
               try{
                   fw.close();
               }catch (IOException e){
                   e.printStackTrace();
               }
           }
       }
   }

   @Test
    public void test2(){
       File file = new File("C:\\Users\\pxq\\Desktop\\Plan.bak");
       if (file.exists()){
           System.out.println("文件已存在");
           logger.info("129223894");
           return;
       }
       try{
           file.createNewFile();
       }catch(Exception e){
           e.printStackTrace();
       }
   }

    @Test
    public void test3(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("C:\\Users\\pxq\\Desktop\\111.jpg");
            fos = new FileOutputStream("C:\\Users\\pxq\\Desktop\\222.jpg");
            byte[] buf = new byte[10];
            int length;
            while((length=fis.read(buf))!=-1){//将文件内容读到buf中，返回值为读取的大小B，返回-1表示读取最后一个字符
                fos.write(buf,0,length);//将buf的内容写入文件，写入数组中0开始长度为length的值
            }
        }catch (IOException e){
            logger.error("IO流有误差"+e);
        }finally {
            if (fis!=null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try{
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test4() {
        try {
            FileReader fr = new FileReader("C:\\Users\\pxq\\Desktop\\Plan.bak");
            int ch = 0;
            while ((ch = fr.read()) != -1) {
                System.out.println( ch);
            }
        }catch (IOException e){}
    }

    @Test
    public void test5(){
       try{
           BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\pxq\\Desktop\\Plan.bak")),"gbk"));
           String data = null;
           while ((data = br.readLine())!= null){
               System.out.println(data);
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }

}
