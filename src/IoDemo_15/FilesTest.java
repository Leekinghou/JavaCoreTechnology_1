package IoDemo_15;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

public class FilesTest {
    public static void main(String []args){

    }
    public static void moveFile() {
        Path from = Paths.get("./temp", "abc.txt");
        //移动./temp/abc.txt 到./test/def.txt,如果目标已经存在就替换
        Path to = from.getParent().resolve("test/def.txt");
        try {
            //文件的大小bytes
            System.out.println(Files.size(from));
            Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println("移动文件错误" + e.getMessage());
        }
    }
    public static void fileAttributes()
    {
            Path path = Paths.get("./temp");
            //1
            System.out.println(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS));
            //2
        try{
            //获得文件的基础属性
            BasicFileAttributes attributes = Files.readAttributes(path,BasicFileAttributes.class);
            System.out.println(attributes.isDirectory());
            System.out.println(new Date(attributes.lastAccessTime().toMillis()));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void createDirectory(){
        Path path = Paths.get("./temp/test");
        try{
            if(Files.notExists(path)){
                Files.createDirectory(path);
                System.out.println("create dir");
            }else{
                System.out.println("dir exists");
            }
            Path path2 = path.resolve("A.java");
            Path path3 = path.resolve("B.java");
            Path path4 = path.resolve("C.txt");
            Path path5 = path.resolve("D.jpg");
            Files.createFile(path2);
            Files.createFile(path3);
            Files.createFile(path4);
            Files.createFile(path5);

            //不加文件就遍历
            DirectoryStream<Path> paths = Files.newDirectoryStream(path);
            for(Path p:paths){
                System.out.println(p.getFileName());
            }
            System.out.println();
            //创建一个带有过滤器，过滤文件名以java txt 结尾的文件
            DirectoryStream<Path> pathsFilter = Files.newDirectoryStream(path,"*.{java,txt}");
            for(Path p:pathsFilter){
                System.out.println(p.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

