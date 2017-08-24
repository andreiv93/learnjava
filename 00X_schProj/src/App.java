public class App {
    public static void main(String[] args) {

        College college1 = new College("Nicolae Iorga", "tehnic", false, 300, 7.00f, new char[] {'A','B','C'}, 50, "Braila");
        College college2 = new College("Nicolae Balcescu", "mate-info", true, 150, 9.00f, new char[] {'A','B'}, 30, "Galati");
        College college3 = new College("Panait Cerna", "stiinte sociale", false, 200, 6.00f, new char[] {'A','B','C','D'}, 40, "Iasi");
        Class class1 = new Class("Informatica", 'A');
        Class class2 = new Class("Psihologie", 'D');
        Class class3 = new Class("Prelucrarea metalului", 'C');
        Staff staff1 = new Staff("Casier", "Gheorghe Marinela");
        Staff staff2 = new Staff("Paznic", "Georgel Florin");
        Staff staff3 = new Staff("Salubritate", "Marinela Georgescu");
        Teacher constantin = new Teacher("Constantin", 40, 10);
        Teacher elena = new Teacher("Elena", 35, 5);
        Teacher iacob = new Teacher("Iacob", 45, 15);
        Student andrei = new Student("Andrei", 8.50f, 17, "Sc. nr. 1", new float[] {6.30f, 7.40f, 9.50f});
        Student stefan = new Student("Stefan", 9.90f, 19, "Sc. nr. 5", new float[] {9.00f, 9.95f, 9.70f});
        Student adrian = new Student("Adrian", 7.00f, 14, "Sc. nr. 7", new float[] {5.50f, 8.00f, 7.40f});

        System.out.println("Media lui Andrei este: " + andrei.calculateAvg());
        college1.accepts(andrei);
        college2.availableClasses(new Class[] {class1, class2, class3});
    }
}
