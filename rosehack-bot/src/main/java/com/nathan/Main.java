package com.nathan;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN.token);
        jdaBuilder.enableIntents(GatewayIntent.MESSAGE_CONTENT);
        JDA jda = jdaBuilder.build();

        System.out.println("Hello, World!");
        jda.addEventListener(new Listeners());
    }
}
