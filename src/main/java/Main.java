import ru.netology.javaqa.Java_8_3.statistic.StatisticsService;

public class Main {

    public static void main(String[] args) {
        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        StatisticsService service = new StatisticsService();

        long current_max = service.findMax(incomes);
        System.out.println(current_max);
    }
}