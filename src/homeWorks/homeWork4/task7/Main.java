package homeWorks.homeWork4.task7;
/*
Прочитать файл (INPUT), в выходной файл (OUTPUT) записать все
строки из первого, но в обратном порядке (первая строка должна быть последней).
*/
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOError, ClassCastException, IOException {
        List<String> documentRows = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(
                "D:\\2chance\\Academy\\src\\homeWorks\\homeWork4\\task7\\files\\INPUT"), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                documentRows.add(line);
            }
        } catch (IOException ignored) {

        }
        Collections.reverse(documentRows);
        try (BufferedWriter br = new BufferedWriter(new FileWriter(
                "D:\\2chance\\Academy\\src\\homeWorks\\homeWork4\\task7\\files\\OUTPUT"))) {
            for (String row :
                    documentRows) {
                br.write(row);
                br.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
