package Homework_4;

public class Park {

    private String name;
    private String city;
    private Attraction [] attractions;

    public Park(String name, String city, Attraction[] attractions) {
        this.name = name;
        this.city = city;
        this.attractions = attractions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Attraction[] getAttractions() {
        return attractions;
    }

    public void setAttractions(Attraction[] attractions) {
        this.attractions = attractions;
    }

    @Override
    public String toString() {
        String info = "Парк " +
                "\"" + name + "\"" +
                ", г. " + city +
                ", список атракционов: \n";
        StringBuilder attr = new StringBuilder();
        for(Attraction attraction : attractions) {
            attr.append(attraction.toString()).append("\n");
        }
        return info + attr.toString();
    }

    public static class Attraction {
        private String name;
        private String description;
        private String workingTime;
        private double price;

        public Attraction(String name, String description, String workingTime, double price) {
            this.name = name;
            this.description = description;
            this.workingTime = workingTime;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getWorkingTime() {
            return workingTime;
        }

        public void setWorkingTime(String workingTime) {
            this.workingTime = workingTime;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Атракцион " +
                    "\"" + name + "\"" +
                    ", описание: " + description +
                    ", время работы: " + workingTime +
                    ", цена: " + price + " руб.";
        }
    }

    public static void main(String[]args){

        Attraction [] attractions = {
                new Attraction("Чертово колесо", "", "круглосуточно", 200.0),
                new Attraction("Дом ужасов", "", "10:00 - 18:00", 150.0),
                new Attraction("Американские горки", "", "9:00 - 15:00", 400.0),
        };

        Park park = new Park("Кырлай", "Казань", attractions);
        System.out.println(park);
    }
}