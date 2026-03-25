public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder namesBuilder = new StringBuilder();

        for (String name : args) {
            if (namesBuilder.length() > 0) {
                namesBuilder.append(", ");
            }
            namesBuilder.append(name);
        }

        System.out.println("Hello, " + namesBuilder.toString() + "!");
    }
}
