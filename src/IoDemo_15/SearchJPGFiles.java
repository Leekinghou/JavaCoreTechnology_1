//package IoDemo_15;
//
//import java.io.IOException;
//import java.nio.file.*;
//import java.nio.file.attribute.BasicFileAttributes;
//import java.util.EnumSet;
//
//class Search implements FileVisitor{
//    private final PathMatcher matcher;
//
//    public Search(String text){
//        matcher = FileSystems.getDefault().getPathMatcher("glob:" + text);
//    }
//    public void judgeFile(Path file) throws IOException{
//        Path name = file.getFileName();
//        if(name != null && matcher.matches(name)){
//            //文件名已经匹配
//            System.out.println("Search file was found:" + name + " in " + file.toRealPath().toString());
//        }
//    }
//    @Override
//    public FileVisitResult postVisitDirectory(Object dir,IOException exc) throws IOException{
//        System.out.println("Visted: " + (Path) dir);
//        return FileVisitResult.CONTINUE;
//    }
//    @Override
//    public FileVisitResult preVisitDirectory(Object dir,IOException attrs) throws IOException{
//        return FileVisitResult.CONTINUE;
//    }
//
//    @Override
//    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
//        return null;
//    }
//
//    @Override
//    public FileVisitResult visitFile(Object dir, BasicFileAttributes attrs) throws IOException{
//        judgeFile((Path) file);
//        return FileVisitResult.CONTINUE;
//    }
//    @Override
//    public FileVisitResult visitFileFailed(Object file,IOException exc) throws IOException{
//        //report an error if necessary
//        return FileVisitResult.CONTINUE;
//    }
//}
//public class SearchJPGFiles {
//    //查找某一个目录下所有jpg文件，包括子文件夹
//    public class SearchJPGFiles(PathMatcher matcher) throws IOException{
//        public static void main(String []args){
//            //定义扩展名，和待查找目录
//            String ext = "*.jpg";
//            Path fileTree = Paths.get("./temp/");
//            Search walk = new Search(ext);
//            EnumSet<FileVisitOption> opts = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
//
//            Files.walkFileTree(fileTree,opts,Integer.MAX_VALUE,walk);
//        }
//    }
//}
