package Homework_7;

import com.opencsv.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RWCSVFile {
    public static final String CSVFile = "CSVFile.csv";

    public static void saveDataToFile(AppData data) {
        // создание объекта, указывающего путь к файлу
        File file = new File(CSVFile);

        try {
            // создание объекта FileWriter с именем файла в качестве параметра
            FileWriter outputfile = new FileWriter(file);

            // создание CSVWriter с ';' в качестве разделителя
            CSVWriter writer = new CSVWriter(outputfile, ';',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);

            // Создание списка с массивами строк для записи данных в CSV-файл
            List<String[]> allData = new ArrayList<>();

            // Создание заголовка
            data.setHeader(new String[]{"Value1", "Value2", "Value3"});
            //  writer.writeNext(data.getHeader());

            // Добавление заголовка в список данных
            allData.add(data.getHeader());

            // Создание двумерного массива целых чисел
            data.setData(new int[][]{{100, 200, 300}, {400, 500, 600}, {700, 800, 900}});

            // Добавление в список строковых значений чисел массива
            for (int i = 0; i < data.getData().length; i++) {
                String[] numsAsString = new String[data.getData()[i].length];
                for (int j = 0; j < data.getData()[i].length; j++) {
                    numsAsString[j] = String.valueOf(data.getData()[i][j]);
                }
                allData.add(numsAsString);
            }

            // Запись всех данных в CSV-файл
            writer.writeAll(allData);

            // Закрываем файл для записи
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readDataFromFile(String file) {
        try {
            // Создание объекта filereader
            // с именем файла в качестве параметра
            FileReader filereader = new FileReader(file);

            // Создание объекта csvParser с
            // разделителем в виде ";"
            CSVParser parser = new CSVParserBuilder()
                    .withSeparator(';')
                    .build();

            // Создание объекта csvReader с
            // параметрами filereader и parser
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(parser)
                    .build();

            // Считывание всех данных из CSV-файла
            List<String[]> allData = csvReader.readAll();

            // Печать содержимого файла
            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}