package com.example.WebAppLabsSamGTU.zControllers;

import java.io.IOException;

public class ForeignProcessThread extends Thread {

    private volatile Process process;

    public void run() {
        Runtime runtime = Runtime.getRuntime();
        try {
            this.process = runtime.exec("C:\\Users\\abug0122\\programms\\TobiiAppTest(1)\\TobiiAppTest\\bin\\Debug\\netcoreapp3.1\\TobiiAppTest.exe");
            synchronized (this.process) {
                this.process.wait();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Process getProcess() {
        return this.process;
    }
}
