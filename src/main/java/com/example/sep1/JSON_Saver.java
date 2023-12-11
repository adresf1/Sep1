package com.example.sep1;
import spark.Spark; //REST API

public class JSON_Saver
{
  public static void main(String[] args)
  {
    Spark.port(5050);

    Spark.get("//eksportedbolig-data.json", (request, response) -> {
      String jsonData = JsonDataLoader.loadJsonData("eksportedbolig-data.json");
      response.type("application/json");
      return jsonData;
    });

    Spark.get("/eksportedvejbygning-data.json", (request, response) -> {
      String jsonData = JsonDataLoader.loadJsonData(
          "eksportedvejbygning-data.json");
      response.type("application/json");
      return jsonData;
    });

    Spark.get("/eksportedindustri-data.json", (request, response) -> {
      String jsonData = JsonDataLoader.loadJsonData(
          "eksportedindustri-data.json");
      response.type("application/json");
      return jsonData;
    });

    Spark.get("/eksportedkommercielle-data.json", (request, response) -> {
      String jsonData = JsonDataLoader.loadJsonData(
          "eksportedkommercielle-data.json");
      response.type("application/json");
      return jsonData;
    });
    enableCORS();
  }

  private static void enableCORS()
  {
    Spark.before((request, response) -> {
      response.header("Access-Control-Allow-Origin", "*");
      response.header("Access-Control-Request-Method", "*");
      response.header("Access-Control-Allow-Headers", "*");
    });
  }
}
