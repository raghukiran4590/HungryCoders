package src.main.java.IO;

import java.io.File;
import java.nio.file.*;

public class DirectoryWatcherExample {

    public static void main(String[] args) throws Exception {
        // Create a WatchService
        WatchService watchService = FileSystems.getDefault().newWatchService();

        // Get the directory to watch
        Path directory = Paths.get("path/to/directory"); // Directory to watch

        // Register the directory with the WatchService
        directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

        // Enter the main event loop
        while (true) {
            // Wait for events
            WatchKey key = watchService.take();

            // Iterate over the events
            for (WatchEvent<?> event : key.pollEvents()) {
                // Handle each event
                if (event.kind() == StandardWatchEventKinds.OVERFLOW) {
                    System.out.println("Overflow event occurred.");
                    continue;
                }

                WatchEvent<Path> ev = (WatchEvent<Path>) event;
                Path filename = ev.context();

                // Print the event type and filename
                System.out.println(event.kind() + ": " + filename);
            }

            // Reset the key
            boolean valid = key.reset();
            if (!valid) {
                // Key is no longer valid, exit the loop
                break;
            }
        }
    }
}
