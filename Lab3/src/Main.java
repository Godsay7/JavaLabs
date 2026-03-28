void main() {

    Bus myBus1 = new Bus();
    Bus myBus2 = new Bus("Ronnie", "Coleman", "0123", 13, "Mercedes", 10, 130000);
    Bus myBus3 = new Bus("Cory", "Sandhagen", "9238", 48, "Volvo", 7, 90000);
    Bus myBus4 = new Bus("Larry", "Chanko", "1337", 13, "Ataman", 17, 210000);
    Bus myBus5 = new Bus("Han", "Marty", "9090", 92, "Mercedes", 9, 105000);
    myBus1.AddBus();
    ArrayList<Bus> listOfBus = new ArrayList<Bus>();
    listOfBus.add(myBus1);
    listOfBus.add(myBus2);
    listOfBus.add(myBus3);
    listOfBus.add(myBus4);
    listOfBus.add(myBus5);

    UI.defineRoute(listOfBus);
    UI.defineYear(listOfBus);
    UI.defineMileage(listOfBus);

}
