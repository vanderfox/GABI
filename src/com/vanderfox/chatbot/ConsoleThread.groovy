package com.vanderfox.chatbot

/**
 * Created by lfox on 6/27/17.
 */
class ConsoleThread extends Thread{

    boolean stopThread = false

    public void run() {
        println "Starting Console Thread"
        while (!stopThread) {
            Scanner scan = new Scanner(System.in);
            String commandString = scan.nextLine()
            evaluateCommand(commandString)
            sleep(1000)
        }

    }

    private void evaluateCommand(commandString) {
        switch (commandString) {
            case ~/quit/:
                stopProcess()
                break
            case ~/help/:
                helpMessage()
                break
            default:
                println "I don't know how to $commandString"
        }
    }

    private void stopProcess() {
        println "Stopping the server"
        stopThread = true
    }

    private void helpMessage() {
        println "quit:  stop the server"
        println "help:  display help"
    }
}