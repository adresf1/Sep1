package com.example.sep1;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class JsonDataLoader
{
  //Får at finde navnet på det JSON-filer der er oprettet bruger jeg loadJsonData funktionen til at finde filepathen og læser det som en streng.
  // Retunere strengen og bruger i min server.
  public static String loadJsonData(String filePath) throws IOException {
    byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
    return new String(jsonData);
  }
}
