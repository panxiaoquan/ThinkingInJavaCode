import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @describe:IO流
 * @user: pxq
 * @date: 2019/12/3 15:44
 */
public class Thinking001 {
    public static void main(String[] args) {
        File file = new File("D:\\job\\project\\TestExport\\src\\test\\resources\\IOStream.txt");
        try{
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("")));
            } catch (Exception e){
        }
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.isDirectory());
        System.out.println(file.length());
        System.out.println(file.lastModified());
    }
}
