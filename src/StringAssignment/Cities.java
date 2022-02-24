package StringAssignment;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = { "Toronto", "Mississauga", "Brampton", "Milton", "Oakville" };
             int counter=0;
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].contains("Toronto")) {
            counter++;
				System.out.println("City  name found ");
				break;
			} else {
				System.out.println("City not found in the list");
			}

		}

		String cityName = "Toronto";
		System.out.println("New city name:" + cityName.replace("Toronto", "Mississauga"));

		String str = "100 queen street,Toronto,M5V 3E3";
		String streetAddress = str.substring(0, str.indexOf(","));
		System.out.println("streetAddress:" + streetAddress);
		String city = str.substring(str.indexOf("Toronto,"), str.lastIndexOf(","));
		System.out.println("City:" + city);
		String zip = str.substring(str.lastIndexOf("M5V 3E3"));
		System.out.println("Zip:" + zip);
	}
}
