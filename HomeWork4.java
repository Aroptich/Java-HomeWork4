import java.util.*;
import java.io.*;



public class ClassWork2 {
    public static void main(String[] args) {
        // Сохранить в файл строку используя класс FileWriter
        try(FileWriter writer = new FileWriter("test.txt", false))
        {
            writer.write("Иванов Иван Иванович 40 М" + "\n");
            writer.write("Ларина Юлия Сергеевна 29 Ж" + "\n");
            writer.write("Сергеев Павел Юрьевич 35 М" + "\n");
            writer.write("Паномарев Аркадий Леонидович 48 М" + "\n");
            writer.write("Галкина Инна Владимировна 32 Ж" + "\n");
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        List<String> First_name = new ArrayList<>();
        List<String> Second_name = new ArrayList<>();
        List<String> Last_name = new ArrayList<>();
        List<String> Age = new ArrayList<>();
        List<String> Gender = new ArrayList<>();
        // Загрузить из файла строку с выводом в консоль используя класс FileReader
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt")))
        {
            // Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
            String s;
            while((s=br.readLine())!=null){
                // Фамилии, имена, отчества, возрас и пол сохраняем в отдельных списках.
                System.out.println(s);
                // Риазбиение каждой строки по пробелу и создание списка
                String[] words = s.split(" ");
                First_name.add(words[0]);
                Second_name.add(words[1]);
                Last_name.add(words[2]);
                Age.add(words[3]);
                Gender.add(words[4]);

            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println(First_name);
        System.out.println(Second_name);
        System.out.println(Last_name);
        System.out.println(Age);
        System.out.println(Gender);
    }
}
