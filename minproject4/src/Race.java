public class Race {

    public static volatile boolean raceWon = false;

    public static void main(String[] args) {
        Racer tortoiseRacer = new Racer();
        Racer hareRacer = new Racer();
        Thread tortoise = new Thread(tortoiseRacer, "Tortoise");
        Thread hare = new Thread(hareRacer, "Hare");

        System.out.println("The race is about to begin!");
        System.out.println("--- Starting Scenario A: Normal Race ---");
        tortoise.start();
        hare.start();


    }
}


class Racer implements Runnable {

    @Override
    public void run() {
        for (int distance = 1; distance <= 100; distance++) {
            if (Race.raceWon) {
                System.out.println(Thread.currentThread().getName() + " has lost the race.");
                break; 
            }

            System.out.println(Thread.currentThread().getName() + " has run " + distance + " meters.");

            if (Thread.currentThread().getName().equals("Hare") && distance == 60) {
                try {
                    System.out.println(">>> The Hare is getting cocky and takes a nap... <<<");
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (distance == 100) {
                if (!Race.raceWon) {
                    Race.raceWon = true;
                    System.out.println("🎉 WINNER IS: " + Thread.currentThread().getName() + "! 🎉");
                }
            }
        }
    }
}