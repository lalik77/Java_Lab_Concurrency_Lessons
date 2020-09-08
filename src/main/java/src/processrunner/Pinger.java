package processrunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//  Lesson 2020/09/02
public class Pinger {

    public String pingSite() throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        Process p = processBuilder.command("cmd.exe", "/c", "ping -n 3 google.com").start();

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
            sb.append(line);
        }

        return sb.toString();
    }

}
