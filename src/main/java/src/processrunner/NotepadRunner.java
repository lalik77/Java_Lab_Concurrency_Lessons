package processrunner;

import java.io.IOException;

// Demonstartes running a process from Java - launch from test
// Lesson from 02 september

public class NotepadRunner {

    public void runAndDestroy() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        Process p = processBuilder.command("notepad.exe").start();
        Thread.sleep(4000);
        p.destroy();
    }
}
