package org.example;


import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.Buffer;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws Exception{
        String url="https://api.chucknorris.io/jokes/random";
        HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient httpClient=HttpClient.newBuilder().build();
        HttpResponse<String> httpResponse=httpClient.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}