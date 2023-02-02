import java.util.*;
import java.io.*;



public class HomeWork4 {
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
                //System.out.println(s);
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
        System.out.println("Список имен: " + First_name);
        System.out.println("Список отчеств: " + Second_name);
        System.out.println("Список фамилий: " + Last_name);
        System.out.println("Список возрастов: " + Age);
        System.out.println("Список полов: " + Gender);

        // Отсортировать по возрасту используя дополнительный список индексов.
        // Копируем исходный список
        ArrayList<String> Sorted_List = new ArrayList<>(Age);
        Collections.sort(Sorted_List);
        ArrayList<Integer> List_of_indexs = new ArrayList<>();
        for (String i: Sorted_List) {
            int index = Age.indexOf(i);
            List_of_indexs.add(index);



        }
        System.out.println("Список отсортированных по индексам: " + List_of_indexs);

        System.out.println("Отсортированный список возроста: " + Sorted_List);
    }
}
