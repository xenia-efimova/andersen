package Homework_7;

public class IOTest {
    public static void main(String[] args) {
        AppData appData = new AppData();
        RWCSVFile.saveDataToFile(appData);
        RWCSVFile.readDataFromFile(RWCSVFile.CSVFile);
    }
}