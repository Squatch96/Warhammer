import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String provinceList = readUsingScanner("src/provinceList.json");
        JsonParser jsonParser = new JsonParser();

        JsonElement element = jsonParser.parse(provinceList);
        ArrayList<String> provinces = new ArrayList<String>();
        provinces = parseProvinces(element);
        System.out.println("Test");
    }

    private static ArrayList<String> parseProvinces(JsonElement element) {
        System.out.println("test");
        ArrayList<String> test = new ArrayList<String>();
        JsonObject testObject = element.getAsJsonObject();
        JsonArray jsonArray = new JsonArray();
        System.out.println("Test");





        return test;
    }

    private static String readUsingScanner(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
            // we can use Delimiter regex as "\\A", "\\Z" or "\\z"
            String data = scanner.useDelimiter("\\A").next();
            return data;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (scanner != null)
                scanner.close();
        }

    }
}