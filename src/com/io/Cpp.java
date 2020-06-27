package com.io;

import java.io.*;

public class Cpp {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\project\\depsoft\\P111129__VMDSPlugins\\trunk\\develop\\");
        print(file,1);
    }

    private static void print(File rootfile, int level) throws IOException {
        File files[]=rootfile.listFiles();
        if(files!=null) {
            for(File file:files) {
                if(file.isFile()) {//是文件
                    //printlevel(level);
                    if (file.getName().endsWith(".cpp")) {
                        System.out.println("#######"+file.getCanonicalPath());
                        getFileEx(file.getCanonicalPath());
                    }
                }else {//是目录
                    //printlevel(level);
                    //System.out.println(file.getName());
                    print(file,level+1);
                }
            }
        }
    }

    private static void getFileEx(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = "";
        int index = 0;
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        // 读取每行
        while((line=br.readLine())!=null){
            if (line.indexOf("GM_REGISTER_METHOD(pEngine,this,") != -1){
                // 找到包含行
                System.out.println(line);
//                index = line.indexOf(",",line.indexOf(",") + 1);
//                index1 = line.indexOf(",", index);
//                System.out.println("func = "+line.substring(index, index1+1));
            }
        }
        br.close();
    }
}
