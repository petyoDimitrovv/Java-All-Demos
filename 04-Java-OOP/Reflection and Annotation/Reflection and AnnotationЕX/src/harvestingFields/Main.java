package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Field[] declaredFields = RichSoilLand.class.getDeclaredFields();

		String command;

		while (!(command = scanner.nextLine()).equals("HARVEST")) {

			for (Field declaredField : declaredFields) {
				String modifieraName = Modifier.toString(declaredField.getModifiers());
				if (command.equals(modifieraName) || command.equals("all")) {
					System.out.println(modifieraName + " " +
							declaredField.getType().getSimpleName() + " " +
							declaredField.getName());

				}
			}
		}
	}
}