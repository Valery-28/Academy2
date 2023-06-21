package homeWorks.homeWork4.task8;
/*
Имеется два файла (INPUT_1 и INPUT_2). В третий (OUTPUT) необходимо
записать только те строки, которые есть и в первом, и во втором.
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> documentFirst = new HashSet<>();
        Set<String> documentSecond = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(
                "D:\\2chance\\Academy\\src\\homeWorks\\homeWork4\\task8\\files\\INPUT_1"),
                StandardCharsets.UTF_8))) {
            String lineOne;
            while ((lineOne = reader.readLine()) != null) {
                documentFirst.add(lineOne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(
                "D:\\2chance\\Academy\\src\\homeWorks\\homeWork4\\task8\\files\\INPUT_2"),
                StandardCharsets.UTF_8))) {
            String lineTwo;
            while ((lineTwo = reader.readLine()) != null) {
                documentSecond.add(lineTwo);
            }
        } catch (IOException ignored) {
        }
        try (BufferedWriter br = new BufferedWriter(new FileWriter(
                "D:\\2chance\\Academy\\src\\homeWorks\\homeWork4\\task8\\files\\OUTPUT"))) {
            for (String row1 : documentFirst) {
                for (String row2 : documentSecond) {
                    if (row1.equals(row2)) {
                        br.write(row1);
                        br.write("\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}