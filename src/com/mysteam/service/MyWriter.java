package com.mysteam.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MyWriter {

    private ArrayList<String> illegalWords;//非法词汇

   private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        illegalWords=readIllegalWords(address);
    }

    //屏蔽函数
    public  String pb(String s) {
        //todo 优化算法
        StringBuffer sb=new StringBuffer(s);
        char ch = '*';
       // ArrayList<String> illegalWords=readIllegalWords("badwords.txt");
        for (String oldStr :illegalWords ) {
            int i = sb.indexOf(oldStr);
            int oldLen = oldStr.length();
            while (i > -1) {
                for (int j = 0; j < oldLen; j++) {
                    sb.setCharAt(i + j, ch);
                }
                i = sb.indexOf(oldStr, i + oldLen);
            }
        }
        return sb.toString();
    }
    //加载非法词汇
    //TODO 优化词汇来源，不可能所有词汇都加载倒内存中
    public   ArrayList<String> readIllegalWords(String illegalWordsFile) {
        ArrayList nillegalWords = new ArrayList<String>();
        try {
            Scanner in = new Scanner(new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(illegalWordsFile))));
            while (in.hasNext()) {
                nillegalWords.add(in.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return nillegalWords;
    }
}
