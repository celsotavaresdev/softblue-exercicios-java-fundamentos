

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Aula09Exercicio3 {

	public static void main(String[] args) {
		
		LocalDate birthday = LocalDate.of(1955, 5, 19);
		LocalDate today = LocalDate.now();
		
		Period period = Period.between(birthday, today);
		System.out.println(String.format("%d anos, %d meses e %d dias", period.getYears(), period.getMonths(), period.getDays()));
		
		LocalTime earlier = LocalTime.of(3, 0);
		LocalTime now = LocalTime.now();
		
		Duration duration = Duration.between(earlier, now);
		System.out.println(String.format("%d segundos", duration.getSeconds()));
	}
}
