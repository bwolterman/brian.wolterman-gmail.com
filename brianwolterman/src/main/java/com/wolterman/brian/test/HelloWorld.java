package com.wolterman.brian.test;

import org.eclipse.jetty.server.Server;


public class HelloWorld
{
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
        server.start();
        server.dumpStdErr();
        server.join();
    }
}