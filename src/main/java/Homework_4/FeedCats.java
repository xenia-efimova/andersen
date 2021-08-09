package Homework_4;

    public class FeedCats {
        private static int TIME = 0;
        public static void main(String[] args) {
            Kot[] kot = new Kot[3];
            kot[0] = new Kot("Сарделька", 150, 3);
            kot[1] = new Kot("Василий", 100, 4);
            kot[2] = new Kot("Пушок", 30, 1);
            Plate plate = new Plate(700);
            System.out.println("Привет! У Вас есть три кота: " + kot[0].getName() + ", " + kot[1].getName() + " и " + kot[2].getName() + ", которые хотят есть каждые " + kot[0].getSatietyTime() + ", " + kot[1].getSatietyTime() + " и " + kot[2].getSatietyTime() + " час(а) соответственно.");
            System.out.println("Кто-то из них более прожорлив, кто-то менее. Сейчас в миске " + plate.getFood() + " грамм кошачьего корма. Посмотрим насколько его хватит, в данный момент коты очень голодны и направляются трапезничать.\n");

            do {
                for (Kot i : kot) {

                    //если кот голоден
                    if (i.getSatiety() == 0) {

                        //если в миске не хватает еды, чтобы накормить кота, она будет добавлена
                        if (!plate.checkFood(i.getAppetite())) {
                            plate.increaseFood();
                        }

                        //кот ест
                        i.eat(plate);
                        System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа(ов)");
                    }

                    //декрементация показателя сытости
                    i.setSatiety(i.getSatiety() - 1);
                }
                System.out.println("\nС момента начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + plate.getFood() + " граммов корма.\n");
                TIME++;

            } while (TIME <= 24);
        }
    }

