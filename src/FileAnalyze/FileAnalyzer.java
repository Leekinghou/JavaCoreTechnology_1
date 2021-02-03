//package FileAnalyze;
//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.file.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class FileAnalyzer {
//    private String fileStr;
//
//    public FileAnalyzer(String fileStr){
//        this.fileStr = fileStr;
//    }
//
//    /**
//     * getWordCount()获取一个文件内的单词数
//     * @return
//     * */
//
//    public HashMap<String,Word> getWordCount()
//    {
//        HashMap<String,Word> result = new HashMap<String, Word>();
//
//        String line;
//        try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileStr)))){
//            while((line = in.readLine())!=null){
//                String []words = line.split(" ");
//                for(String word:words){
//                    if(null != word && word.length() > 0){
//                        if(result.containsKey(word))
//                        {
//                            Word w = result.get(word);
//                            w.setTimes(w.getTimes() + 1);
//                        }
//                    }
//                }
//            }
//        }
//        catch (Exception ex)
//        {
//            ex.printStackTrace();
//        }
//        return result;
//    }
//}
//
//class Searcher implements FileVisitor {
//    private final PathMatcher matcher;
//    private ArrayList<String> filePaths = new ArrayList<String>();
//
//    public Searcher(String ext) {
//        matcher = FileSystems.getDefault().getPathMatcher("glob:" + ext);
//    }
//
//    public void judgeFile(Path file)throws IOException{
//        Path name = file.getFileName();
//    }
//}