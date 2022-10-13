import java.util.ArrayList;

public class Task implements Runnable{
    public int chunks;
    public int divider;
    public int min;

    public ArrayList<Integer> numbersDevide = new ArrayList<>();

    public Task(int chunks, int divider) {
        this.chunks = chunks;
        this.divider = divider;
        this.min = min;
        this.numbersDevide = numbersDevide;

    }

    @Override
    public void run() {
        if ((chunks%divider) == 0){
            numbersDevide.add(chunks);
        }

        for (int i : numbersDevide)
        {
            System.out.println(i);
        }
    }
}
