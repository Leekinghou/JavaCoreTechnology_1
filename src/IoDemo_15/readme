# 文件读写

## 概述
- 文件系统是由OS管理的
- 文件系统和Java进程是平行的，是两套系统
- 文件系统由文件夹和文件递归组合而成
- 文件目录分隔符
	- Linux/Unix用 / 隔开
	- Windows用 \ 隔开，实际到转义，在程序中需要用 / 或 \\代替
- 文件包括文件里面的内容和文件基本属性

### 文件基本属性
- 名称
- 大小
- 扩展名
- 修改时间

## Java文件类File
- java.io.File是文件和目录的重要类
	 - 目录也使用File类进行表示
- File类与OS无关，但是受到OS的权限限制

## 常用方法
- createNewFile, delete, exists, getAbsolutePath,

- getName,getParent,getPath,isDirectory,

- isFile,length,listFiles,mkdir,mkdirs

### 注意
- File不涉及具体文件内容，只涉及属性
- FileAttributeTest.java
	- 一些函数

## Java NIO
- Java 7出现的NIO包，提出新的文件系统类
	- Path,Files,DirectoryStream,FileVisitor,FileSystem
	- 是java.io.File的有效补充
		- 文件复制和移动
		- 文件相对路径
		- 递归遍历目录
		- 递归删除目录
		- ……

# 文本文件读写
- 文本类型
	- 一般文本文件，如txt
	- 一般二进制文件，如dat
	- 带特殊格式的文本文件，如xml
	- 带特殊格式二进制文件，如doc，ppt
- 文件是数据的一个容器(口袋)
- 文件很大，注定java只能用`流形式`依次处理

## 写文件
- 先创建文件，写入数据，关闭文件
	- FileOutputStream,OutputStreamWriter,BufferedWriter
- BufferWriter
	- write
	- newLine
- try-resource语句，自动关闭资源
- 关闭最外层的数据流，将会把其上所有的数据流关闭
- 查看例子TxtFileWrite.java

## 读文件
- 先打开文件，逐行读入数据，关闭文件
	- FileInputStream, InputStream Writer, BufferedReader
- BufferReader
	- readLine
- try-resource语句，自动关闭资源
- 关闭最外层的数据流，将会把其上所有的数据流关闭
- 查看例子TxtFileRead.java
# 二进制文件读写
……
# Zip文件读写
……
## 总结
- 文件系统和Java是两套并列的系统
- File类是文件基本属性操作的主要类
- Java 7提出的NIO包有重要的新功能
### 文本文件
- 理解节点类、转换类和装饰类的联合用法
- 尽量使用try-resource语句，自动关闭资源






















































