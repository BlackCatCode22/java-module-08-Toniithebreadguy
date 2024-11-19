package com.Jose.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public String getGreeting() {
        return "*****Hi, This is Jose*****" + "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Poem Page</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f4f4f9;\n" +
                "            margin: 0;\n" +
                "            padding: 20px;\n" +
                "        }\n" +
                "        .poem {\n" +
                "            color: red;\n" +
                "            font-size: 24px;\n" +
                "            line-height: 1.6;\n" +
                "            margin: 20px auto;\n" +
                "            width: 80%;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"poem\">\n" +
                "        <h1>A Poem of Life</h1>\n" +
                "        <p>Through fields of gold, we walk with grace,</p>\n" +
                "        <p>Where sunlit rays bring light to space.</p>\n" +
                "        <p>The winds that blow, the skies so wide,</p>\n" +
                "        <p>In nature's arms, we gently bide.</p>\n" +
                "        <p>For every heart that seeks to find,</p>\n" +
                "        <p>A simple peace, a quiet mind.</p>\n" +
                "        <p>So let us roam and chase the day,</p>\n" +
                "        <p>In colors bright, we'll find our way.</p>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
    }
}

