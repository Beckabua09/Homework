import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Integer> numbers = new ArrayList<>();
    private static ArrayList<String> mistake = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("In wieviele Chunks wollen sie die Liste aufteilen?");
        System.out.print("chunks: ");
        int chunks = sc.nextInt();
        System.out.println("Geben Sie nun den Divider ein.");
        System.out.print("divider: ");
        int divider = sc.nextInt();
        getNumbers();
        for (int i : numbers){
            Task task = new Task(i, divider);
            task.run();
        }
    }

    public static void getNumbers() {
        try (BufferedReader br = new BufferedReader(new FileReader("numbers.csv")))
        {
            String line = br.readLine();
            String[] parts = line.split(":");

            while(line != null){
                for (String s : parts){
                    try {
                        numbers.add(Integer.parseInt(s));
                    }catch (Exception ex){
                        mistake.add(s);
                    }
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}