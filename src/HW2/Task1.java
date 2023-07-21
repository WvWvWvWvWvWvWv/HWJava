package HW2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class Task1 {

    static Logger logger;
    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        createLogger();

        String s1=sb(replace(json));

        writeToFile(s1);

        closeLogger();
    }

    private static String replace(String json) {
        String s=json.replaceAll("фамилия","");
        s=s.replaceAll("оценка","");
        s=s.replaceAll("предмет","");
        s=s.replaceAll("\"","");
        s=s.replaceAll("}","");
        s=s.replaceAll("\\{","");
        s=s.replaceAll("\\[","");
        s=s.replaceAll("]","");
        s=s.replaceAll(",","");
        return s;
    }

    private static void writeToFile(String s1) {
        String filepath="src/HW2/File.txt";
        try {
            FileWriter writer=new FileWriter(filepath);
            writer.write(s1);
            writer.close();
            logger.info("Запись успешно выполнена");
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning("Не удалось записать файл");
        }

    }
    static String sb(String line){
        StringBuilder stringBuilder=new StringBuilder();
        String[] words = line.split(":");
        for (int i = 1; i < words.length; i+=3) {
            stringBuilder.append("Студент ");
            stringBuilder.append(words[i]);
            stringBuilder.append(" получил ");
            stringBuilder.append(words[i+1]);
            stringBuilder.append(" по предмету ");
            stringBuilder.append(words[i+2]);
            stringBuilder.append("\n");
            
        }return stringBuilder.toString();
    }
    private static void closeLogger() {
        for(Handler handler:logger.getHandlers()){
            handler.close();
        }
    }

    private static void createLogger() {
        logger= Logger.getAnonymousLogger();
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("src/HW2/log.txt",true);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}