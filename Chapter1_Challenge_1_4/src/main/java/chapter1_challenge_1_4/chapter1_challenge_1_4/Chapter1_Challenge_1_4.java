/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chapter1_challenge_1_4.chapter1_challenge_1_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Chapter1_Challenge_1_4 {

    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            // 1. Try to read config.txt
            reader = new BufferedReader(new FileReader("config.txt"));

            // Read first line (config version)
            String versionLine = reader.readLine();
            int version = Integer.parseInt(versionLine);

            // 3. Check config version
            if (version < 2) {
                throw new Exception("Config version too old!");
            }

            // Read second line (file path)
            String path = reader.readLine();

            // 4. Check if file path exists
            File file = new File(path);
            if (!file.exists()) {
                throw new IOException("Configured file path does not exist!");
            }

            System.out.println("Config loaded successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: config.txt file not found.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Config version is not a valid number.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            // 5. Always executes
            System.out.println("Config read attempt finished.");

            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                // silently handle close error
            }
        }
    }
}

    

