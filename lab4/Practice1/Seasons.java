package ru.mirea.lab4;

public class Seasons {
    public enum season{
        autumn(6),
        winter(-6){
            @Override
            public String getDescription() {
                return "Холодное время года";
            }
        },
        spring(8),
        summer(18);

        private final int temperature;

        private season(int temperature){
            this.temperature = temperature;
        }
        public String getDescription(){
                return "Тёплое время года";
        }
    }

    public static void main(String[] args) {
        System.out.println(season.winter);
        infoSeasons(season.winter);
        for (season season : season.values()){
            System.out.println(season + " " + season.temperature + " " + season.getDescription());
        }
    }

    public static void infoSeasons(season season){
        switch (season){
            case autumn -> System.out.println("Унылая пора! Очей очарованье!");
            case spring -> System.out.println("Весна, весна, пора любви, Как тяжко мне твоё явленье!");
            case summer -> System.out.println("Ох, лето красное! любил бы я тебя, Когда б не зной, да пыль, да комары, да мухи.");
            case winter -> System.out.println("Это моё любимое время года");
        }
    }
}
