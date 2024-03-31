import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ToyStoreGame {
    private final PriorityQueue<ArrayList<Toys>> queue;

    public ToyStoreGame() {
        queue = new PriorityQueue<>((t1, t2) -> t2.getFirst().getFrequency() - t1.getFirst().getFrequency());
    }

    public void put(ArrayList<Toys> toys) {
        this.queue.add(toys);
    }
    public Queue<ArrayList<Toys>> getQueue(){
        return queue;
    }

    public Toys getToy() throws IOException {
        if (!getQueue().isEmpty()) {
            Random random = new Random();
            Toys randomToy;
            randomToy = getQueue().element().remove(random.nextInt(getQueue().poll().size()));
            Logger logger = new Logger();
            logger.getLogger(randomToy);
            return randomToy;
            } else {
            return null;
        }

    }
    public void FileWriter(Toys ToyStore) throws IOException {
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write("writer" + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The toy is: " + getToy().getFrequency());
    }


}