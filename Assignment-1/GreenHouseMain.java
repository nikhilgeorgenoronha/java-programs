class Greenhouse {
    private String id;
    private double temperature, humidity, soilmoisture, light;

    Greenhouse(String id) {
        this.id = id;
    }

    Greenhouse(String id, double t, double h, double s, double l) {
        this.id = id;
        temperature = t;
        humidity = h;
        soilmoisture = s;
        light = l;
    }

    void setscore(int condition, double score) {
        score = Math.max(0, Math.min(100, score));

        if (condition == 1) {
            temperature = score;
        } else if (condition == 2) {
            humidity = score;
        } else if (condition == 3) {
            soilmoisture = score;
        } else if (condition == 4) {
            light = score;
        }
    }

    void adjustscore(int condition, double points) {
        if (condition == 1) {
            setscore(1, temperature + points);
        } else if (condition == 2) {
            setscore(2, humidity + points);
        } else if (condition == 3) {
            setscore(3, soilmoisture + points);
        } else if (condition == 4) {
            setscore(4, light + points);
        }
    }

    void adjustscore(int c1, double p1, int c2, double p2) {
        adjustscore(c1, p1);
        adjustscore(c2, p2);
    }

    double average() {
        return (temperature + humidity + soilmoisture + light) / 4.0;
    }

    double highest() {
        return Math.max(
            Math.max(temperature, humidity),
            Math.max(soilmoisture, light)
        );
    }

    double lowest() {
        return Math.min(
            Math.min(temperature, humidity),
            Math.min(soilmoisture, light)
        );
    }

    double difference() {
        return highest() - lowest();
    }

    boolean approved() {
        return average() > 70 &&
               temperature > 50 &&
               humidity > 50 &&
               soilmoisture > 50 &&
               light > 50;
    }

    void display() {
        System.out.println("Greenhouse = " + id);
        System.out.println("temperature = " + temperature);
        System.out.println("humidity = " + humidity);
        System.out.println("soilmoisture = " + soilmoisture);
        System.out.println("light = " + light);
        System.out.println("average = " + average());
        System.out.println("highest = " + highest());
        System.out.println("lowest = " + lowest());
        System.out.println("difference = " + difference());
        System.out.println();
    }
}

public class GreenHouseMain {
    public static void main(String[] args) {

        Greenhouse g1 = new Greenhouse("G101", 80, 75, 90, 80);
        Greenhouse g2 = new Greenhouse("G102", 65, 70, 80, 75);
        Greenhouse g3 = new Greenhouse("G103", 90, 85, 90, 95);

        Greenhouse[] g = {g1, g2, g3};

        g1.adjustscore(1, 5);
        g2.adjustscore(2, 4);
        g3.adjustscore(1, 5, 3, -5);

        System.out.println("PERFORMANCE SUMMARY");

        for (Greenhouse x : g) {
            x.display();
        }

        System.out.println("Approved Greenhouse");

        for (Greenhouse x : g) {
            if (x.approved()) {
                System.out.println("average = " + x.average());
            }
        }

        double best = 0;

        for (Greenhouse x : g) {
            if (x.approved() && x.average() > best) {
                best = x.average();
            }
        }

        System.out.println("Best average = " + best);
    }
}