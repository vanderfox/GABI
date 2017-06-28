package com.vanderfox.chatbot

/**
 * Created by lfox on 6/27/17.
 */
class ControlThread extends Thread{

    boolean stopThread = true

    public void run() {
        println "Starting Control Thread"
        while (!stopThread) {
            sleep(1000)
            println "G.A.B.I"
        }

    }

}