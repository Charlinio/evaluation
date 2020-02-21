package com.evaluation.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWR implements Runnable{

    private File f;
    private FileWriter fw;
    private BufferedWriter bw;
    private int i;

    public FileWR() {
        this.f = new File("runnable.dat");
        i = 0;
    }

    @Override
    public void run() {
        while (i < 50) {
            try {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write(Thread.currentThread().getName() + ": " + i++ + '\n');
                bw.close();
                fw.close();
                Thread.sleep(100);
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
